/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuA;

import clases.generadoras.Afiliado;
import excepciones.personalizadas.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import sistema_de_asistencia_medica.GestionHospital;

/**
 *
 * @author Raul
 */
public class Alta extends javax.swing.JFrame {

    GestionHospital ventanaFormularioAltaEmpleado;
    
    public Alta(GestionHospital gh) {
        initComponents();
        ventanaFormularioAltaEmpleado = gh;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        inscribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreaa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoaa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dniaa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diaFechaNacimientoaa = new javax.swing.JTextField();
        mesFechaNacimientoaa = new javax.swing.JTextField();
        diaFechaPagoaa = new javax.swing.JTextField();
        mesFechaPagoaa = new javax.swing.JTextField();
        anioFechaNacimientoaa = new javax.swing.JTextField();
        anioFechaPagoaa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        sexoaa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        inscribir.setText("INSCRIBIR");
        inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirActionPerformed(evt);
            }
        });

        jLabel1.setText("NOMBRE");

        nombreaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreaaActionPerformed(evt);
            }
        });

        jLabel2.setText("APELLIDO");

        apellidoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoaaActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        dniaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniaaActionPerformed(evt);
            }
        });

        jLabel4.setText("SEXO");

        jLabel5.setText("FECHA DE NACIMIENTO");

        jLabel6.setText("FECHA DE INSCRIPCION");

        jLabel7.setText("  DD   / MM   / AAAA");

        jLabel8.setText("DD   / MM   / AAAA");

        diaFechaNacimientoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFechaNacimientoaaActionPerformed(evt);
            }
        });

        mesFechaNacimientoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesFechaNacimientoaaActionPerformed(evt);
            }
        });

        diaFechaPagoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFechaPagoaaActionPerformed(evt);
            }
        });

        jLabel9.setText("NUMERO DE AFILIADO");

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        sexoaa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(inscribir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(nombreaa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apellidoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniaa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sexoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(diaFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anioFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(79, 79, 79))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(diaFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anioFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mesFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anioFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diaFechaPagoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mesFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(inscribir))
                        .addGap(26, 26, 26))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(anioFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirActionPerformed
        try{
            
        Integer dn,mn,an,dp,mp,ap, numeroAfiliado;
        dn= Integer.parseInt(diaFechaNacimientoaa.getText());
        mn=Integer.parseInt(mesFechaNacimientoaa.getText());
        an=Integer.parseInt(anioFechaNacimientoaa.getText());
        dp=Integer.parseInt(diaFechaPagoaa.getText());
        mp=Integer.parseInt(mesFechaPagoaa.getText());
        ap=Integer.parseInt(anioFechaPagoaa.getText());
        String sexo = (String) sexoaa.getSelectedItem();
        LocalDate fechaNacimiento = LocalDate.of(an, mn, dn);
        LocalDate fechaPago = LocalDate.of(ap, mp, dp);
        Integer dni = Integer.parseInt(this.dniaa.getText());
        numeroAfiliado = Integer.parseInt(numero.getText());
        ventanaFormularioAltaEmpleado.verificarDatos(dniaa.getText(),nombreaa.getText(),apellidoaa.getText(),diaFechaNacimientoaa.getText(),String.valueOf(mesFechaNacimientoaa.getText()),String.valueOf(anioFechaNacimientoaa.getText()));  

        Metodos.validarDNI(dni);
        boolean  encontrado = ventanaFormularioAltaEmpleado.validarDni(dni);

            //si lo encuentro, muestro un error
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Ya existe un afiliado con ese DNI",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //Sino esta en la lista, lo añado
                ventanaFormularioAltaEmpleado.altaAfiliado(new Afiliado(numeroAfiliado, nombreaa.getText(), apellidoaa.getText(),Integer.parseInt(dniaa.getText()) ,sexo , fechaNacimiento, fechaPago));
                JOptionPane.showMessageDialog(this, "Se ha añadido el afiliado",
                        "Añadido", JOptionPane.INFORMATION_MESSAGE);
                
            }
         
            
     } catch (DNIException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     /*} catch (Exception ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     } */
     }catch(VerficarCampoVacioException cav){
           JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos obligatorios ", "Atencion!", JOptionPane.QUESTION_MESSAGE);
           
    /*} catch (Exception ex) {
           JOptionPane.showMessageDialog(this, " no ingresaste los tipos correcto de datops en las casillas", "Error", JOptionPane.ERROR_MESSAGE);*/
     }
    }//GEN-LAST:event_inscribirActionPerformed

    private void nombreaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreaaActionPerformed
    private void nombreaaKeyTyped(java.awt.event.KeyEvent evt) {                                  
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras","Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo letras","Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void diaFechaPagoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFechaPagoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFechaPagoaaActionPerformed

    private void diaFechaNacimientoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFechaNacimientoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFechaNacimientoaaActionPerformed

    private void mesFechaNacimientoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesFechaNacimientoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesFechaNacimientoaaActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed
    private void numeroKeyTyped(java.awt.event.KeyEvent evt){
        char C= evt.getKeyChar();
        if(Character.isLetter(C)) evt.consume();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void apellidoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoaaActionPerformed

    private void dniaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniaaActionPerformed
    private void dniaaKeyTyped(java.awt.event.KeyEvent evt) {                               

        char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dniaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dniaa.setCursor(null);
     }
     else if(dniaa.getText().length() >= 8){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de ocho caracteres","Error", JOptionPane.ERROR_MESSAGE);
         
     }
    } 
    private void apellidoaaKeyTyped(java.awt.event.KeyEvent evt) {                                    
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras","Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo letras","Error", JOptionPane.ERROR_MESSAGE);
    }
    } 
    private void diaFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {                                              

        char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaNacimientoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaNacimientoaa.setCursor(null);
     }
     else if(diaFechaNacimientoaa.getText().length() >= 2){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de dos caracteres","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaNacimientoaa.setCursor(null);
     }
    }   
    
        private void mesFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {                                              

        char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaNacimientoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaNacimientoaa.setCursor(null);
     }
     else if(mesFechaNacimientoaa.getText().length() >= 2){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de dos caracteres","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaNacimientoaa.setCursor(null);
     }
    }
        
    private void anioFechaPagoaaKeyTyped(java.awt.event.KeyEvent evt) {                                         

                char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaPagoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaPagoaa.setCursor(null);
     }
     else if(anioFechaPagoaa.getText().length() >= 4){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de cuatro caracteres","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaPagoaa.setCursor(null);
     }
    }
    
    private void anioFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {                                               

                char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaNacimientoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaNacimientoaa.setCursor(null);
     }
     else if(anioFechaNacimientoaa.getText().length() >= 4){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de cuatro caracteres","Error", JOptionPane.ERROR_MESSAGE);
         anioFechaNacimientoaa.setCursor(null);
     }
    }
    
    private void diaFechaPagoaaKeyTyped(java.awt.event.KeyEvent evt) {                                        

                char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaPagoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaPagoaa.setCursor(null);
     }
     else if(diaFechaPagoaa.getText().length() >= 2){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de dos caracteres","Error", JOptionPane.ERROR_MESSAGE);
         diaFechaPagoaa.setCursor(null);
     }
    }
    
        private void mesFechaPagoaaKeyTyped(java.awt.event.KeyEvent evt) {                                        

                char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaPagoaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaPagoaa.setCursor(null);
     }
     else if(mesFechaPagoaa.getText().length() >= 2){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de dos caracteres","Error", JOptionPane.ERROR_MESSAGE);
         mesFechaPagoaa.setCursor(null);
     }
    }
        
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioFechaNacimientoaa;
    private javax.swing.JTextField anioFechaPagoaa;
    private javax.swing.JTextField apellidoaa;
    private javax.swing.JTextField diaFechaNacimientoaa;
    private javax.swing.JTextField diaFechaPagoaa;
    private javax.swing.JTextField dniaa;
    private javax.swing.JButton inscribir;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mesFechaNacimientoaa;
    private javax.swing.JTextField mesFechaPagoaa;
    private javax.swing.JTextField nombreaa;
    private javax.swing.JTextField numero;
    private javax.swing.JComboBox<String> sexoaa;
    // End of variables declaration//GEN-END:variables
}
