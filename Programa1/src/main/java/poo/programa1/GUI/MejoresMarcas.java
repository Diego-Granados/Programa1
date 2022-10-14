/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;
import javax.swing.DefaultListModel;
import poo.programa1.*;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.mail.*;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author dandi
 */
public class MejoresMarcas extends javax.swing.JFrame {
     private Atleta atleta;
     private Prueba prueba;
     private DefaultListModel PruebaListModel;
     private DefaultListModel CompetenciaListModel;
     private DefaultListModel MarcaListModel;
     private DefaultListModel LugarListModel;
     private ArrayList<Marca> marcas;
     private ArrayList<String> pruebasName;
     private ArrayList<Prueba> pruebas;
     /**
      * Creates new form MarcasAtleta
      */
     public MejoresMarcas() {
          initComponents();
          this.setLocationRelativeTo(null);
          PruebaListModel = new DefaultListModel();
          PruebaList.setModel(PruebaListModel);
          CompetenciaListModel = new DefaultListModel();
          CompetenciaList.setModel(CompetenciaListModel);
          MarcaListModel = new DefaultListModel();
          MarcaList.setModel(MarcaListModel);
          LugarListModel = new DefaultListModel();
          LugarList.setModel(LugarListModel);
          FillComboAtletas();
     }
     
     private void FillComboAtletas(){
        Atleta.List.forEach((key, value) -> {
            if (value instanceof Atleta){
                ComboAtletas.addItem(key);
            }
        });
    }
     
     private void FillPruebaList(){
          if (atleta == null){
               return;
          }
          if (PruebaListModel != null){
               PruebaListModel.removeAllElements();
          }
          for (Marca marca : marcas){
               PruebaListModel.addElement(marca.getPrueba().getNombre());
          }
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
     }
     
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
                         break;
                    }
               }
          }
     }
     
     private void FillCompetenciaList(){
          if (atleta == null){
               return;
          }
          if (CompetenciaListModel != null){
               CompetenciaListModel.removeAllElements();
          }
          
          for (Marca marca : marcas){
               CompetenciaListModel.addElement(marca.getCompetencia().getNombre());
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
     }
     
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
     }
     
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
          PruebaList = new javax.swing.JList<>();
          EnviarButton = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setText("Mejores Marcas por Atleta");

          jLabel2.setText("Atleta");

          ComboAtletas.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComboAtletasActionPerformed(evt);
               }
          });

          jLabel3.setText("Prueba");

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

          jScrollPane4.setViewportView(PruebaList);

          EnviarButton.setText("Enviar");
          EnviarButton.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    EnviarButtonActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(48, 48, 48))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(52, 52, 52)
                              .addComponent(jLabel3)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(63, 63, 63))
                                   .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(EnviarButton)
                                             .addGroup(layout.createSequentialGroup()
                                                  .addComponent(jLabel2)
                                                  .addGap(27, 27, 27)
                                                  .addComponent(ComboAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel5)
                              .addGap(58, 58, 58)
                              .addComponent(jLabel6))
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(28, 28, 28)
                              .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(32, 32, 32))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(172, 172, 172))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(ComboAtletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(CerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EnviarButton)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(jLabel6)
                         .addComponent(jLabel4)
                         .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jScrollPane1)
                         .addComponent(jScrollPane2)
                         .addComponent(jScrollPane3)
                         .addComponent(jScrollPane4))
                    .addContainerGap(42, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void ComboAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAtletasActionPerformed
          // TODO add your handling code here:
          atleta = (Atleta) Atleta.List.get((String) ComboAtletas.getSelectedItem());
          
          if (atleta == null){
               return;
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
          pruebas = new ArrayList<>();
          pruebasName = new ArrayList<>();
          marcas = new ArrayList<>();
          EscogerMarcas();
          FillPruebaList();
          FillCompetenciaList();
          FillMarcaList();
          FillLugarList();
     }//GEN-LAST:event_ComboAtletasActionPerformed

     private void CerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarButtonActionPerformed
          // TODO add your handling code here:
          dispose();
          MenuPrincipal menu = new MenuPrincipal();
          menu.setVisible(true);
     }//GEN-LAST:event_CerrarButtonActionPerformed

     private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
          // TODO add your handling code here:
          if (atleta == null){
               return;
          }
          String nombreAtleta = atleta.getNombre() + " " + atleta.getApellido1() + " " + atleta.getApellido2();
          String texto = "Mejores marcas del atleta: " + nombreAtleta +", Identificación: "+ atleta.getId() + 
                  "\n" + StringUtils.rightPad("Prueba", 50)+ StringUtils.rightPad("Competencia",50) +StringUtils.rightPad("Marca", 20) + StringUtils.rightPad("Lugar",40)+  "\n";
          
          for (Marca marca : marcas){
               String resultado = new String();
               if (!marca.getPrueba().getDisciplina().getTipo()){ // si se mide con tiempo
                    resultado = Marca.convertToString(marca.getResultado());
               } else {
                    resultado = Double.toString(marca.getResultado());
               } 
               texto += StringUtils.rightPad(marca.getPrueba().getNombre(), 50)+ StringUtils.rightPad(marca.getCompetencia().getNombre(),50) 
                       +StringUtils.rightPad(resultado, 20) + StringUtils.rightPad(Integer.toString(marca.getLugar()),40) + "\n";
          }
          
          for(Map.Entry entry : Atleta.List.entrySet()){
               Object Items = entry.getValue();
               
               Persona visor = (Persona) Items;
               if (visor instanceof Visor){
                    try {     
                         JavaMailUtil.sendMail(visor.getCorreo(), texto, nombreAtleta);
                         JOptionPane.showMessageDialog(this, "Mensaje enviado con éxito.");
                    }
                    catch (MessagingException e){
                         JOptionPane.showMessageDialog(this, "Mensaje no se pudo enviar.", 
                              "Error", JOptionPane.ERROR_MESSAGE);
                    }
               }
         }       
     }//GEN-LAST:event_EnviarButtonActionPerformed

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
               java.util.logging.Logger.getLogger(MejoresMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(MejoresMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(MejoresMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(MejoresMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new MejoresMarcas().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton CerrarButton;
     private javax.swing.JComboBox<String> ComboAtletas;
     private javax.swing.JList<String> CompetenciaList;
     private javax.swing.JButton EnviarButton;
     private javax.swing.JList<String> LugarList;
     private javax.swing.JList<String> MarcaList;
     private javax.swing.JList<String> PruebaList;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     private javax.swing.JScrollPane jScrollPane4;
     // End of variables declaration//GEN-END:variables
}
