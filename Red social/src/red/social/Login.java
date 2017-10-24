/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package red.social;
import java.awt.Dimension;
import java.awt.Toolkit;
import static red.social.RedSocial.Fill;
import static red.social.FileManager.SEPARADOR;
import static red.social.FileManager.FRIENDS_FILE;
import static red.social.FileManager.FriendLength;

import java.util.regex.Pattern;

/**
 *
 * @author Krle__000
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
       //
//       FileManager.WriteFile(FRIENDS_FILE, Fill("krle_10|Mario|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("krle_10|Juana|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("krle_10|Pedro|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("krle_10|Alicia|1|20/10/2017|123|1", FriendLength));
//        FileManager.WriteFile(FRIENDS_FILE, Fill("krle_10|Ejemplo|1|20/10/2017|123|1", FriendLength));
//        FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo|krle_10|1|20/10/2017|123|1", FriendLength));
//        FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo|Mario|1|20/10/2017|123|1", FriendLength));

//       FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo2|Mario|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo2|Juana|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo2|Pedro|1|20/10/2017|123|1", FriendLength));
//       FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo2|Alicia|1|20/10/2017|123|1", FriendLength));
//        FileManager.WriteFile(FRIENDS_FILE, Fill("Ejemplo2|krle_10|1|20/10/2017|123|1", FriendLength));
       
       // 
       initComponents();
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        lbl_LoginError.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      PanelColor = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      lbl_LoginError = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      txt_password = new javax.swing.JPasswordField();
      btn_SignIn = new javax.swing.JButton();
      btn_SingUp = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      txt_User = new javax.swing.JTextField();
      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(9, 33, 64));
      setMaximumSize(new java.awt.Dimension(314, 300));

      PanelColor.setBackground(new java.awt.Color(55, 160, 166));

      jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Usuario");

      lbl_LoginError.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      lbl_LoginError.setForeground(new java.awt.Color(204, 0, 0));
      lbl_LoginError.setText("El usuario o contraseña son inválidos");

      jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setText("Contraseña");

      txt_password.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
      txt_password.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyReleased(java.awt.event.KeyEvent evt)
         {
            txt_passwordKeyReleased(evt);
         }
      });

      btn_SignIn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      btn_SignIn.setForeground(new java.awt.Color(71, 79, 89));
      btn_SignIn.setText("Iniciar sesión");
      btn_SignIn.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_SignInActionPerformed(evt);
         }
      });

      btn_SingUp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
      btn_SingUp.setForeground(new java.awt.Color(255, 255, 255));
      btn_SingUp.setText("Registrarse");
      btn_SingUp.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_SingUpMouseClicked(evt);
         }
      });

      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/social/Icons/lynxBrown.png"))); // NOI18N

      txt_User.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
      txt_User.addKeyListener(new java.awt.event.KeyAdapter()
      {
         public void keyReleased(java.awt.event.KeyEvent evt)
         {
            txt_UserKeyReleased(evt);
         }
      });

      javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
      PanelColor.setLayout(PanelColorLayout);
      PanelColorLayout.setHorizontalGroup(
         PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(PanelColorLayout.createSequentialGroup()
            .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(PanelColorLayout.createSequentialGroup()
                  .addGap(130, 130, 130)
                  .addComponent(jLabel2)
                  .addGap(36, 36, 36)
                  .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel4)
                     .addComponent(btn_SignIn)
                     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                     .addComponent(txt_User)))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColorLayout.createSequentialGroup()
                  .addGap(270, 270, 270)
                  .addComponent(lbl_LoginError)))
            .addGap(60, 218, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelColorLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_SingUp)
            .addGap(23, 23, 23))
      );
      PanelColorLayout.setVerticalGroup(
         PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(PanelColorLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btn_SingUp)
            .addGap(41, 41, 41)
            .addComponent(jLabel3)
            .addGap(11, 11, 11)
            .addGroup(PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(PanelColorLayout.createSequentialGroup()
                  .addComponent(txt_User, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jLabel4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btn_SignIn))
               .addComponent(jLabel2))
            .addGap(40, 40, 40)
            .addComponent(lbl_LoginError)
            .addContainerGap(13, Short.MAX_VALUE))
      );

      jPanel1.setBackground(new java.awt.Color(253, 211, 92));

      jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(186, 100, 56));
      jLabel1.setText("Lynx");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(37, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void btn_SingUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SingUpMouseClicked
        // TODO add your handling code here:
        RedSocial.RegisterController().Login(this);
    }//GEN-LAST:event_btn_SingUpMouseClicked

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
       LogIn();
    }//GEN-LAST:event_btn_SignInActionPerformed

   private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_passwordKeyReleased
   {//GEN-HEADEREND:event_txt_passwordKeyReleased
      // TODO add your handling code here:
      if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER ){
         LogIn();
      }
   }//GEN-LAST:event_txt_passwordKeyReleased

   private void txt_UserKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_UserKeyReleased
   {//GEN-HEADEREND:event_txt_UserKeyReleased
      // TODO add your handling code here:
      if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER ){
         LogIn();
      }
   }//GEN-LAST:event_txt_UserKeyReleased

   private void LogIn(){
       String User = FileManager.SearchUser(txt_User.getText());
        RedSocial.ACTUALUSER = txt_User.getText(); // Guardo usuario actual a variable, esta debera de vaciarse cuando usuario cambie nombre de usuario o cuando cierre sesion
        try{
         if(User!=null){
           if(RedSocial.MD5(txt_password.getText()).equals(User.split(Pattern.quote(SEPARADOR))[3])){
              RedSocial.ProfileController(User);
              this.setVisible(false);
              this.dispose();
           }
        }
        }catch(Exception e){
           
        }
        lbl_LoginError.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel PanelColor;
   private javax.swing.JButton btn_SignIn;
   private javax.swing.JLabel btn_SingUp;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel lbl_LoginError;
   private javax.swing.JTextField txt_User;
   private javax.swing.JPasswordField txt_password;
   // End of variables declaration//GEN-END:variables

}
