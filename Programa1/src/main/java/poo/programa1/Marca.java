/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.text.DecimalFormat;
/**
 *
 * @author Dandiego
 */
public class Marca {
    private double resultado;
    private Atleta atleta;
    private Prueba prueba;
    private Competencia competencia;
    private int lugar;
    private int dorsal;
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public Marca(Atleta pAtleta, double pResultado, Prueba pPrueba, Competencia pCompetencia){
        atleta = pAtleta;
        resultado = pResultado;
        prueba = pPrueba;
        competencia = pCompetencia;
        dorsal = pPrueba.getContador(competencia);
        lugar = 0;
        pPrueba.agregarMarca(this);
        pAtleta.agregarMarca(this);
    }
    public void setResultado(double pResultado){
        resultado = pResultado;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    public int getLugar(){
         return lugar;
    }
    
    public void setLugar(int pLugar){
         lugar = pLugar;
    }
    
    public void setDorsal(int pDorsal){
         dorsal = pDorsal;
    }

     public int getDorsal() {
          return dorsal;
     }
    
    
    
    public static double convertToTime(String tiempo){
         String[] partes = tiempo.split(":");
         double hours = Double.parseDouble(partes[0]);
         double minutes = Double.parseDouble(partes[1]);
        
         partes = partes[2].split("\\.");
         double seconds = Double.parseDouble(partes[0]);
         double second100th = Double.parseDouble(partes[1]);
         hours *= 3600;
         minutes *= 60;
         second100th /= 100;
         return hours + minutes + seconds + second100th;
    }
    
    public static String convertToString(double tiempo){
         tiempo *= 100;
         tiempo = Double.parseDouble(df.format(tiempo));
         int tiempo2 = (int) tiempo;
         int second100th = tiempo2 % 100;
         
         tiempo2 /= 100;
         int hours = tiempo2 / 3600;
         tiempo2 %= 3600;
         int minutes = tiempo2 / 60;
         int seconds = tiempo2 %= 60;
         String time = new String();
         if (hours < 10){
              time += "0";
         }
         time +=Integer.toString(hours) +":";
         if (minutes < 10){
              time += "0";
         }
         time +=Integer.toString(minutes) +":";
         if (seconds < 10){
              time += "0";
         }
         time +=Integer.toString(seconds) +".";
         if (second100th < 10){
              time += "0";
         }
         time +=Integer.toString(second100th);
         
         
         return time;         
    }
    
    public boolean equals(Atleta pAtleta, double pResultado, Prueba pPrueba, Competencia pCompetencia){
        if (this.atleta.getId().equals(pAtleta.getId()) && 
                resultado == pResultado && 
                this.prueba.getNombre().equals(pPrueba.getNombre()) && this.competencia.getNombre() == pCompetencia.getNombre()){
            return true;
        }
        return false;
    }

}
