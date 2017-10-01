/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.social;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static red.social.RedSocial.BINNACLE;
import static red.social.RedSocial.DIRECTORY;
import static red.social.RedSocial.IMAGES;
import static red.social.RedSocial.SEPARADOR;
import static red.social.RedSocial.USER_FILE;

/**
 *
 * @author Oscar
 */
public class EditInfo extends javax.swing.JFrame {

    static int frameType;
    String userToEdit;
    String PicturePath;
    int PictureCount = 0;
    /**
     * Creates new form EditInfo
     */
    
    /*Si frameType_ es 0 quiere decir que el que viene es Administrador a modificar su Info
      Si frameType_ es 1 quiere decir que el que viene es Administradir a modificar a un usuario
      Si frameType_ es 2 quiere decir que el que viene es Usuario a modificar su info*/
    public EditInfo() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FrameTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        txt_password = new javax.swing.JPasswordField();
        txt_confirmpassword = new javax.swing.JPasswordField();
        lbl_imagen = new javax.swing.JLabel();
        lbl_path = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        lbl_rol = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        lbl_PasswordCheckedError = new javax.swing.JLabel();
        lbl_Level = new javax.swing.JLabel();
        lbl_PictureError = new javax.swing.JLabel();
        lbl_MailError = new javax.swing.JLabel();
        lbl_telefonoError = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_nacimiento = new javax.swing.JSpinner();
        rb_usuario = new javax.swing.JRadioButton();
        rb_administrador = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FrameTitle.setText("jLabel1");

        jLabel1.setText("Cambiar contraseña");

        jLabel2.setText("Confirmar contraseña");

        jLabel3.setText("Correo eléctronico");

        jLabel4.setText("Fecha de nacimiento");

        lbl_telefono.setText("Teléfono");

        jLabel6.setText("Fotografia principal");

        txt_correo.setText("jTextField3");

        txt_telefono.setText("jTextField5");

        jLabel7.setText("Descripción");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        lbl_imagen.setText("jLabel8");

        btn_buscar.setText("Cambiar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_rol.setText("Rol");

        jButton1.setText("Editar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });

        lbl_PasswordCheckedError.setForeground(new java.awt.Color(204, 0, 0));
        lbl_PasswordCheckedError.setText("Inválida");

        lbl_Level.setForeground(new java.awt.Color(204, 0, 0));
        lbl_Level.setText("jLabel9");

        lbl_PictureError.setForeground(new java.awt.Color(204, 0, 0));
        lbl_PictureError.setText("Es necesaria una imagen de perfil");

        lbl_MailError.setForeground(new java.awt.Color(204, 0, 0));
        lbl_MailError.setText("Es necesario un correo");

        lbl_telefonoError.setForeground(new java.awt.Color(204, 0, 0));
        lbl_telefonoError.setText("Es necesario un teléfono correcto");

        lbl_usuario.setText("Usuario");

        txt_user.setText("jTextField1");

        txt_nacimiento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1199234280000L), new java.util.Date(-315526920000L), new java.util.Date(1199236080000L), java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
        txt_nacimiento.setRequestFocusEnabled(false);

        rb_usuario.setText("Usuario");

        rb_administrador.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FrameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(lbl_telefono)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_rol)
                                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn_buscar)
                                            .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_confirmpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_correo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_user, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Level, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                            .addComponent(lbl_PasswordCheckedError)
                                            .addComponent(lbl_MailError)
                                            .addComponent(lbl_telefonoError)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_path, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lbl_PictureError))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rb_usuario)
                                                                .addGap(27, 27, 27))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(rb_administrador)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn_regresar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FrameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Level))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PasswordCheckedError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MailError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefonoError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_buscar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_path)
                    .addComponent(lbl_PictureError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_rol)
                        .addComponent(jButton1))
                    .addComponent(rb_administrador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_regresar)
                    .addComponent(rb_usuario))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ShowInfo(String userToEdit_, int frameType_){
        frameType = frameType_;
        userToEdit = userToEdit_;
        String userToEditArray[] = FileManager.Search(userToEdit).split(Pattern.quote(SEPARADOR));
        
        
        // Si los radio botones no estan en un grupo es posible seleccionar ambos a la vez
        buttonGroup1.add(rb_administrador);
        buttonGroup1.add(rb_usuario);
        
        if (frameType == 0 || frameType == 2){
            FrameTitle.setText("MODIFICAR MI INFORMACIÓN");
            rb_administrador.setEnabled(false);
            rb_administrador.setVisible(false);
            rb_usuario.setEnabled(false);
            rb_usuario.setVisible(false);
            lbl_rol.setEnabled(false);
            lbl_rol.setVisible(false);
        }
            
        else if (frameType == 1)
        {
            FrameTitle.setText("MODIFICAR INFORMACIÓN DE USUARIO");
            rb_administrador.setEnabled(true);
            rb_administrador.setSelected(true);
            rb_usuario.setEnabled(true);
            lbl_rol.setEnabled(true);
        }
        
        txt_user.setText(userToEditArray[0]);
        txt_correo.setText(userToEditArray[6]);
        
        txt_telefono.setText(userToEditArray[7]);
        PicturePath = userToEditArray[8];
        lbl_path.setText(PicturePath);
        lbl_imagen.setIcon(new ImageIcon((new ImageIcon(PicturePath)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH)));
        txt_descripcion.setText(userToEditArray[9]);
        
    }
    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        // TODO add your handling code here:
        if (frameType == 1 || frameType == 0)
            RedSocial.SettingsAdminController();
        else
            RedSocial.SettingsNotAdminController();
        
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked

    private boolean ImageExistInMEIA(String Name){
        File ImageDir = new File(DIRECTORY+IMAGES);
        if(!ImageDir.exists()){
            ImageDir.getAbsoluteFile().mkdir();
            return false;
        }else{
            File Image = new File(DIRECTORY+""+IMAGES+"\\"+Name);
            if(Image.exists()){
                return true;
            }
            return false;
        }
    }
    
    private void CopyImagesToMEIA (String Origin, String Destiny)    {
        try {
                Path origenPath = Paths.get(Origin);
                Path destinoPath = Paths.get(Destiny);
                Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
                //This rename the picture
                File Picture = new File(Destiny);
                File NewName = NewPictureName(Destiny.split(Pattern.quote("."))[Destiny.split(Pattern.quote(".")).length-1]);
                Picture.renameTo(NewName);
                PicturePath = NewName.getAbsolutePath();
        } catch(Exception e){
                
            }
    }
    
    private File NewPictureName(String ext){
        File newName;
        do{
             PictureCount++;
            newName = new File(DIRECTORY + IMAGES+"\\"+ PictureCount+"."+ext);
        }while(newName.exists());
        return newName;
    }
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser Images = new JFileChooser();
            Images.setFileFilter(new FileNameExtensionFilter("Image Files", "gif","jpg","jpeg","png"));
            Images.setAcceptAllFileFilterUsed(false);
            Images.showOpenDialog(Images);
                String Path = Images.getSelectedFile().getAbsolutePath();
                String Name = Path.split(Pattern.quote("\\"))[Path.split(Pattern.quote("\\")).length-1];
                ImageExistInMEIA(Name); //It returns a booleean about If exist a image with the same name
                CopyImagesToMEIA(Path, DIRECTORY+IMAGES+"\\"+Name);
                lbl_path.setText(Path);
                lbl_imagen.setIcon(new ImageIcon((new ImageIcon(PicturePath)).getImage().getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH)));
       
        }catch(Exception e){
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(IsDataValid()){
            String Data;
            
            if (txt_password.getText().isEmpty())
                Data = CreateUserLine(frameType,true);
            else
                Data = CreateUserLine(frameType,false);
            
            /*Si el usuario en el txt es igual al actual quiere decir que
            que solo actualizo linea*/
            if (txt_user.getText().equals(userToEdit))
                FileManager.Update(RedSocial.Fill(Data));
            /*Sino debo colocar como inactivo el usuario anterior
              cambiar la variable ACTUAL USER
              y escribir en el archivo la linea con el nuevo usuario*/
            else {
                FileManager.WriteFile(USER_FILE, Data);
                RedSocial.Delete(userToEdit);
                if (frameType == 0)
                    RedSocial.ACTUALUSER = txt_user.getText();
                
            }
                           
            this.setVisible(false);
            if (frameType == 0 || frameType == 1)
                RedSocial.SettingsAdminController();
            else
                RedSocial.SettingsNotAdminController();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked
    
    private String CreateUserLine(int frameType_, boolean passwordEmpty){
       try{
           String userToEditArray[] = FileManager.Search(userToEdit).split(Pattern.quote(SEPARADOR));
           String newLine;
           // Si el administrador esta cambiando su info o un usuario su info, no todo radio button
           if (frameType_ == 0 || frameType_ == 2)
           {
               if (passwordEmpty){
               newLine = txt_user.getText()+"|"+ userToEditArray[1]+"|"+ userToEditArray[2] +"|"+ userToEditArray[3]+"|"+ userToEditArray[4] +"|"+ txt_nacimiento.getValue().toString() +"|" + txt_correo.getText()+"|" + txt_telefono.getText()+"|" + PicturePath+"|" + txt_descripcion.getText() + "|1";
               return newLine;
               }               
               else{
               newLine = txt_user.getText()+"|"+ userToEditArray[1]+"|"+ userToEditArray[2] +"|"+ RedSocial.MD5(txt_password.getText())+"|"+ userToEditArray[4] +"|"+ txt_nacimiento.getValue().toString() +"|" + txt_correo.getText()+"|" + txt_telefono.getText()+"|" + PicturePath+"|" + txt_descripcion.getText() + "|1";
               return newLine;
               }
           }
           // Si el administrador esta cambiando info de un usuario tomo info de radio button
           else
           {
               if (rb_administrador.isSelected())
                   userToEditArray[4] = "1";
               else
                   userToEditArray[4] = "0";
               if (passwordEmpty){
               newLine = txt_user.getText()+"|"+ userToEditArray[1]+"|"+ userToEditArray[2] +"|"+ userToEditArray[3]+"|"+ userToEditArray[4] +"|"+ txt_nacimiento.getValue().toString() +"|" + txt_correo.getText()+"|" + txt_telefono.getText()+"|" + PicturePath+"|" + txt_descripcion.getText() + "|1";
               return newLine;
               }               
               else{
               newLine = txt_user.getText()+"|"+ userToEditArray[1]+"|"+ userToEditArray[2] +"|"+ RedSocial.MD5(txt_password.getText())+"|"+ userToEditArray[4] +"|"+ txt_nacimiento.getValue().toString() +"|" + txt_correo.getText()+"|" + txt_telefono.getText()+"|" + PicturePath+"|" + txt_descripcion.getText() + "|1";
               return newLine;
               }
           }
           
               
       }catch(Exception e){
          return "";
       }
    }
    private boolean IsDataValid(){
       
        if(!txt_password.getText().isEmpty() && lbl_Level.getText().equals("Contraseña insegura") || lbl_Level.getText().equals("Tiene que ser mayor de 6 caracteres")){
            txt_password.setBackground(Color.RED);
            return false;}
        if(!(txt_confirmpassword.getText().equals(txt_password.getText()))){
            lbl_PasswordCheckedError.setVisible(true);
            return false;
        }
        if(txt_correo.getText().isEmpty()){
            lbl_MailError.setVisible(true);
            return false;
        }else{
           try{
              if(txt_correo.getText().split(Pattern.quote("@")).length !=2 || txt_correo.getText().split(Pattern.quote("@"))[0].isEmpty() || txt_correo.getText().split(Pattern.quote("@"))[1].isEmpty()){
                 lbl_MailError.setText("Es necesario un correo válido");
                 lbl_MailError.setVisible(true);
                 return false;
              }
           }catch(Exception e){
              
           }
        }
        if(txt_telefono.getText().isEmpty()){
            lbl_telefonoError.setVisible(true);
            lbl_telefonoError.setText("Es necesario un número telefónico");
            return false;
        }
        try{
            if(txt_telefono.getText().length()<8){
                lbl_telefonoError.setVisible(true);
                return false;
            }
            Integer.parseInt(txt_telefono.getText());
        }catch(Exception e){
            lbl_telefonoError.setVisible(true);
            return false;
        }
        
        if(lbl_path.equals("")){
            lbl_PictureError.setVisible(true);
            return false;
        }
        return true;
    }
    
    private int PowerLetters(String sequence){
        int count=0;
        for (int i = 0; i < sequence.length(); i++) {
            if("QWERTYUIOPASDFGHJKLÑZXCVBNM".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private int Letters(String sequence){
        int count =0;
         for (int i = 0; i < sequence.length(); i++) {
            if("QWERTYUIOPASDFGHJKLÑZXCVBNMqwertyuiopasdfghjklñzxcvbnm".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private int Numbers(String sequence){
        int count =0;
         for (int i = 0; i < sequence.length(); i++) {
            if("1234567890".indexOf(sequence.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    
    private void PasswordLevel(int puntuation){
        if(puntuation<=25){
            //insegura
            lbl_Level.setForeground(Color.RED);
            lbl_Level.setText("Contraseña insegura");
        }else{
            if(puntuation<=35){
                //poco segura
                lbl_Level.setForeground(Color.ORANGE);
                lbl_Level.setText("Contraseña poco segura");
            }else{
                if(puntuation<=50){
                    //segura
                    lbl_Level.setForeground(Color.BLUE);
                    lbl_Level.setText("Contraseña segura");
                }else{
                    if(puntuation<=100){
                        //muy segura
                        lbl_Level.setForeground(Color.GREEN);
                        lbl_Level.setText("Contraseña muy segura");
                    }
                }
            }
        }
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
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameTitle;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Level;
    private javax.swing.JLabel lbl_MailError;
    private javax.swing.JLabel lbl_PasswordCheckedError;
    private javax.swing.JLabel lbl_PictureError;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_path;
    private javax.swing.JLabel lbl_rol;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_telefonoError;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JRadioButton rb_administrador;
    private javax.swing.JRadioButton rb_usuario;
    private javax.swing.JPasswordField txt_confirmpassword;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JSpinner txt_nacimiento;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
