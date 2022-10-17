/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.programa1.GUI;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import javax.swing.JOptionPane;
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
            atl = new Atleta("Manuel", "Granados", "Retana", "118790546", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            atl = new Atleta("Andrew", "Granados", "Retana", "118790547", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            atl = new Atleta("Gabriela", "Granados", "Retana", "118790548", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            atl = new Atleta("Gloria", "Granados", "Retana", "118790549", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            atl = new Atleta("Javier", "Granados", "Retana", "118790543", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            atl = new Atleta("Diego", "Granados", "Retana", "118790545", "CRC", pFecha, 
                    "dandiegogranados@gmail.com", "22222222222222222222");
            LocalDate pFechainicio = LocalDate.parse("2022-12-05",formatter);
            LocalDate pFechafinal = LocalDate.parse("2022-12-07", formatter);
            LocalDate pFechainicio2 = LocalDate.parse("2022-06-29",formatter);
            LocalDate pFechafinal2 = LocalDate.parse("2022-06-31", formatter);
            Competencia competencia = new Competencia("Carrera Powerade", 1, "Costa Rica", "La sabana",pFechainicio,  pFechafinal);
            Competencia competencia2 = new Competencia("Festival Deportivo", 2, "CRI Costa Rica", "Saint Anthony School",pFechainicio2,  pFechafinal2);
            Disciplina carreravelocidad = new Disciplina("Carrera de velocidad", false);
            Disciplina saltolargo = new Disciplina("Salto largo", true);
            try{
               saltolargo.agregarPrueba("Salto largo Hombres", "Master", "Hombres");
          }
          catch (Exception e){
               JOptionPane.showMessageDialog(this, "La prueba ingresada ya está registrada", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                     return;
          }
            try{
               carreravelocidad.agregarPrueba("100 metros Mayor Hombres", "Mayor", "Hombres");
          }
          catch (Exception e){
               JOptionPane.showMessageDialog(this, "La prueba ingresada ya está registrada", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                     return;
          }
            try{
               carreravelocidad.agregarPrueba("200 metros U20 Mujeres", "U20", "Mujeres");
          }
          catch (Exception e){
               JOptionPane.showMessageDialog(this, "La prueba ingresada ya está registrada", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                     return;
          }
           competencia.agregarDisciplina(carreravelocidad);
           competencia.agregarDisciplina(saltolargo);
           competencia2.agregarDisciplina(saltolargo);
           for (Prueba prueba : carreravelocidad.pruebas){
               competencia.pruebasDict.get(carreravelocidad).add(prueba);
               prueba.agregarCompetencia(competencia);
               double resultado = 0;
               String tiempo = "00:01:10.0";
               int j = 9;
               for(Map.Entry entry : Atleta.List.entrySet()){
                    Object atleta = entry.getValue();
                    if (atleta instanceof Atleta){
                         String tiempo2 = tiempo + Integer.toString(j);
                         System.out.println(tiempo2);
                         resultado = Marca.convertToTime(tiempo2);
                         competencia.agregarMarca((Atleta) atleta, resultado, prueba);
                         j--;
                    }
               }
          }
           for (Prueba prueba : saltolargo.pruebas){
               competencia.pruebasDict.get(saltolargo).add(prueba);
               prueba.agregarCompetencia(competencia);
               double resultado = 1;
               for(Map.Entry entry : Atleta.List.entrySet()){
                    Object atleta = entry.getValue();
                    if (atleta instanceof Atleta){
                         competencia.agregarMarca((Atleta) atleta, resultado, prueba);
                         resultado++;
                    }
               }
          }
           for (Prueba prueba : saltolargo.pruebas){
               competencia2.pruebasDict.get(saltolargo).add(prueba);
               prueba.agregarCompetencia(competencia2);
               double resultado = 15;
               for(Map.Entry entry : Atleta.List.entrySet()){
                    Object atleta = entry.getValue();
                    if (atleta instanceof Atleta){
                         competencia2.agregarMarca((Atleta) atleta, resultado, prueba);
                         resultado--;
                    }
               }
           }       
           
           
            
            
            
          
            Visor vis = new Visor("Bebo", "Babich", "Bebé", "Bobo", "Bebe", pFecha, "sistemacajero2022@gmail.com", "babebibobubabebibobu");   
            vis.agregarAtleta(atl);
            System.out.println(Marca.convertToTime("00:01:10.07"));
            System.out.println(Marca.convertToString(70.07));
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
            jLabel7 = new javax.swing.JLabel();
            AgregarVisor = new javax.swing.JButton();
            VisorActualizar = new javax.swing.JButton();
            VisorEliminar = new javax.swing.JButton();
            ConfigButton = new javax.swing.JButton();

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
            PruebaActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        PruebaActualizarActionPerformed(evt);
                  }
            });

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
            DisciplinaActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        DisciplinaActualizarActionPerformed(evt);
                  }
            });

            DisciplinaEliminar.setText("Eliminar");
            DisciplinaEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        DisciplinaEliminarActionPerformed(evt);
                  }
            });

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
            CompetenciaActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CompetenciaActualizarActionPerformed(evt);
                  }
            });

            CompetenciaEliminar.setText("Eliminar");
            CompetenciaEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CompetenciaEliminarActionPerformed(evt);
                  }
            });

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
            AtletaEliminar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AtletaEliminarActionPerformed(evt);
                  }
            });

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

            jLabel7.setText("Visores");

            AgregarVisor.setText("Agregar");
            AgregarVisor.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AgregarVisorActionPerformed(evt);
                  }
            });

            VisorActualizar.setText("Actualizar listas de pruebas");
            VisorActualizar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        VisorActualizarActionPerformed(evt);
                  }
            });

            VisorEliminar.setText("Eliminar");

            ConfigButton.setText("Configuración");
            ConfigButton.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ConfigButtonActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(258, 258, 258)
                                                .addComponent(AtletaActualizar))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                              .addComponent(AtletaAgregar)
                                                                              .addComponent(PruebaAgregar)
                                                                              .addComponent(CompetenciaAgregar)
                                                                              .addComponent(AgregarVisor)
                                                                              .addComponent(MarcaAgregar))
                                                                        .addGap(18, 18, Short.MAX_VALUE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(PruebaConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(CompetenciaConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                    .addComponent(AtletaConsultar, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                              .addComponent(MarcaConsultar)))
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(DisciplinaAgregar)
                                                                        .addGap(37, 37, 37)
                                                                        .addComponent(DisciplinaConsultar))))
                                                      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(jLabel7))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGap(38, 38, 38)
                                                            .addComponent(CompetenciaActualizar))
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(VisorActualizar))
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addGap(38, 38, 38)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                              .addComponent(DisciplinaActualizar)
                                                                              .addComponent(PruebaActualizar)
                                                                              .addComponent(MarcaActualizar))))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(MarcaEliminar)
                                                                  .addComponent(VisorEliminar)
                                                                  .addComponent(DisciplinaEliminar)
                                                                  .addComponent(PruebaEliminar)
                                                                  .addComponent(CompetenciaEliminar)
                                                                  .addComponent(AtletaEliminar))))))
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ConfigButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1)
                              .addComponent(ConfigButton))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(DisciplinaConsultar)
                              .addComponent(DisciplinaAgregar)
                              .addComponent(DisciplinaActualizar)
                              .addComponent(DisciplinaEliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3)
                              .addComponent(PruebaAgregar)
                              .addComponent(PruebaConsultar)
                              .addComponent(PruebaActualizar)
                              .addComponent(PruebaEliminar))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel5)
                              .addComponent(CompetenciaAgregar)
                              .addComponent(CompetenciaConsultar)
                              .addComponent(CompetenciaActualizar)
                              .addComponent(CompetenciaEliminar))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel4)
                              .addComponent(AtletaAgregar)
                              .addComponent(AtletaConsultar)
                              .addComponent(AtletaActualizar)
                              .addComponent(AtletaEliminar))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel7)
                              .addComponent(AgregarVisor)
                              .addComponent(VisorActualizar)
                              .addComponent(VisorEliminar))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel6)
                              .addComponent(MarcaAgregar)
                              .addComponent(MarcaConsultar)
                              .addComponent(MarcaActualizar)
                              .addComponent(MarcaEliminar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

    private void PruebaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaAgregarActionPerformed
        // TODO add your handling code here:
        dispose();
        AgregarPrueba window = new AgregarPrueba();
        window.setVisible(true);
    }//GEN-LAST:event_PruebaAgregarActionPerformed

    private void PruebaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaConsultarActionPerformed
        // TODO add your handling code here:
        dispose();
        ConsultarPrueba window = new ConsultarPrueba();
        window.setVisible(true);
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
        dispose();
         ConsultarDisciplina agregarAtletaW = new ConsultarDisciplina();
         agregarAtletaW.setVisible(true);
    }//GEN-LAST:event_DisciplinaConsultarActionPerformed

    private void CompetenciaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaAgregarActionPerformed
        // TODO add your handling code here:
        dispose();
         AgregarCompetencia agregarAtletaW = new AgregarCompetencia();
         agregarAtletaW.setVisible(true);
    }//GEN-LAST:event_CompetenciaAgregarActionPerformed

    private void CompetenciaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaConsultarActionPerformed
        // TODO add your handling code here:
        dispose();
        ConsultarCompetencia window = new ConsultarCompetencia();
        window.setVisible(true);
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

    private void MarcaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaConsultarActionPerformed
        // TODO add your handling code here:
        dispose();
        ConsultarMarca window = new ConsultarMarca();
        window.setVisible(true);
    }//GEN-LAST:event_MarcaConsultarActionPerformed

    private void AtletaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtletaActualizarActionPerformed
        // TODO add your handling code here:
        System.out.println("Actualizar Atleta Button Pressed.");
        dispose();
        ActualizarAtleta window = new ActualizarAtleta();
        window.setVisible(true);
    }//GEN-LAST:event_AtletaActualizarActionPerformed

     private void CompetenciaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaActualizarActionPerformed
          // TODO add your handling code here:}
          dispose();
          ActualizarCompetencia window = new ActualizarCompetencia();
          window.setVisible(true);
     }//GEN-LAST:event_CompetenciaActualizarActionPerformed

     private void AgregarVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVisorActionPerformed
          // TODO add your handling code here:
          dispose();
         AgregarVisor agregarAtletaW = new AgregarVisor();
         agregarAtletaW.setVisible(true);
     }//GEN-LAST:event_AgregarVisorActionPerformed

     private void MarcaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaAgregarActionPerformed
          // TODO add your handling code here:
          dispose();
          AddMarcasComp addmarcas = new AddMarcasComp();
          addmarcas.setVisible(true);
     }//GEN-LAST:event_MarcaAgregarActionPerformed

     private void ConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigButtonActionPerformed
          // TODO add your handling code here:
          dispose();
          ConfiguracionFrame window = new ConfiguracionFrame();
          window.setVisible(true);
     }//GEN-LAST:event_ConfigButtonActionPerformed

     private void DisciplinaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaActualizarActionPerformed
          // TODO add your handling code here:
          dispose();
          ActualizarDisciplina window = new ActualizarDisciplina();
          window.setVisible(true);
     }//GEN-LAST:event_DisciplinaActualizarActionPerformed

     private void PruebaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaActualizarActionPerformed
          // TODO add your handling code here:
          dispose();
          ActualizarPrueba window = new ActualizarPrueba();
          window.setVisible(true);
     }//GEN-LAST:event_PruebaActualizarActionPerformed

      private void VisorActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorActualizarActionPerformed
            // TODO add your handling code here:
            dispose();
          ActualizarListaAtletas window = new ActualizarListaAtletas();
          window.setVisible(true);
      }//GEN-LAST:event_VisorActualizarActionPerformed

      private void AtletaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtletaEliminarActionPerformed
            // TODO add your handling code here:
            dispose();
            EliminarAtleta window = new EliminarAtleta();
            window.setVisible(true);
      }//GEN-LAST:event_AtletaEliminarActionPerformed

      private void DisciplinaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplinaEliminarActionPerformed
            // TODO add your handling code here:
            dispose();
            EliminarDisciplina window = new EliminarDisciplina();
            window.setVisible(true);
      }//GEN-LAST:event_DisciplinaEliminarActionPerformed

      private void CompetenciaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompetenciaEliminarActionPerformed
            // TODO add your handling code here:
            dispose();
            EliminarCompetencia window = new EliminarCompetencia();
            window.setVisible(true);
      }//GEN-LAST:event_CompetenciaEliminarActionPerformed

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
      private javax.swing.JButton AgregarVisor;
      private javax.swing.JButton AtletaActualizar;
      private javax.swing.JButton AtletaAgregar;
      private javax.swing.JButton AtletaConsultar;
      private javax.swing.JButton AtletaEliminar;
      private javax.swing.JButton CompetenciaActualizar;
      private javax.swing.JButton CompetenciaAgregar;
      private javax.swing.JButton CompetenciaConsultar;
      private javax.swing.JButton CompetenciaEliminar;
      private javax.swing.JButton ConfigButton;
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
      private javax.swing.JButton VisorActualizar;
      private javax.swing.JButton VisorEliminar;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      // End of variables declaration//GEN-END:variables
}
