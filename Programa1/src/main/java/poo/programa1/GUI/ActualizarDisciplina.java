package poo.programa1.GUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import javax.swing.JOptionPane;
import poo.programa1.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dandi
 */
        
        
public class ActualizarDisciplina extends javax.swing.JFrame {
    private String pNombre;
    private String pMedida;
    private Disciplina disciplina;

    private void FillComboDisciplinas(){
          for(Map.Entry entry : Disciplina.disciplinas.entrySet()){
               Object Items = entry.getKey();
               ComboDisciplinas.addItem((String) Items);
          }
     }  
    /**
     * Creates new form AgregarAtleta
     */
    public ActualizarDisciplina(){
        initComponents();
        this.setLocationRelativeTo(null);
        FillComboDisciplinas();
        ComboDisciplinas.setSelectedItem(null);
        NombreTXT.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          AgregarAtletaTitle = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          NombreTXT = new javax.swing.JTextField();
          AceptarDisciplinaButton = new javax.swing.JButton();
          CancelarAtletaButton = new javax.swing.JButton();
          ComboDisciplinas = new javax.swing.JComboBox<>();
          MedidaCombo = new javax.swing.JComboBox<>();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          AgregarAtletaTitle.setText("Actualizar Disciplina");

          jLabel2.setText("Nombre:");

          jLabel3.setText("Tipo de medida");

          jLabel5.setText("Disciplina");

          NombreTXT.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    NombreTXTActionPerformed(evt);
               }
          });

          AceptarDisciplinaButton.setText("Aceptar");
          AceptarDisciplinaButton.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AceptarDisciplinaButtonActionPerformed(evt);
               }
          });

          CancelarAtletaButton.setText("Cancelar");
          CancelarAtletaButton.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CancelarAtletaButtonActionPerformed(evt);
               }
          });

          ComboDisciplinas.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ComboDisciplinasActionPerformed(evt);
               }
          });

          MedidaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo", "Distancia", " " }));

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                              .addComponent(jLabel2)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(AceptarDisciplinaButton)
                                             .addComponent(CancelarAtletaButton))
                                        .addGap(26, 26, 26))
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(ComboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel5)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(28, 28, 28)
                                        .addComponent(MedidaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(AgregarAtletaTitle)
                    .addGap(204, 204, 204))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                              .addComponent(AceptarDisciplinaButton)
                              .addGap(49, 49, 49)
                              .addComponent(CancelarAtletaButton))
                         .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                              .addComponent(AgregarAtletaTitle)
                              .addGap(18, 18, 18)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel5)
                                   .addComponent(ComboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(53, 53, 53)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jLabel2)
                                   .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(MedidaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void AceptarDisciplinaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarDisciplinaButtonActionPerformed
        // TODO add your handling code here:
        disciplina = Disciplina.disciplinas.get((String)ComboDisciplinas.getSelectedItem());
          if (disciplina == null){
               return;
          }
        pNombre = NombreTXT.getText();
        if (2 > pNombre.length() || pNombre.length() > 20){
            JOptionPane.showMessageDialog(this, "El nombre debe tener una longitud de 2 a 20 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        pMedida = (String) MedidaCombo.getSelectedItem();
        if (pMedida == "Tiempo"){
             disciplina.setTipo(false);
        } else{
             disciplina.setTipo(true);
        }
        
        disciplina.setNombre(pNombre);
        String successMessage = "¡Disciplina actualizada con éxito!";
        JOptionPane.showMessageDialog(this, successMessage);
     
    }//GEN-LAST:event_AceptarDisciplinaButtonActionPerformed

    private void NombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTXTActionPerformed
        // TODO add your handling code here:
        pNombre = NombreTXT.getText();
    }//GEN-LAST:event_NombreTXTActionPerformed

    
    private void CancelarAtletaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAtletaButtonActionPerformed
        // TODO add your handling code here:
        //  Close
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_CancelarAtletaButtonActionPerformed

    private void ComboDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDisciplinasActionPerformed
        // TODO add your handling code here:
        disciplina = Disciplina.disciplinas.get((String)ComboDisciplinas.getSelectedItem());
          if (disciplina == null){
               return;
          }
        NombreTXT.setText(disciplina.getNombre());
        if(disciplina.getTipo()){
             MedidaCombo.setSelectedItem("Distancia");
        } else {
             MedidaCombo.setSelectedItem("Tiempo");
        }
    }//GEN-LAST:event_ComboDisciplinasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarDisciplina().setVisible(true);
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton AceptarDisciplinaButton;
     private javax.swing.JLabel AgregarAtletaTitle;
     private javax.swing.JButton CancelarAtletaButton;
     private javax.swing.JComboBox<String> ComboDisciplinas;
     private javax.swing.JComboBox<String> MedidaCombo;
     private javax.swing.JTextField NombreTXT;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel5;
     // End of variables declaration//GEN-END:variables
}
