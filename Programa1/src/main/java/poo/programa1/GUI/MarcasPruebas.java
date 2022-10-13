/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;
import javax.swing.DefaultListModel;
import poo.programa1.*;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author dandi
 */
public class MarcasPruebas extends javax.swing.JFrame {
     private Atleta atleta;
     private Prueba prueba;
     private DefaultListModel PaisListModel;
     private DefaultListModel CompetenciaListModel;
     private DefaultListModel MarcaListModel;
     private DefaultListModel LugarListModel;
     private DefaultListModel AtletaListModel;
     private ArrayList<Marca> marcas;
     private ArrayList<String> pruebasName;
     private ArrayList<Prueba> pruebas;
     private ArrayList<Competencia> competencias;
     
     /**
      * Creates new form MarcasAtleta
      */
     
     
     public MarcasPruebas() {
          initComponents();
          this.setLocationRelativeTo(null);
          pruebas = new ArrayList<>();
          
          AtletaListModel = new DefaultListModel();
          AtletaList.setModel(AtletaListModel);
          PaisListModel = new DefaultListModel();
          PaisList.setModel(PaisListModel);
          CompetenciaListModel = new DefaultListModel();
          CompetenciaList.setModel(CompetenciaListModel);
          MarcaListModel = new DefaultListModel();
          MarcaList.setModel(MarcaListModel);
          LugarListModel = new DefaultListModel();
          LugarList.setModel(LugarListModel);
          FillComboPruebas();
     }
     
     private void FillComboPruebas(){
          for(Map.Entry entry : Disciplina.disciplinas.entrySet()){
               Object Items = entry.getValue();
               Disciplina disciplina = (Disciplina)Items;
               for (Prueba pruebaIter : disciplina.pruebas){
                    ComboPruebas.addItem(pruebaIter.getNombre());
                    pruebas.add(pruebaIter);
               }              
          }
    }
     
     public void FillListas(){
          if (prueba == null){
               return;
          }
          if (AtletaListModel != null){
               AtletaListModel.removeAllElements();
          }
          
          if (PaisListModel != null){
               PaisListModel.removeAllElements();
          }
          
          if (CompetenciaListModel != null){
               CompetenciaListModel.removeAllElements();
          }
          
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
          
          competencias = new ArrayList<>();
          for (Marca marcaIter : prueba.getMarcas()){
               if (!competencias.contains(marcaIter.getCompetencia())){
                    if (!prueba.getDisciplina().getTipo()){ // si se mide con tiempo
                         prueba.ordenarMarcasTiempo(marcaIter.getCompetencia());
                    } else {
                         prueba.ordenarMarcasDistancia(marcaIter.getCompetencia());
                    } 
                    competencias.add(marcaIter.getCompetencia());
               }
          }
          
          for (Marca marcaIter : prueba.getMarcas()){
               AtletaListModel.addElement(marcaIter.getAtleta().getNombre());
               PaisListModel.addElement(marcaIter.getAtleta().getPais());
               CompetenciaListModel.addElement(marcaIter.getCompetencia().getNombre());
               String resultado = new String();
               if (!marcaIter.getPrueba().getDisciplina().getTipo()){ // si se mide con tiempo
                    resultado = Marca.convertToString(marcaIter.getResultado());
               } else {
                    resultado = Double.toString(marcaIter.getResultado());
               }                    
               MarcaListModel.addElement(resultado);
               LugarListModel.addElement(marcaIter.getLugar());
          }
          
     }
     /*
     private void FillAtletaList(){
          if (prueba == null){
               return;
          }
          if (AtletaListModel != null){
               AtletaListModel.removeAllElements();
          }
          for (Marca marca : marcas){
               AtletaListModel.addElement(marca.getPrueba().getNombre());
               System.out.println("Hola1");
          }*/
          /*
          if (!atleta.getMarcas().isEmpty()){
               for(Marca marca : atleta.getMarcas()){
                    if (!pruebasName.contains(marca.getPrueba().getNombre())){              
                         PruebaListModel.addElement(marca.getPrueba().getNombre());
                         pruebasName.add(marca.getPrueba().getNombre());
                         pruebas.add(marca.getPrueba());
                    }
               }
          }
          */
//     }
     /*
     private void EscogerMarcas(){
          if (atleta == null){
               return;
          }
          for (Marca marcaIter : atleta.getMarcas()){
               if (!pruebasName.contains(marcaIter.getPrueba().getNombre())){        
                    if (!marcaIter.getPrueba().getDisciplina().getTipo()){ // si se mide con tiempo
                           marcaIter.getPrueba().ordenarMarcasTiempo(marcaIter.getCompetencia());
                     } else {
                          marcaIter.getPrueba().ordenarMarcasDistancia(marcaIter.getCompetencia());
                    }   
                    pruebasName.add(marcaIter.getPrueba().getNombre());
                    pruebas.add(marcaIter.getPrueba());
               }
          }
          for (Prueba pruebaIter : pruebas){
               for (Marca marca : pruebaIter.getMarcas()){
                    if (marca.getAtleta() == atleta){
                         marcas.add(marca);
                         System.out.println("hola 4");
                         break;
                    }
               }
          }
     }*/
     /*
     private void FillCompetenciaList(){
          if (atleta == null){
               return;
          }
          if (CompetenciaListModel != null){
               CompetenciaListModel.removeAllElements();
          }
          
          for (Marca marca : marcas){
               CompetenciaListModel.addElement(marca.getCompetencia().getNombre());
               System.out.println("hola 2");
          }
          /*
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
          */
 //    }
     /*
     private void FillMarcaList(){
          if (atleta == null){
               return;
          }
          if (MarcaListModel != null){
               MarcaListModel.removeAllElements();
          }
          
          for (Marca marca : marcas){
               String resultado = new String();
               if (!marca.getPrueba().getDisciplina().getTipo()){ // si se mide con tiempo
                    resultado = Marca.convertToString(marca.getResultado());
               } else {
                    resultado = Double.toString(marca.getResultado());
               }                    
               MarcaListModel.addElement(resultado);
               System.out.println("hola3");
          }
          /*
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
          */
 //    }
     /*
     private void FillLugarList(){
          if (atleta == null){
               return;
          }
          if (LugarListModel != null){
               LugarListModel.removeAllElements();
          }
          for (Marca marca : marcas){
               marca.getPrueba().darLugares(marca.getCompetencia());
               LugarListModel.addElement(marca.getLugar());
          }
          /*
          if (!prueba.getMarcas().isEmpty()){
               for (Marca marca : marcas){
                    if (marca.getPrueba() == prueba){
                         LugarListModel.addElement(marca.getLugar());
                    }
               }    
          }
          */
//    }
     
     
     

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
          ComboPruebas = new javax.swing.JComboBox<>();
          jLabel3 = new javax.swing.JLabel();
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
          jScrollPane4 = new javax.swing.JScrollPane();
          AtletaList = new javax.swing.JList<>();
          jLabel7 = new javax.swing.JLabel();
          scrollpane5 = new javax.swing.JScrollPane();
          PaisList = new javax.swing.JList<>();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setText("Mejores Marcas por Atleta");

          jLabel2.setText("Prueba");

          ComboPruebas.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComboPruebasActionPerformed(evt);
               }
          });

          jLabel3.setText("Atleta");

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

          jScrollPane4.setViewportView(AtletaList);

          jLabel7.setText("País");

          scrollpane5.setViewportView(PaisList);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(scrollpane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                              .addGap(148, 148, 148))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(52, 52, 52)
                              .addComponent(jLabel3)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel2)
                              .addGap(27, 27, 27)
                              .addComponent(ComboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                    .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(172, 172, 172))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel5)
                                        .addGap(51, 51, 51)))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel4)
                                        .addGap(22, 22, 22))))))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(ComboPruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2))
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(jLabel6)
                         .addComponent(jLabel3)
                         .addComponent(jLabel7)
                         .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jScrollPane2)
                              .addComponent(jScrollPane4)
                              .addComponent(jScrollPane3)
                              .addComponent(scrollpane5))
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(20, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void ComboPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPruebasActionPerformed
          // TODO add your handling code here:
          for (Prueba pruebaIter : pruebas){
               if (pruebaIter.getNombre() == ComboPruebas.getSelectedItem()){
                    prueba = pruebaIter;
                    break;
               }
          }
          FillListas();
          
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
               java.util.logging.Logger.getLogger(MarcasPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(MarcasPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(MarcasPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(MarcasPruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new MarcasPruebas().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JList<String> AtletaList;
     private javax.swing.JButton CerrarButton;
     private javax.swing.JComboBox<String> ComboPruebas;
     private javax.swing.JList<String> CompetenciaList;
     private javax.swing.JList<String> LugarList;
     private javax.swing.JList<String> MarcaList;
     private javax.swing.JList<String> PaisList;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     private javax.swing.JScrollPane jScrollPane4;
     private javax.swing.JScrollPane scrollpane5;
     // End of variables declaration//GEN-END:variables
}
