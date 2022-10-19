/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;
import javax.swing.DefaultListModel;
import poo.programa1.*;
import java.util.ArrayList;

/**
 *
 * @author Diego Granados y Daniel Granados
 */
public class MarcasAtleta extends javax.swing.JFrame {
     private Atleta atleta;
     private Prueba prueba;
     private DefaultListModel CompetenciaListModel;
     private DefaultListModel MarcaListModel;
     private DefaultListModel LugarListModel;
     private ArrayList<Competencia> competencias;
     private ArrayList<Marca> marcas;
     private ArrayList<String> pruebas;
     /**
      * Creates new form MarcasAtleta
      */
     public MarcasAtleta() {
          initComponents();
          this.setLocationRelativeTo(null);
          competencias = new ArrayList<>();
          
          CompetenciaListModel = new DefaultListModel();
          CompetenciaList.setModel(CompetenciaListModel);
          MarcaListModel = new DefaultListModel();
          MarcaList.setModel(MarcaListModel);
          LugarListModel = new DefaultListModel();
          LugarList.setModel(LugarListModel);
          FillComboAtletas();
     }
     
     // llena el combo box de atletas
     private void FillComboAtletas(){
        Atleta.List.forEach((key, value) -> {
            if (value instanceof Atleta){
                ComboAtletas.addItem(key);
            }
        });
    }
     
     private void FillComboPruebas(){
          if (atleta == null){
               return;
          }
          ComboPruebas.removeAllItems();
          if (!atleta.getMarcas().isEmpty()){
               pruebas = new ArrayList<>();
               for(Marca marca : atleta.getMarcas()){
                    if (!pruebas.contains(marca.getPrueba().getNombre())){
                         Object Items = marca.getPrueba().getNombre();
                         ComboPruebas.addItem((String) Items);
                         pruebas.add((String) Items);
                    }
               }
          }
     }
     
     private void FillCompetenciaList(){
          if (prueba == null){
               return;
          }
          if (CompetenciaListModel != null){
               CompetenciaListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for(Marca marca : prueba.getMarcas()){
                    if (marca.getAtleta() != atleta){
                         continue;
                    }
                    String CompName = marca.getCompetencia().getNombre();                    
                    CompetenciaListModel.addElement(CompName);
                    if (!competencias.contains(marca.getCompetencia())){
                         competencias.add(marca.getCompetencia());
                    }
               }
          }
     }
     
     private void FillMarcaList(){
          if (prueba == null){
               return;
          }
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               marcas = new ArrayList<>();
               for (Competencia competencia : competencias){
                    for(Marca marca : competencia.marcas){
                         if (marca.getPrueba() != prueba || marca.getAtleta() != atleta){
                               continue;
                               
                         }
                         String resultado = new String();
                         if (!prueba.getDisciplina().getTipo()){ // si se mide con tiempo
                              prueba.ordenarMarcasTiempo(competencia);
                              resultado = Marca.convertToString(marca.getResultado());
                         } else {
                              prueba.ordenarMarcasDistancia(competencia);
                              resultado = Double.toString(marca.getResultado());
                         }                    
                         MarcaListModel.addElement(resultado);
                         if (!marcas.contains(marca)){
                              marcas.add(marca);
                         }
                         
                         break;
                    }
               }
          }
     }
     
     private void FillLugarList(){
          if (prueba == null){
               return;
          }
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
          
          if (!prueba.getMarcas().isEmpty()){
               for (Marca marca : marcas){
                    if (marca.getPrueba() == prueba){
                         LugarListModel.addElement(marca.getLugar());
                    }
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
          ComboAtletas = new javax.swing.JComboBox<>();
          jLabel3 = new javax.swing.JLabel();
          ComboPruebas = new javax.swing.JComboBox<>();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          jLabel6 = new javax.swing.JLabel();
          jScrollPane1 = new javax.swing.JScrollPane();
          CompetenciaList = new javax.swing.JList<>();
          jScrollPane2 = new javax.swing.JScrollPane();
          MarcaList = new javax.swing.JList<>();
          jScrollPane3 = new javax.swing.JScrollPane();
          LugarList = new javax.swing.JList<>();
          CerrarButton = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setText("Marcas por Atleta");

          jLabel2.setText("Atleta");

          ComboAtletas.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComboAtletasActionPerformed(evt);
               }
          });

          jLabel3.setText("Prueba");

          ComboPruebas.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComboPruebasActionPerformed(evt);
               }
          });

          jLabel4.setText("Competencia");

          jLabel5.setText("Marca");

          jLabel6.setText("Lugar");

          jScrollPane1.setViewportView(CompetenciaList);

          jScrollPane2.setViewportView(MarcaList);

          jScrollPane3.setViewportView(LugarList);

          CerrarButton.setText("Cerrar");
          CerrarButton.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CerrarButtonActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4))
                                   .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel5))))
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(layout.createSequentialGroup()
                                   .addGap(153, 153, 153)
                                   .addComponent(jLabel1))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                   .addContainerGap()
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboAtletas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboPruebas, 0, 130, Short.MAX_VALUE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel6)
                         .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(ComboAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(ComboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(jLabel5)
                         .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                         .addComponent(jScrollPane2)
                         .addComponent(jScrollPane3))
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void ComboAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAtletasActionPerformed
          // TODO add your handling code here:
          atleta = (Atleta) Atleta.List.get((String) ComboAtletas.getSelectedItem());
          if (atleta == null){
               return;
          }
          FillComboPruebas();
          if (CompetenciaListModel != null){
               CompetenciaListModel.removeAllElements();
          }
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
     }//GEN-LAST:event_ComboAtletasActionPerformed

     private void ComboPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPruebasActionPerformed
          // TODO add your handling code here:
          if (atleta == null){
               return;
          }
          for (Marca marcaIter : atleta.getMarcas()){
               if (marcaIter.getPrueba().getNombre() == ComboPruebas.getSelectedItem()){
                    prueba = marcaIter.getPrueba();
                    break;
               }
          }
          FillCompetenciaList();
          FillMarcaList();
          FillLugarList();
     }//GEN-LAST:event_ComboPruebasActionPerformed

     private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
          // TODO add your handling code here:
          dispose();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
     }//GEN-LAST:event_CerrarButtonActionPerformed

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
               java.util.logging.Logger.getLogger(MarcasAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(MarcasAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(MarcasAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(MarcasAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new MarcasAtleta().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton CerrarButton;
     private javax.swing.JComboBox<String> ComboAtletas;
     private javax.swing.JComboBox<String> ComboPruebas;
     private javax.swing.JList<String> CompetenciaList;
     private javax.swing.JList<String> LugarList;
     private javax.swing.JList<String> MarcaList;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     // End of variables declaration//GEN-END:variables
}
