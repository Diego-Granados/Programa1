/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

import java.util.Map;
import javax.swing.JOptionPane;
import poo.programa1.*;

/**
 *
 * @author dandi
 */
public class EliminarMarca extends javax.swing.JFrame {
     private Disciplina disciplina;
     private Competencia competencia;
     private Prueba prueba;
     private Atleta atleta;
     private Marca marca;
     private double resultado = -1;
     
     
     /**
      * Creates new form MarcasCompetencia
      */
     public EliminarMarca() {
          initComponents();
          this.setLocationRelativeTo(null);
          FillComboCompetencias();
          ComboCompetencias.setSelectedItem(null);
          ComboDisciplinas.setSelectedItem(null);
          ComboPruebas.setSelectedItem(null);
          ComboAtletas.setSelectedItem(null);
          ResultadoTXT.setText("");
          
          
     }

     private void FillComboCompetencias(){
           ComboCompetencias.removeAllItems();
          if (!Competencia.competencias.isEmpty() ){
               for(Map.Entry entry : Competencia.competencias.entrySet()){
                    Object Items = entry.getKey();
                    ComboCompetencias.addItem((String) Items);
               }
          }
     }
     
     private void FillComboDisciplinas(){
          if (competencia == null){
               return;
          }
          
          ComboDisciplinas.removeAllItems();
          if (!competencia.disciplinasDict.isEmpty()){
               for(Map.Entry entry : competencia.disciplinasDict.entrySet()){
                    Object Items = entry.getKey();
                    ComboDisciplinas.addItem((String) Items);
               }
          }
     }

     private void FillComboPruebas(){
          if (disciplina == null){
               return;
          }
          ComboPruebas.removeAllItems();
          if (!disciplina.pruebas.isEmpty()){
               for(Prueba pruebaIter : disciplina.pruebas){
                    Object Items = pruebaIter.getNombre();
                    ComboPruebas.addItem((String) Items);
               }
          }
     }
     
     private void FillComboAtletas(){
           if (prueba == null){
               return;
          }
          
          ComboAtletas.removeAllItems();
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getCompetencia() != competencia || marca.getPrueba() != prueba){
                         continue;
                    }
                    Atleta atletaIter = marca.getAtleta();
                    
                    ComboAtletas.addItem(atletaIter.getId());
               }
          }
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
            ComboCompetencias = new javax.swing.JComboBox<>();
            jLabel3 = new javax.swing.JLabel();
            ComboPruebas = new javax.swing.JComboBox<>();
            jLabel4 = new javax.swing.JLabel();
            CerrarButton = new javax.swing.JButton();
            jLabel8 = new javax.swing.JLabel();
            ComboDisciplinas = new javax.swing.JComboBox<>();
            ComboAtletas = new javax.swing.JComboBox<>();
            jLabel5 = new javax.swing.JLabel();
            ResultadoTXT = new javax.swing.JLabel();
            BorrarButton = new javax.swing.JButton();
            jPanel1 = new javax.swing.JPanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("Actualizar Competencia");

            jLabel2.setText("Competencia");

            ComboCompetencias.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ComboCompetenciasActionPerformed(evt);
                  }
            });

            jLabel3.setText("Prueba");

            ComboPruebas.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ComboPruebasActionPerformed(evt);
                  }
            });

            jLabel4.setText("Atleta");

            CerrarButton.setText("Cancelar");
            CerrarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CerrarButtonActionPerformed(evt);
                  }
            });

            jLabel8.setText("Disciplina");

            ComboDisciplinas.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ComboDisciplinasActionPerformed(evt);
                  }
            });

            ComboAtletas.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ComboAtletasActionPerformed(evt);
                  }
            });

            jLabel5.setText("Resultado");

            BorrarButton.setText("Borrar");
            BorrarButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        BorrarButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 0, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel2)
                              .addComponent(jLabel4)
                              .addComponent(jLabel8)
                              .addComponent(jLabel3)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(62, 62, 62)
                                    .addComponent(ResultadoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(ComboAtletas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(ComboPruebas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(ComboDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(ComboCompetencias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(CerrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                          .addComponent(BorrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(49, 49, 49))))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)
                        .addGap(0, 132, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(BorrarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(CerrarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ResultadoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(80, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

     private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
          // TODO add your handling code here:
          dispose();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
     }//GEN-LAST:event_CerrarButtonActionPerformed

     private void ComboCompetenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCompetenciasActionPerformed
          // TODO add your handling code here:
          competencia = Competencia.competencias.get((String)ComboCompetencias.getSelectedItem());
          if (competencia == null){
               return;
          }
          FillComboDisciplinas();
          
     }//GEN-LAST:event_ComboCompetenciasActionPerformed

     private void ComboDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDisciplinasActionPerformed
          // TODO add your handling code here:
          if (competencia == null){
               return;
          }
          if (competencia.disciplinasDict.containsKey((String) ComboDisciplinas.getSelectedItem())){
               disciplina = competencia.disciplinasDict.get((String) ComboDisciplinas.getSelectedItem());
               FillComboPruebas();
          }
     }//GEN-LAST:event_ComboDisciplinasActionPerformed

     private void ComboPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPruebasActionPerformed
          // TODO add your handling code here:
          if (competencia == null){
               return;
          }
          if(disciplina == null){
               return;
          }
          
          if (competencia.pruebasDict.containsKey(disciplina)){
               for (Prueba pruebaIter : competencia.pruebasDict.get(disciplina)){
                    if (pruebaIter.getNombre() == ComboPruebas.getSelectedItem()){
                         prueba = pruebaIter;
                         break;
                    }
               }
               FillComboAtletas();
          }
     }//GEN-LAST:event_ComboPruebasActionPerformed

      private void ComboAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAtletasActionPerformed
            // TODO add your handling code here:
            if (prueba == null){
                  return;
            }
            
            atleta = (Atleta) Atleta.List.get((String) ComboAtletas.getSelectedItem());
            if (atleta == null){
                  return;
            }
            
            for (Marca marcaIter : prueba.getMarcas()){
                  if (marcaIter.getAtleta() == atleta){
                        resultado = marcaIter.getResultado();
                        marca = marcaIter;
                        if (disciplina.getTipo()){
                              ResultadoTXT.setText(Double.toString(resultado));
                        } else {
                              ResultadoTXT.setText(Marca.convertToString(resultado));
                        }
                        break;
                  }
            }       
      }//GEN-LAST:event_ComboAtletasActionPerformed

      private void BorrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarButtonActionPerformed
            // TODO add your handling code here:
            if (resultado == -1){
                  return;
            }
            atleta = (Atleta) Atleta.List.get((String) ComboAtletas.getSelectedItem());
            if (atleta == null){
                  return;
            }
            int input = JOptionPane.showConfirmDialog(null, "¿Desea borrar?", "Selecione una opción...",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            // 0=sí, 1=no,
            if (input == 0){
                  competencia.marcas.remove(marca);
                
                  prueba.getMarcas().remove(marca);
                
                  atleta.borrarMarca(marca);
                
          
                  if (disciplina.getTipo()){
                            prueba.ordenarMarcasDistancia(competencia);
                  } else {
                            prueba.ordenarMarcasTiempo(competencia);
                  }

                  JOptionPane.showMessageDialog(this, "Marca eliminada existosamente.");
            }
            FillComboCompetencias();
      }//GEN-LAST:event_BorrarButtonActionPerformed

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
               java.util.logging.Logger.getLogger(EliminarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(EliminarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(EliminarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(EliminarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new EliminarMarca().setVisible(true);
               }
          });
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton BorrarButton;
      private javax.swing.JButton CerrarButton;
      private javax.swing.JComboBox<String> ComboAtletas;
      private javax.swing.JComboBox<String> ComboCompetencias;
      private javax.swing.JComboBox<String> ComboDisciplinas;
      private javax.swing.JComboBox<String> ComboPruebas;
      private javax.swing.JLabel ResultadoTXT;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JPanel jPanel1;
      // End of variables declaration//GEN-END:variables
}
