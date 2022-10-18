/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

import poo.programa1.*;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
/**
 *
 * @author dandi
 */
public class AgregarCompetencia extends javax.swing.JFrame {
         private String pNombre;
         private int pId;
         private String pPais;
         private String pLugar; 
         private LocalDate pFechainicio;
         private LocalDate pFechafinal;     
     /**
      * Creates new form AgregarCompetencia
      */
     public AgregarCompetencia() {
          initComponents();
          this.setLocationRelativeTo(null);
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            NombreTXT = new javax.swing.JTextField();
            PaisTXT = new javax.swing.JTextField();
            FechaInicioTXT = new javax.swing.JTextField();
            FechaFinTXT = new javax.swing.JTextField();
            AceptarButton = new javax.swing.JButton();
            CancelarButton = new javax.swing.JButton();
            jLabel8 = new javax.swing.JLabel();
            LugarTXT = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("Agregar Competencia");

            jLabel2.setText("Nombre");

            jLabel4.setText("País");

            jLabel5.setText("Fecha de inicio");

            jLabel6.setText("Fecha final");

            NombreTXT.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        NombreTXTActionPerformed(evt);
                  }
            });

            AceptarButton.setText("Aceptar");
            AceptarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AceptarButtonActionPerformed(evt);
                  }
            });

            CancelarButton.setText("Cancelar");
            CancelarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CancelarButtonActionPerformed(evt);
                  }
            });

            jLabel8.setText("Lugar");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(FechaFinTXT))))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(PaisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(LugarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2))
                                          .addComponent(FechaInicioTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(AceptarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(CancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(CancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(AceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                      .addComponent(jLabel4)
                                                      .addComponent(PaisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel8)
                                          .addComponent(LugarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel5)
                              .addComponent(FechaInicioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel6)
                              .addComponent(FechaFinTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addContainerGap(13, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

     private void NombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTXTActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_NombreTXTActionPerformed

     private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
          // TODO add your handling code here:
          pNombre = NombreTXT.getText();
         pId = Configuracion.parametro1;
         
          pPais = PaisTXT.getText();
          pLugar = LugarTXT.getText();
          
          if (5 > pNombre.length() || pNombre.length() > 60){
            JOptionPane.showMessageDialog(this, "El nombre debe tener una longitud de 5 a 60 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          Set<String> paises = Locale.getISOCountries(Locale.IsoCountryCode.PART1_ALPHA3);
        
        pPais = PaisTXT.getText();
        if (!paises.contains(pPais)){
             JOptionPane.showMessageDialog(this, "Ese país no existe.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          if (5 > pLugar.length() || pLugar.length() > 60){
            JOptionPane.showMessageDialog(this, "El lugar debe tener una longitud de 5 a 60 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          try {
               pFechainicio = LocalDate.parse(FechaInicioTXT.getText(), formatter);
          }
          catch(Exception e){
               JOptionPane.showMessageDialog(this, "El formato de la fecha de inicio es inválido.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
               return;
          }
          try {
               pFechafinal = LocalDate.parse(FechaFinTXT.getText(), formatter);
          }
          catch(Exception e){
               JOptionPane.showMessageDialog(this, "El formato de la fecha final es inválido.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
               return;
          }
          if (pFechainicio.isAfter(pFechafinal)){
               JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser mayor a la de final.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
          }
          for(Map.Entry entry : Competencia.competencias.entrySet()){
               Object Items = entry.getValue();
               Competencia competenciaIter = (Competencia) Items;
               if (competenciaIter.equals(pNombre, pPais, pLugar, pFechainicio, pFechafinal)){
                     JOptionPane.showMessageDialog(this, "Esa competencia ya está agregada.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                  return;
               }
          }
          Competencia competencia = new Competencia( pNombre,  pId,  pPais,  pLugar,  pFechainicio,  pFechafinal);
          Configuracion.parametro1++;
          JOptionPane.showMessageDialog(this, "Competencia agregada existosamente.");
     }//GEN-LAST:event_AceptarButtonActionPerformed

     private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
          // TODO add your handling code here:
          dispose();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
     }//GEN-LAST:event_CancelarButtonActionPerformed

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
               java.util.logging.Logger.getLogger(AgregarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(AgregarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(AgregarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(AgregarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new AgregarCompetencia().setVisible(true);
               }
          });
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton AceptarButton;
      private javax.swing.JButton CancelarButton;
      private javax.swing.JTextField FechaFinTXT;
      private javax.swing.JTextField FechaInicioTXT;
      private javax.swing.JTextField LugarTXT;
      private javax.swing.JTextField NombreTXT;
      private javax.swing.JTextField PaisTXT;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      // End of variables declaration//GEN-END:variables
}
