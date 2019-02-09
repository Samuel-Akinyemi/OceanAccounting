/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oceanaccounting;

// IMPORT LIBRARY
import java.sql.*;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OceanAccounting extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OceanAccounting() {
        initComponents();
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
        profilePanel = new javax.swing.JPanel();
        newProfile_lbl = new javax.swing.JLabel();
        openProfile_lbl = new javax.swing.JLabel();
        exirContent_lbl = new javax.swing.JLabel();
        newProfile_btn = new javax.swing.JButton();
        openProfile_btn = new javax.swing.JButton();
        exitProfile_btn = new javax.swing.JButton();
        newProfilePanel = new javax.swing.JPanel();
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

        openProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/profile_icon1.png"))); // NOI18N
        openProfile_btn.setBorderPainted(false);
        openProfile_btn.setContentAreaFilled(false);

        exitProfile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesource/exit_icon1.png"))); // NOI18N
        exitProfile_btn.setBorderPainted(false);
        exitProfile_btn.setContentAreaFilled(false);

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
                .addContainerGap(133, Short.MAX_VALUE))
        );

        contentPanel.add(profilePanel, "card2");

        newProfilePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout newProfilePanelLayout = new javax.swing.GroupLayout(newProfilePanel);
        newProfilePanel.setLayout(newProfilePanelLayout);
        newProfilePanelLayout.setHorizontalGroup(
            newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        newProfilePanelLayout.setVerticalGroup(
            newProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        contentPanel.add(newProfilePanel, "card3");

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
                .addContainerGap(83, Short.MAX_VALUE)
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
            .addGap(0, 480, Short.MAX_VALUE)
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
    
    public static boolean dbOpenCon(String user, String pass) {
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", user, pass);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException 
                | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Username atau Password salah.");
            return false;
        }
    }
    
    public void changePanel(JPanel base, JPanel panel) {
        base.removeAll();
        base.repaint();
        base.revalidate();
        
        base.add(panel);
        base.repaint();
        base.revalidate();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OceanAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OceanAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OceanAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OceanAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OceanAccounting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton cancelLogin_btn;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel exirContent_lbl;
    private javax.swing.JButton exitProfile_btn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel header_lbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel newProfilePanel;
    private javax.swing.JButton newProfile_btn;
    private javax.swing.JLabel newProfile_lbl;
    private javax.swing.JButton okLogin_btn;
    private javax.swing.JButton openProfile_btn;
    private javax.swing.JLabel openProfile_lbl;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel subBasePanel;
    private javax.swing.JLabel userLogo_lbl;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
