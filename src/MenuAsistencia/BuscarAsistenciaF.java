/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuAsistencia;

import clases.generadoras.AsistenciaMedicaFamiliar;
import excepciones.personalizadas.*;
import javax.swing.JOptionPane;
import sistema_de_asistencia_medica.GestionHospital;

/**
 *
 * @author Raul
 */
public class BuscarAsistenciaF extends javax.swing.JFrame {

    
    GestionHospital gh;
    AsistenciaMedicaFamiliar a;
    
    public BuscarAsistenciaF(GestionHospital gh) {
        initComponents();
        this.setVisible(true);
        this.gh = gh;
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

        jLabel1 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI DEL FAMILIAR ATENDIDO");

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            gh.verificarCampoDNI(dni.getText());      
            Integer d = Integer.parseInt(dni.getText());
            a = gh.buscarAsistenciaFamiliar(d);
            AsistenciaFamiliar asis = new AsistenciaFamiliar(a);
        }catch (PersonaNoEncontradaException ex) {
                JOptionPane.showMessageDialog(this," AFILIADO NO ENCONTRADO" , "Error", JOptionPane.ERROR_MESSAGE);
        }catch(VerficarCampoVacioException cav){
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos obligatorios ", "Atencion!", JOptionPane.QUESTION_MESSAGE); 
        }catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, " NO HAY NINGUN AFILIADO EN EL SISTEMA", "Atencion!", JOptionPane.QUESTION_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {                             
    char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dni.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dni.setCursor(null);
     }
     else if(dni.getText().length() >= 8){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de ocho caracteres","Error", JOptionPane.ERROR_MESSAGE);
     } 
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
