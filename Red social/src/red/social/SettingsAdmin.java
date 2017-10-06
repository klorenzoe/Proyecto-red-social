package red.social;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat; 
import javax.swing.JFileChooser;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;
import static red.social.RedSocial.Background;
import static red.social.RedSocial.SEPARADOR;
import static red.social.RedSocial.BackupLength;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class SettingsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SettingsAdmin
     */
    public SettingsAdmin() {
        initComponents();
        this.getContentPane().setBackground(Background);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        btn_Delete.setEnabled(false);
        btn_Modify.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      btn_ModifyInformation = new javax.swing.JButton();
      btn_DoBackup = new javax.swing.JButton();
      btn_Return = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      btn_EnterUsers = new javax.swing.JButton();
      txt_Search = new javax.swing.JTextField();
      btn_Find = new javax.swing.JButton();
      lbl_usuario = new javax.swing.JLabel();
      btn_Modify = new javax.swing.JButton();
      btn_Delete = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
      setResizable(false);

      jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      jLabel2.setText("Realizar Backup");

      jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      jLabel3.setText("OPCIONES");

      btn_ModifyInformation.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_ModifyInformation.setText("Ir");
      btn_ModifyInformation.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_ModifyInformationMouseClicked(evt);
         }
      });

      btn_DoBackup.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_DoBackup.setText("Ir");
      btn_DoBackup.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btn_DoBackupActionPerformed(evt);
         }
      });

      btn_Return.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_Return.setText("Regresar");
      btn_Return.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_ReturnMouseClicked(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      jLabel1.setText("Modificar Información");

      jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      jLabel4.setText("Ingresar Nuevos Usuarios");

      btn_EnterUsers.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_EnterUsers.setText("Ir");
      btn_EnterUsers.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_EnterUsersMouseClicked(evt);
         }
      });

      txt_Search.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N

      btn_Find.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_Find.setText("Buscar");
      btn_Find.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_FindMouseClicked(evt);
         }
      });

      btn_Modify.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_Modify.setText("Modificar");
      btn_Modify.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_ModifyMouseClicked(evt);
         }
      });

      btn_Delete.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      btn_Delete.setText("Eliminar");
      btn_Delete.addMouseListener(new java.awt.event.MouseAdapter()
      {
         public void mouseClicked(java.awt.event.MouseEvent evt)
         {
            btn_DeleteMouseClicked(evt);
         }
      });

      jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
      jLabel5.setText("Buscar Usuarios");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btn_Return))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel5)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Modify))
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGap(57, 57, 57)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(btn_DoBackup, javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(btn_ModifyInformation, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(jLabel4)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(btn_EnterUsers)))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btn_Find)))
                  .addGap(0, 244, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(btn_ModifyInformation))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(btn_DoBackup))
            .addGap(49, 49, 49)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(btn_EnterUsers))
            .addGap(36, 36, 36)
            .addComponent(jLabel5)
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btn_Find))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btn_Modify)
               .addComponent(btn_Delete))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
            .addComponent(lbl_usuario)
            .addGap(0, 25, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Return)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void btn_ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ReturnMouseClicked
        // TODO add your handling code here:
        String actualUser = FileManager.Search(RedSocial.ACTUALUSER);
        RedSocial.ProfileController(actualUser);
        this.dispose();
    }//GEN-LAST:event_btn_ReturnMouseClicked

    private void btn_FindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FindMouseClicked
        // TODO add your handling code here:
        String userToSearch = FileManager.Search(txt_Search.getText());
        
        
        if (userToSearch != null){
        String userToSearchArray[] = userToSearch.split(Pattern.quote(SEPARADOR));
            if (userToSearchArray[10].equals("1")  /*Primero vemos si esta activo*/
                && !userToSearchArray[0].equals(RedSocial.ACTUALUSER) /*Despues vemos si es igual al usuarioActual*/
                && userToSearchArray[4].equals("0")) /*Por ultimo revisamos si es usuario*/ /*Para comparar strings mejor usar equals*/{           
                lbl_usuario.setText("Si existe.");
                btn_Delete.setEnabled(true);
                btn_Modify.setEnabled(true);
            }
            /*Si el usuario que se busco es igual al usuario que esta
            usando el sistema solo muestra que si existe*/            
            else if (userToSearchArray[0].equals(RedSocial.ACTUALUSER))
            {
                lbl_usuario.setText("Si existe.");
            }
            /*Si el usuario que se busco esta activo y es administrador solo se puede modificar pero no eliminar*/
            else if (userToSearchArray[10].equals("1")
                     && userToSearchArray[4].equals("1")){
                lbl_usuario.setText("Si existe.");
                btn_Modify.setEnabled(true);
            }
        }
        else
        {
            lbl_usuario.setText("No existe");
            btn_Modify.setEnabled(false);
            btn_Delete.setEnabled(false);
        }            
    }//GEN-LAST:event_btn_FindMouseClicked

    private void btn_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteMouseClicked
        // TODO add your handling code here:
        RedSocial.Delete(txt_Search.getText());
        txt_Search.setText("");
    }//GEN-LAST:event_btn_DeleteMouseClicked

    private void btn_ModifyInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModifyInformationMouseClicked
        // TODO add your handling code here:
        InformationEdit edit = new InformationEdit();
        edit.ShowInformation(RedSocial.ACTUALUSER);
        edit.isManager(true);
        edit.setVisible(true);
    }//GEN-LAST:event_btn_ModifyInformationMouseClicked

    private void btn_ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModifyMouseClicked
        // TODO add your handling code here:
        
        InformationEdit edit = new InformationEdit();
        edit.ShowInformation(txt_Search.getText());
        edit.isManager(true);
        edit.setVisible(true);  
        txt_Search.setText("");
        btn_Delete.setEnabled(false);
        btn_Modify.setEnabled(false);
    }//GEN-LAST:event_btn_ModifyMouseClicked

    private void btn_EnterUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EnterUsersMouseClicked
        // TODO add your handling code here:
        RedSocial.RegisterController(true);
        this.dispose();
    }//GEN-LAST:event_btn_EnterUsersMouseClicked

   private void btn_DoBackupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_DoBackupActionPerformed
   {//GEN-HEADEREND:event_btn_DoBackupActionPerformed
      // TODO add your handling code here:
      String PathBackup="";
      JFileChooser Chooser = new JFileChooser(); 
      Chooser.setCurrentDirectory(new java.io.File("."));
      //Chooser.setDialogTitle(choosertitle);
      Chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      Chooser.setAcceptAllFileFilterUsed(false);    
      if (Chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
         PathBackup = Chooser.getSelectedFile().getAbsolutePath();
         FileManager.Backup(RedSocial.Fill(PathBackup +SEPARADOR+ RedSocial.ACTUALUSER +SEPARADOR+ Today(), BackupLength));
      }
   }//GEN-LAST:event_btn_DoBackupActionPerformed

   private String Today(){
      Date fechaActual = new Date(); 
      SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      return formato.format(fechaActual);
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
            java.util.logging.Logger.getLogger(SettingsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsAdmin().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btn_Delete;
   private javax.swing.JButton btn_DoBackup;
   private javax.swing.JButton btn_EnterUsers;
   private javax.swing.JButton btn_Find;
   private javax.swing.JButton btn_Modify;
   private javax.swing.JButton btn_ModifyInformation;
   private javax.swing.JButton btn_Return;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel lbl_usuario;
   private javax.swing.JTextField txt_Search;
   // End of variables declaration//GEN-END:variables
}
