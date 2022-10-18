package poo.programa1.GUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import poo.programa1.Atleta;
import java.util.Locale.IsoCountryCode;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dandi
 */
        
        
public class AgregarAtleta extends javax.swing.JFrame {
    private String pNombre;
    private String pApellido1;
    private String pApellido2;
    private String pId;
    private String pPais;
    private LocalDate pFecha;
    private String pCorreo;
    private String pTelefono;
        
    /**
     * Creates new form AgregarAtleta
     */
    public AgregarAtleta() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Apellido1TXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NombreTXT = new javax.swing.JTextField();
        Apellido2TXT = new javax.swing.JTextField();
        IDTXT = new javax.swing.JTextField();
        PaisTXT = new javax.swing.JTextField();
        FechaTXT = new javax.swing.JTextField();
        CorreoTXT = new javax.swing.JTextField();
        TelefonoTXT = new javax.swing.JTextField();
        AceptarAtletaButton = new javax.swing.JButton();
        CancelarAtletaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarAtletaTitle.setText("Agregar Atleta");

        Apellido1TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido1TXTActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Primer apellido:");

        jLabel4.setText("Segundo apellido:");

        jLabel5.setText("Identificación:");

        jLabel6.setText("País de origen:");

        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setText("Correo electrónico");

        jLabel9.setText("Teléfono:");

        NombreTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTXTActionPerformed(evt);
            }
        });

        Apellido2TXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido2TXTActionPerformed(evt);
            }
        });

        IDTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTXTActionPerformed(evt);
            }
        });

        PaisTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisTXTActionPerformed(evt);
            }
        });

        FechaTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTXTActionPerformed(evt);
            }
        });

        CorreoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTXTActionPerformed(evt);
            }
        });

        TelefonoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTXTActionPerformed(evt);
            }
        });

        AceptarAtletaButton.setText("Aceptar");
        AceptarAtletaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarAtletaButtonActionPerformed(evt);
            }
        });

        CancelarAtletaButton.setText("Cancelar");
        CancelarAtletaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarAtletaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(PaisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Apellido1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CancelarAtletaButton)
                            .addComponent(AceptarAtletaButton))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(AgregarAtletaTitle))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TelefonoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(CorreoTXT)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Apellido1TXT, Apellido2TXT, FechaTXT, IDTXT, NombreTXT, PaisTXT});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AgregarAtletaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido1TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido2TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AceptarAtletaButton)
                        .addGap(32, 32, 32)
                        .addComponent(CancelarAtletaButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarAtletaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarAtletaButtonActionPerformed
        // TODO add your handling code here:
        pNombre = NombreTXT.getText();
        System.out.println(pNombre + " "  + pNombre.length());
        if (2 > pNombre.length() || pNombre.length() > 20){
            JOptionPane.showMessageDialog(this, "El nombre debe tener una longitud de 2 a 20 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pApellido1 = Apellido1TXT.getText();
        if (2 > pApellido1.length() || pApellido1.length() > 20){
            JOptionPane.showMessageDialog(this, "El primer apellido debe tener una longitud de 2 a 20 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pApellido2 = Apellido2TXT.getText();
        if (2 > pApellido2.length() || pApellido2.length() > 20){
            JOptionPane.showMessageDialog(this, "El segundo apellido debe tener una longitud de 2 a 20 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pId = IDTXT.getText();
        if (9 > pId.length() || pId.length() > 20){
            JOptionPane.showMessageDialog(this, "La identificación debe tener una longitud de 9 a 20 caracteres", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!Atleta.List.isEmpty() && Atleta.List.containsKey(pId)){
            JOptionPane.showMessageDialog(this, "Ya hay un atleta registrado con esa identificación.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Set<String> paises = Locale.getISOCountries(IsoCountryCode.PART1_ALPHA3);
        
        pPais = PaisTXT.getText();
        if (!paises.contains(pPais)){
             JOptionPane.showMessageDialog(this, "Ese país no existe.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            pFecha = LocalDate.parse(FechaTXT.getText(), formatter);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "El formato de fecha es inválido.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        pCorreo = CorreoTXT.getText();
        // VALIDAR QUE EXISTA
        if(!JavaMailUtil.validateEmail(pCorreo)){
            JOptionPane.showMessageDialog(this, "El correo no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        pTelefono = TelefonoTXT.getText();
        if (pTelefono.length() != 20){
            JOptionPane.showMessageDialog(this, "El teléfono debe tener una longitud de 20 caracteres.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Atleta newAthlete = new Atleta( pNombre,  pApellido1,  pApellido2,  pId,  pPais,  pFecha,  pCorreo,  pTelefono);
        String successMessage = "Se creó un atleta con los parámetros " + pNombre + " " + pApellido1 + " " +  pApellido2 + " " +  pId + " " +  pPais + " " +  pFecha + " " +  pCorreo + " " +  pTelefono;
        JOptionPane.showMessageDialog(this, successMessage);  
    }//GEN-LAST:event_AceptarAtletaButtonActionPerformed

    private void NombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTXTActionPerformed
        // TODO add your handling code here:
        pNombre = NombreTXT.getText();
    }//GEN-LAST:event_NombreTXTActionPerformed

    private void Apellido2TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido2TXTActionPerformed
        // TODO add your handling code here:
        pApellido2 = Apellido2TXT.getText();
    }//GEN-LAST:event_Apellido2TXTActionPerformed

    private void IDTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTXTActionPerformed
        // TODO add your handling code here:
        pId = IDTXT.getText();
    }//GEN-LAST:event_IDTXTActionPerformed

    private void PaisTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisTXTActionPerformed
        // TODO add your handling code here:
        pPais = PaisTXT.getText();
    }//GEN-LAST:event_PaisTXTActionPerformed

    
    // ######################################
    private void FechaTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTXTActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        pFecha = LocalDate.parse(FechaTXT.getText(), formatter);
    }//GEN-LAST:event_FechaTXTActionPerformed

    private void CorreoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoTXTActionPerformed
        // TODO add your handling code here:
        pCorreo = CorreoTXT.getText();
    }//GEN-LAST:event_CorreoTXTActionPerformed

    private void TelefonoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTXTActionPerformed
        // TODO add your handling code here:
        pTelefono = TelefonoTXT.getText();
    }//GEN-LAST:event_TelefonoTXTActionPerformed

    private void CancelarAtletaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAtletaButtonActionPerformed
        // TODO add your handling code here:
        //  Close
        dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_CancelarAtletaButtonActionPerformed

    private void Apellido1TXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido1TXTActionPerformed
        // TODO add your handling code here:
        pApellido1 = Apellido1TXT.getText();
    }//GEN-LAST:event_Apellido1TXTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarAtletaButton;
    private javax.swing.JLabel AgregarAtletaTitle;
    private javax.swing.JTextField Apellido1TXT;
    private javax.swing.JTextField Apellido2TXT;
    private javax.swing.JButton CancelarAtletaButton;
    private javax.swing.JTextField CorreoTXT;
    private javax.swing.JTextField FechaTXT;
    private javax.swing.JTextField IDTXT;
    private javax.swing.JTextField NombreTXT;
    private javax.swing.JTextField PaisTXT;
    private javax.swing.JTextField TelefonoTXT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
