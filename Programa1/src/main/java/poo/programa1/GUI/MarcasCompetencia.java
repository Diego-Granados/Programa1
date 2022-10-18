/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

import java.util.Map;
import javax.swing.DefaultListModel;
import poo.programa1.*;

/**
 *
 * @author dandi
 */
public class MarcasCompetencia extends javax.swing.JFrame {
     private Disciplina disciplina;
     private Competencia competencia;
     private Prueba prueba;
     private DefaultListModel AtletaListModel;
     private DefaultListModel DorsalListModel;
     private DefaultListModel MarcaListModel;
     private DefaultListModel LugarListModel;
     /**
      * Creates new form MarcasCompetencia
      */
     public MarcasCompetencia() {
          initComponents();
          this.setLocationRelativeTo(null);
          AtletaListModel = new DefaultListModel();
          AtletaList.setModel(AtletaListModel);
          DorsalListModel = new DefaultListModel();
          DorsalList.setModel(DorsalListModel);
          MarcaListModel = new DefaultListModel();
          MarcaList.setModel(MarcaListModel);
          LugarListModel = new DefaultListModel();
          LugarList.setModel(LugarListModel);
          FillComboCompetencias();
          ComboCompetencias.setSelectedItem(null);
          ComboDisciplinas.setSelectedItem(null);
          ComboPruebas.setSelectedItem(null);
          
          
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
     
     private void FillComboCompetencias(){
          if (!Competencia.competencias.isEmpty() ){
               for(Map.Entry entry : Competencia.competencias.entrySet()){
                    Object Items = entry.getKey();
                    ComboCompetencias.addItem((String) Items);
               }
          }
     }
     
     private void FillAtletaList(){
          if (prueba == null){
               return;
          }
       //   AtletaList.removeAll();
          if (AtletaListModel != null){
               AtletaListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getCompetencia() != competencia){
                         continue;
                    }
                    Atleta atleta = marca.getAtleta();
                    
                    AtletaListModel.addElement(atleta.getNombre());
               }
          }
     }
     
     private void FillDorsalList(){
          if (prueba == null){
               return;
          }
       //   DorsalList.removeAll();
          if (DorsalListModel != null){
               DorsalListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getCompetencia() != competencia){
                         continue;
                    }
                    int dorsal = marca.getDorsal();
                    
                    DorsalListModel.addElement(dorsal);
               }
          }
     }
     
     private void FillLugarList(){
          if (prueba == null){
               return;
          }
       //   LugarList.removeAll();
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getCompetencia() != competencia){
                         continue;
                    }
                    int lugar = marca.getLugar();
                    
                    LugarListModel.addElement(lugar);
               }
          }
     }
     
     private void FillMarcaList(){
          if (prueba == null){
               return;
          }
       //   MarcaList.removeAll();
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getCompetencia() != competencia){
                         continue;
                    }
                     String resultado = new String();
                    if (!prueba.getDisciplina().getTipo()){ // si se mide con tiempo
                         resultado = Marca.convertToString(marca.getResultado());
                    } else {
                         resultado = Double.toString(marca.getResultado());
                    }                    
                    MarcaListModel.addElement(resultado);
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
     
     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            AtletaList = new javax.swing.JList<>();
            jLabel2 = new javax.swing.JLabel();
            ComboCompetencias = new javax.swing.JComboBox<>();
            jLabel3 = new javax.swing.JLabel();
            ComboPruebas = new javax.swing.JComboBox<>();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            DorsalList = new javax.swing.JList<>();
            jLabel6 = new javax.swing.JLabel();
            jScrollPane3 = new javax.swing.JScrollPane();
            MarcaList = new javax.swing.JList<>();
            jLabel7 = new javax.swing.JLabel();
            jScrollPane4 = new javax.swing.JScrollPane();
            LugarList = new javax.swing.JList<>();
            CerrarButton = new javax.swing.JButton();
            jLabel8 = new javax.swing.JLabel();
            ComboDisciplinas = new javax.swing.JComboBox<>();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("Marcas por Competencia");

            jScrollPane2.setViewportView(AtletaList);

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

            jLabel5.setText("Dorsal");

            jScrollPane1.setViewportView(DorsalList);

            jLabel6.setText("Marca");

            jScrollPane3.setViewportView(MarcaList);

            jLabel7.setText("Lugar");

            jScrollPane4.setViewportView(LugarList);

            CerrarButton.setText("Cerrar");
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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel8))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel5)))
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel6)
                                    .addGap(79, 79, 79)
                                    .addComponent(jLabel7)
                                    .addGap(41, 89, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(318, 318, 318))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(ComboPruebas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(278, 278, 278)))
                                    .addGap(0, 87, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGap(109, 109, 109)
                                                            .addComponent(ComboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addComponent(ComboCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(71, 71, 71))))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(ComboCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(ComboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(CerrarButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel4)
                              .addComponent(jLabel5)
                              .addComponent(jLabel6)
                              .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jScrollPane4)
                              .addComponent(jScrollPane2)
                              .addComponent(jScrollPane1)
                              .addComponent(jScrollPane3))
                        .addGap(20, 20, 20))
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
          if (AtletaListModel != null){
               AtletaListModel.removeAllElements();
          }
          if (DorsalListModel != null){
               DorsalListModel.removeAllElements();
          }
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
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
               if (disciplina.getTipo()){
                    prueba.ordenarMarcasDistancia(competencia);
               } else {
                    prueba.ordenarMarcasTiempo(competencia);
          }
               
               FillAtletaList();
               FillDorsalList();
               FillMarcaList();
               FillLugarList();
               
          }
     }//GEN-LAST:event_ComboPruebasActionPerformed

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
               java.util.logging.Logger.getLogger(MarcasCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(MarcasCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(MarcasCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(MarcasCompetencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new MarcasCompetencia().setVisible(true);
               }
          });
     }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JList<String> AtletaList;
      private javax.swing.JButton CerrarButton;
      private javax.swing.JComboBox<String> ComboCompetencias;
      private javax.swing.JComboBox<String> ComboDisciplinas;
      private javax.swing.JComboBox<String> ComboPruebas;
      private javax.swing.JList<String> DorsalList;
      private javax.swing.JList<String> LugarList;
      private javax.swing.JList<String> MarcaList;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JScrollPane jScrollPane4;
      // End of variables declaration//GEN-END:variables
}
