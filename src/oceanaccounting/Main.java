/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oceanaccounting;

// IMPORT LIBRARY
import java.sql.*;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    private Connection con;
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private FileHandler handler;
    
    public Main() {
        initComponents();
        
        try {
            handler = new FileHandler("src\\logs\\log_files%g_%u.log",
                    100000, 10);
            LOGGER.addHandler(handler);
            LOGGER.setLevel(Level.FINER);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException | SecurityException e) {
            System.err.format("Initializing handler failed: %s", e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        subBasePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        header_lbl = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        newProfilePanel = new javax.swing.JPanel();
        companyName_lbl = new javax.swing.JLabel();
        address_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        phone_lbl = new javax.swing.JLabel();
        fax_lbl = new javax.swing.JLabel();
        currency_lbl = new javax.swing.JLabel();
        companyName_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        fax_txt = new javax.swing.JTextField();
        currency_cb = new javax.swing.JComboBox<>();
        okNewProfile_btn = new javax.swing.JButton();
        cancelNewProfile_btn = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        newProfile_lbl = new javax.swing.JLabel();
        openProfile_lbl = new javax.swing.JLabel();
        exirContent_lbl = new javax.swing.JLabel();
        newProfile_btn = new javax.swing.JButton();
        openProfile_btn = new javax.swing.JButton();
        exitProfile_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel() {

            public void paintComponent(Graphics g) {
                ImageIcon img = new ImageIcon("src\\imagesource\\login_bg.png");
                Image image = img.getImage();

                g.drawImage(image, 0, 0, this.getSize().width,
                    this.getSize().height, this);
            }
        };
        userLogo_lbl = new javax.swing.JLabel();
        okLogin_btn = new javax.swing.JButton();
        cancelLogin_btn = new javax.swing.JButton();
        username_lbl = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        password_pf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        basePanel.setLayout(new java.awt.CardLayout());

        subBasePanel.setOpaque(false);
        subBasePanel.setPreferredSize(new java.awt.Dimension(640, 480));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        header_lbl.setBackground(new java.awt.Color(102, 204, 255));
        header_lbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        header_lbl.setForeground(new java.awt.Color(255, 255, 255));
        header_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/ocean2_logo.png"))); // NOI18N
        header_lbl.setText("Ocean Accounting");
        header_lbl.setOpaque(true);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(header_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(640, 330));
        contentPanel.setLayout(new java.awt.CardLayout());

        newProfilePanel.setBackground(new java.awt.Color(255, 255, 255));
        newProfilePanel.setPreferredSize(new java.awt.Dimension(640, 330));

        companyName_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        companyName_lbl.setForeground(new java.awt.Color(51, 153, 255));
        companyName_lbl.setText("Nama Perusahaan*");

        address_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        address_lbl.setForeground(new java.awt.Color(51, 153, 255));
        address_lbl.setText("Alamat*");

        email_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        email_lbl.setForeground(new java.awt.Color(51, 153, 255));
        email_lbl.setText("Email*");

        phone_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        phone_lbl.setForeground(new java.awt.Color(51, 153, 255));
        phone_lbl.setText("Nomor Telepon*");

        fax_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        fax_lbl.setForeground(new java.awt.Color(51, 153, 255));
        fax_lbl.setText("Fax");

        currency_lbl.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        currency_lbl.setForeground(new java.awt.Color(51, 153, 255));
        currency_lbl.setText("Kurs");

        currency_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDR" }));

        okNewProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/ok1.png"))); // NOI18N
        okNewProfile_btn.setBorderPainted(false);
        okNewProfile_btn.setContentAreaFilled(false);
        okNewProfile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/ok2.png"))); // NOI18N
        okNewProfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okNewProfile_btnActionPerformed(evt);
            }
        });

        cancelNewProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/cancel1.png"))); // NOI18N
        cancelNewProfile_btn.setBorderPainted(false);
        cancelNewProfile_btn.setContentAreaFilled(false);
        cancelNewProfile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/cancel2.png"))); // NOI18N
        cancelNewProfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelNewProfile_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newProfilePanelLayout = new javax.swing.GroupLayout(newProfilePanel);
        newProfilePanel.setLayout(newProfilePanelLayout);
        newProfilePanelLayout.setHorizontalGroup(
            newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newProfilePanelLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProfilePanelLayout.createSequentialGroup()
                        .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(companyName_lbl)
                            .addComponent(address_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fax_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currency_lbl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(53, 53, 53)
                        .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fax_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyName_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currency_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newProfilePanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(okNewProfile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(cancelNewProfile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        newProfilePanelLayout.setVerticalGroup(
            newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyName_lbl)
                    .addComponent(companyName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address_lbl)
                    .addComponent(address_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_lbl)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_lbl)
                    .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fax_lbl)
                    .addComponent(fax_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currency_lbl)
                    .addComponent(currency_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okNewProfile_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelNewProfile_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(54, 54, 54))
        );

        contentPanel.add(newProfilePanel, "card3");

        profilePanel.setBackground(new java.awt.Color(255, 255, 255));

        newProfile_lbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newProfile_lbl.setText("Profil Baru");

        openProfile_lbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        openProfile_lbl.setText("Buka Profil");

        exirContent_lbl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        exirContent_lbl.setText("Keluar");

        newProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/add1_icon1.png"))); // NOI18N
        newProfile_btn.setBorderPainted(false);
        newProfile_btn.setContentAreaFilled(false);
        newProfile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/add1_icon2.png"))); // NOI18N
        newProfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProfile_btnActionPerformed(evt);
            }
        });

        openProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/profile_icon1.png"))); // NOI18N
        openProfile_btn.setBorderPainted(false);
        openProfile_btn.setContentAreaFilled(false);
        openProfile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/profile_icon2.png"))); // NOI18N
        openProfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProfile_btnActionPerformed(evt);
            }
        });

        exitProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/exit_icon1.png"))); // NOI18N
        exitProfile_btn.setBorderPainted(false);
        exitProfile_btn.setContentAreaFilled(false);
        exitProfile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/exit_icon2.png"))); // NOI18N
        exitProfile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProfile_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(newProfile_lbl)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newProfile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(openProfile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(exitProfile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profilePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(openProfile_lbl)
                        .addGap(116, 116, 116)
                        .addComponent(exirContent_lbl)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitProfile_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openProfile_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newProfile_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProfile_lbl)
                    .addComponent(openProfile_lbl)
                    .addComponent(exirContent_lbl))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        contentPanel.add(profilePanel, "card2");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        contentPanel.add(jPanel1, "card4");

        javax.swing.GroupLayout subBasePanelLayout = new javax.swing.GroupLayout(subBasePanel);
        subBasePanel.setLayout(subBasePanelLayout);
        subBasePanelLayout.setHorizontalGroup(
            subBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subBasePanelLayout.setVerticalGroup(
            subBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subBasePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        basePanel.add(subBasePanel, "card3");

        loginPanel.setPreferredSize(new java.awt.Dimension(640, 480));

        userLogo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/login_logo.png"))); // NOI18N

        okLogin_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/ok1.png"))); // NOI18N
        okLogin_btn.setBorderPainted(false);
        okLogin_btn.setContentAreaFilled(false);
        okLogin_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/ok2.png"))); // NOI18N
        okLogin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okLogin_btnActionPerformed(evt);
            }
        });

        cancelLogin_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/cancel1.png"))); // NOI18N
        cancelLogin_btn.setBorderPainted(false);
        cancelLogin_btn.setContentAreaFilled(false);
        cancelLogin_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/cancel2.png"))); // NOI18N

        username_lbl.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        username_lbl.setForeground(new java.awt.Color(51, 153, 255));
        username_lbl.setText("Username");

        password_lbl.setFont(new java.awt.Font("Century", 1, 11)); // NOI18N
        password_lbl.setForeground(new java.awt.Color(51, 153, 255));
        password_lbl.setText("Password");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_lbl)
                            .addComponent(username_lbl))
                        .addGap(26, 26, 26)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(password_pf)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(okLogin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cancelLogin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userLogo_lbl)
                .addGap(267, 267, 267))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(userLogo_lbl)
                .addGap(44, 44, 44)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_lbl)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_lbl)
                    .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okLogin_btn)
                    .addComponent(cancelLogin_btn))
                .addGap(111, 111, 111))
        );

        basePanel.add(loginPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okLogin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okLogin_btnActionPerformed
        String username = username_txt.getText();
        String password = new String(password_pf.getPassword());
        boolean isConnected = dbOpenCon(username, password);
        if (isConnected == true){ 
            changePanel(basePanel, subBasePanel);
        } else {
            username_txt.setText(null);
            password_pf.setText(null);
        }
    }//GEN-LAST:event_okLogin_btnActionPerformed

    private void newProfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProfile_btnActionPerformed
        changePanel(contentPanel, newProfilePanel);
    }//GEN-LAST:event_newProfile_btnActionPerformed

    private void cancelNewProfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelNewProfile_btnActionPerformed
        changePanel(contentPanel, profilePanel);
    }//GEN-LAST:event_cancelNewProfile_btnActionPerformed

    private void exitProfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProfile_btnActionPerformed
        dbCloseCon();
        System.exit(0);
    }//GEN-LAST:event_exitProfile_btnActionPerformed

    private void okNewProfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okNewProfile_btnActionPerformed
        String companyName = companyName_txt.getText();
        if (companyName == null || address_txt.getText() == null ||
                email_txt.getText() == null || phone_txt.getText() == null) {
            JOptionPane.showMessageDialog(null, "Field bertanda * wajib diisi.");
            return;
        }
        String filePath = String.format("src\\profile\\%s.oprf", companyName);
        if (new File(filePath).exists())
            JOptionPane.showMessageDialog(null, "Profil sudah ada.");
        else {
            Path file = Paths.get("src\\profile\\" + companyName + ".oprf");
            Charset charset = Charset.forName("US-ASCII");
            String str = String.format("%s\n%s\n%s\n%s\n%s\n%s", companyName,
                    address_txt.getText(), email_txt.getText(), phone_txt.getText(), 
                    fax_txt.getText(), (String)currency_cb.getSelectedItem());
            try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
                writer.write(str, 0, str.length());
                createDb(companyName);
                useDb(companyName);
                JOptionPane.showMessageDialog(null, "Profil berhasil dibuat.");
                changePanel(contentPanel, jPanel1);
            } catch (IOException e) {
                LOGGER.warning(String.format("%s", e));
            }
        }
    }//GEN-LAST:event_okNewProfile_btnActionPerformed

    private void openProfile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProfile_btnActionPerformed
        System.out.println(chooseProfilePane());
    }//GEN-LAST:event_openProfile_btnActionPerformed
    
    private boolean dbOpenCon(String user, String pass) {
        LOGGER.entering(getClass().getName(), "dbOpenCon");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", user, pass);
            LOGGER.exiting(getClass().getName(), "dbOpenCon", "return true");
            return true;
        } catch (ClassNotFoundException | IllegalAccessException 
                | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password salah.");
            LOGGER.warning(String.format("%s", e));
            LOGGER.exiting(getClass().getName(), "dbOpenCon", "return false");
            return false;
        }
    }
    
    private void dbCloseCon() {
        LOGGER.entering(getClass().getName(), "dbCloseCon");
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Logout berhasil.");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Logout gagal! Silahkan coba lagi.");
            LOGGER.warning(String.format("%s", e));
        }
        LOGGER.exiting(getClass().getName(), "dbCloseCon");
    }
    
    private void createDb(String companyName) {
        LOGGER.entering(getClass().getName(), "createDb");
        try {
            Statement query = con.createStatement();
            query.execute(String.format("CREATE DATABASE %s_db", companyName));
        } catch (SQLException e) {
            LOGGER.warning(String.format("%s", e));
        }
        LOGGER.exiting(getClass().getName(), "createDb");
    }
    
    private void useDb(String companyName) {
        LOGGER.entering(getClass().getName(), "useDb");
        try {
            Statement query = con.createStatement();
            query.execute(String.format("USE %s_db", companyName));
        } catch (SQLException e) {
            LOGGER.warning(String.format("%s", e));
        }
        LOGGER.exiting(getClass().getName(), "useDb");
    }
    
    private void changePanel(JPanel base, JPanel panel) {
        LOGGER.entering(getClass().getName(), "changePanel");
        try {
            base.removeAll();
            base.repaint();
            base.revalidate();

            base.add(panel);
            base.repaint();
            base.revalidate();
        } catch (Exception e) {
            LOGGER.warning(String.format("%s", e));
        }
        LOGGER.exiting(getClass().getName(), "changePanel");
    }
    
    private String chooseProfilePane() {
        File profileFolder = new File("src\\profile");
        File[] listOfFiles = profileFolder.listFiles();
        Object[] profiles = new Object[listOfFiles.length];
        for (int i = 0; i < listOfFiles.length; i++)
            profiles[i] = listOfFiles[i].getName();
        String choice = (String)JOptionPane.showInputDialog(null, 
                "Pilih profil yang ada", "Pilih Profil", 
                JOptionPane.QUESTION_MESSAGE, null, profiles, profiles[0]);
        return choice;
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_lbl;
    private javax.swing.JTextField address_txt;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton cancelLogin_btn;
    private javax.swing.JButton cancelNewProfile_btn;
    private javax.swing.JLabel companyName_lbl;
    private javax.swing.JTextField companyName_txt;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JComboBox<String> currency_cb;
    private javax.swing.JLabel currency_lbl;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel exirContent_lbl;
    private javax.swing.JButton exitProfile_btn;
    private javax.swing.JLabel fax_lbl;
    private javax.swing.JTextField fax_txt;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel header_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel newProfilePanel;
    private javax.swing.JButton newProfile_btn;
    private javax.swing.JLabel newProfile_lbl;
    private javax.swing.JButton okLogin_btn;
    private javax.swing.JButton okNewProfile_btn;
    private javax.swing.JButton openProfile_btn;
    private javax.swing.JLabel openProfile_lbl;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JLabel phone_lbl;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel subBasePanel;
    private javax.swing.JLabel userLogo_lbl;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
