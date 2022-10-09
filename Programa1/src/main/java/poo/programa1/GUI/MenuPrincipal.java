/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import poo.programa1.*;

/**
 *
 * @author dandi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate pFecha = LocalDate.parse("2003-07-04", formatter);
        if (!Atleta.List.containsKey("118790544")){
            Atleta atl = new Atleta("Daniel", "Granados", "Retana", "118790544", "CRC", pFecha, 
                    "dandiego235@gmail.com", "11111111111111111111");
            atl = new Atleta("Diego", "Granados", "Retana", "118790545", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");

            Visor vis = new Visor("Bebo", "Babich", "Bebé", "Bobo", "Bebe", pFecha, "babas", "babebibobubabebibobu");   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PruebaAgregar = new javax.swing.JButton();
        PruebaConsultar = new javax.swing.JButton();
        PruebaActualizar = new javax.swing.JButton();
        PruebaEliminar = new javax.swing.JButton();
        DisciplinaAgregar = new javax.swing.JButton();
        DisciplinaConsultar = new javax.swing.JButton();
        DisciplinaActualizar = new javax.swing.JButton();
        DisciplinaEliminar = new javax.swing.JButton();
        CompetenciaAgregar = new javax.swing.JButton();
        CompetenciaConsultar = new javax.swing.JButton();
        CompetenciaActualizar = new javax.swing.JButton();
        CompetenciaEliminar = new javax.swing.JButton();
        AtletaAgregar = new javax.swing.JButton();
        AtletaConsultar = new javax.swing.JButton();
        AtletaActualizar = new javax.swing.JButton();
        AtletaEliminar = new javax.swing.JButton();
        MarcaAgregar = new javax.swing.JButton();
        MarcaConsultar = new javax.swing.JButton();
        MarcaActualizar = new javax.swing.JButton();
        MarcaEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menú Principal");

        jLabel2.setText("Disciplinas");

        jLabel3.setText("Pruebas");

        jLabel4.setText("Atletas");

        jLabel5.setText("Competencias");

        jLabel6.setText("Marcas");

        PruebaAgregar.setText("Agregar");
        PruebaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebaAgregarActionPerformed(evt);
            }
        });

        PruebaConsultar.setText("Consultar");
        PruebaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebaConsultarActionPerformed(evt);
            }
        });

        PruebaActualizar.setText("Actualizar");

        PruebaEliminar.setText("Eliminar");

        DisciplinaAgregar.setText("Agregar");
        DisciplinaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinaAgregarActionPerformed(evt);
            }
        });

        DisciplinaConsultar.setText("Consultar");
        DisciplinaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplinaConsultarActionPerformed(evt);
            }
        });

        DisciplinaActualizar.setText("Actualizar");

        DisciplinaEliminar.setText("Eliminar");

        CompetenciaAgregar.setText("Agregar");
        CompetenciaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompetenciaAgregarActionPerformed(evt);
            }
        });

        CompetenciaConsultar.setText("Consultar");
        CompetenciaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompetenciaConsultarActionPerformed(evt);
            }
        });

        CompetenciaActualizar.setText("Actualizar");

        CompetenciaEliminar.setText("Eliminar");

        AtletaAgregar.setText("Agregar");
        AtletaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtletaAgregarActionPerformed(evt);
            }
        });

        AtletaConsultar.setText("Consultar");
        AtletaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtletaConsultarActionPerformed(evt);
            }
        });

        AtletaActualizar.setText("Actualizar");
        AtletaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtletaActualizarActionPerformed(evt);
            }
        });

        AtletaEliminar.setText("Eliminar");

        MarcaAgregar.setText("Agregar");
        MarcaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaAgregarActionPerformed(evt);
            }
        });

        MarcaConsultar.setText("Consultar");
        MarcaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaConsultarActionPerformed(evt);
            }
        });

        MarcaActualizar.setText("Actualizar");

        MarcaEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AtletaAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PruebaAgregar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DisciplinaAgregar)
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AtletaConsultar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(DisciplinaConsultar)
                                                .addComponent(PruebaConsultar)))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AtletaActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(PruebaActualizar)
                                            .addComponent(DisciplinaActualizar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CompetenciaAgregar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(CompetenciaConsultar)
                                        .addGap(38, 38, 38)
                                        .addComponent(CompetenciaActualizar)))
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PruebaEliminar)
                            .addComponent(AtletaEliminar)
                            .addComponent(DisciplinaEliminar)
                            .addComponent(CompetenciaEliminar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(MarcaAgregar)
                        .addGap(39, 39, 39)
                        .addComponent(MarcaConsultar)
                        .addGap(36, 36, 36)
                        .addComponent(MarcaActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MarcaEliminar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DisciplinaConsultar)
                    .addComponent(DisciplinaAgregar)
                    .addComponent(DisciplinaActualizar)
                    .addComponent(DisciplinaEliminar))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PruebaAgregar)
                    .addComponent(PruebaActualizar)
                    .addComponent(PruebaEliminar)
                    .addComponent(PruebaConsultar))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CompetenciaAgregar)
                        .addComponent(CompetenciaActualizar)
                        .addComponent(CompetenciaConsultar)
                        .addComponent(CompetenciaEliminar)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(AtletaAgregar)
                        .addComponent(AtletaActualizar)
                        .addComponent(AtletaConsultar))
                    .addComponent(AtletaEliminar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MarcaAgregar)
                        .addComponent(MarcaConsultar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MarcaEliminar)
                        .addComponent(MarcaActualizar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PruebaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PruebaAgregarActionPerformed

    private void PruebaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PruebaConsultarActionPerformed

    private void DisciplinaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println("Agregar Disciplina Button Pressed.");
        dispose();
        AgregarDisciplina agregarDisciplinaW = new AgregarDisciplina();
        agregarDisciplinaW.setVisible(true);
    }//GEN-LAST:event_DisciplinaAgregarActionPerformed

    private void DisciplinaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisciplinaConsultarActionPerformed

    private void CompetenciaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompetenciaAgregarActionPerformed

    private void CompetenciaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompetenciaConsultarActionPerformed

    private void AtletaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtletaAgregarActionPerformed
        System.out.println("Agregar Atleta Button Pressed.");
        dispose();
        AgregarAtleta agregarAtletaW = new AgregarAtleta();
        agregarAtletaW.setVisible(true);
    }//GEN-LAST:event_AtletaAgregarActionPerformed

    private void AtletaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtletaConsultarActionPerformed
        // TODO add your handling code here:
        System.out.println("Consultar Atleta Button Pressed.");
        dispose();
        ConsultarAtleta window = new ConsultarAtleta();
        window.setVisible(true);
    }//GEN-LAST:event_AtletaConsultarActionPerformed

    private void MarcaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaAgregarActionPerformed

    private void MarcaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaConsultarActionPerformed

    private void AtletaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtletaActualizarActionPerformed
        // TODO add your handling code here:
        System.out.println("Actualizar Atleta Button Pressed.");
        dispose();
        ActualizarAtleta window = new ActualizarAtleta();
        window.setVisible(true);
    }//GEN-LAST:event_AtletaActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtletaActualizar;
    private javax.swing.JButton AtletaAgregar;
    private javax.swing.JButton AtletaConsultar;
    private javax.swing.JButton AtletaEliminar;
    private javax.swing.JButton CompetenciaActualizar;
    private javax.swing.JButton CompetenciaAgregar;
    private javax.swing.JButton CompetenciaConsultar;
    private javax.swing.JButton CompetenciaEliminar;
    private javax.swing.JButton DisciplinaActualizar;
    private javax.swing.JButton DisciplinaAgregar;
    private javax.swing.JButton DisciplinaConsultar;
    private javax.swing.JButton DisciplinaEliminar;
    private javax.swing.JButton MarcaActualizar;
    private javax.swing.JButton MarcaAgregar;
    private javax.swing.JButton MarcaConsultar;
    private javax.swing.JButton MarcaEliminar;
    private javax.swing.JButton PruebaActualizar;
    private javax.swing.JButton PruebaAgregar;
    private javax.swing.JButton PruebaConsultar;
    private javax.swing.JButton PruebaEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
