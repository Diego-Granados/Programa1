/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

/**
 *
 * @author dandi
 */
public class ActualizarCompetencia extends javax.swing.JFrame {

     /**
      * Creates new form ActualizarCompetencia
      */
     public ActualizarCompetencia() {
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
            AddDisciplinasCompB = new javax.swing.JButton();
            AddPruebasCompB = new javax.swing.JButton();
            AddMarcasCompB = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            DatosCompetencia = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("Actualizar Competencias");

            AddDisciplinasCompB.setText("Disciplinas");
            AddDisciplinasCompB.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AddDisciplinasCompBActionPerformed(evt);
                  }
            });

            AddPruebasCompB.setText("Pruebas");
            AddPruebasCompB.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AddPruebasCompBActionPerformed(evt);
                  }
            });

            AddMarcasCompB.setText("Marcas");
            AddMarcasCompB.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AddMarcasCompBActionPerformed(evt);
                  }
            });

            jButton4.setText("Cancelar");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            DatosCompetencia.setText("Datos");
            DatosCompetencia.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        DatosCompetenciaActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(AddDisciplinasCompB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(DatosCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                              .addComponent(AddPruebasCompB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(AddMarcasCompB, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(AddMarcasCompB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddDisciplinasCompB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddPruebasCompB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(DatosCompetencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(0, 43, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // TODO add your handling code here:
          dispose();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
     }//GEN-LAST:event_jButton4ActionPerformed

     private void AddMarcasCompBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMarcasCompBActionPerformed
          // TODO add your handling code here:
          dispose();
          AddMarcasComp addmarcas = new AddMarcasComp();
          addmarcas.setVisible(true);
     }//GEN-LAST:event_AddMarcasCompBActionPerformed

     private void AddPruebasCompBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPruebasCompBActionPerformed
          // TODO add your handling code here:
          dispose();
          AddPruebasComp addPruebas = new AddPruebasComp();
          addPruebas.setVisible(true);
     }//GEN-LAST:event_AddPruebasCompBActionPerformed

     private void AddDisciplinasCompBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDisciplinasCompBActionPerformed
          // TODO add your handling code here:
          dispose();
          AddDisciplinasComp addDisciplinas = new AddDisciplinasComp();
          addDisciplinas.setVisible(true);
     }//GEN-LAST:event_AddDisciplinasCompBActionPerformed

      private void DatosCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosCompetenciaActionPerformed
            // TODO add your handling code here:
            dispose();
          ActualizarDatosCompetencia addDisciplinas = new ActualizarDatosCompetencia();
          addDisciplinas.setVisible(true);
      }//GEN-LAST:event_DatosCompetenciaActionPerformed

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
               java.util.logging.Logger.getLogger(ActualizarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(ActualizarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(ActualizarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(ActualizarCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new ActualizarCompetencia().setVisible(true);
               }
          });
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton AddDisciplinasCompB;
      private javax.swing.JButton AddMarcasCompB;
      private javax.swing.JButton AddPruebasCompB;
      private javax.swing.JButton DatosCompetencia;
      private javax.swing.JButton jButton4;
      private javax.swing.JLabel jLabel1;
      // End of variables declaration//GEN-END:variables
}
