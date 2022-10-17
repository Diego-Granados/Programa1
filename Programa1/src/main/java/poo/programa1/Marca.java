/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.text.DecimalFormat;
/**
 * Esta clase se usa para representar las disciplinas de atletismo.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */

public class Marca {
    private double resultado;
    private Atleta atleta;
    private Prueba prueba;
    private Competencia competencia;
    private int lugar;
    private int dorsal;
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    /**
     * Constructor de Marca
     * @param pAtleta
     * @param pResultado
     * @param pPrueba
     * @param pCompetencia
     */
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

    /**
     * Método para establecer el resultado de la marca.
     * @param pResultado
     */
    public void setResultado(double pResultado){
        resultado = pResultado;
    }
    
    /**
     * Método para obtener el resultado de la marca.
     * @return resultado
     */
    public double getResultado(){
        return resultado;
    }
    
    /**
     * Método para obtener el atleta de la marca.
     * @return atleta
     */
    public Atleta getAtleta() {
        return atleta;
    }

    /**
     * Método para establecer el atleta de la marca.
     * @param atleta
     */
    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    /**
     * Método para obtener la prueba de la marca
     * @return prueba
     */
    public Prueba getPrueba() {
        return prueba;
    }

    /**
     * Método para establecer la prueba de la marca
     * @param prueba
     */
    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    /**
     * Método para obtener la competencia de la marca
     * @return competencia
     */
    public Competencia getCompetencia() {
        return competencia;
    }

    /**
     * Método para establecer la competencia de la marca
     * @param competencia
     */
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    /**
     * Método para obtener el lugar de la marca en la tabla de posiciones.
     * @return lugar en la tabla de posiciones.
     */
    public int getLugar(){
         return lugar;
    }
    
    /**
     * Método para establecer el lugar de la marca en la tabla de posiciones.
     * @param pLugar
     */
    public void setLugar(int pLugar){
         lugar = pLugar;
    }
    
    /**
     * Método para establecer el dorsal de la marca en la tabla de posiciones.
     * @param pDorsal
     */
    public void setDorsal(int pDorsal){
         dorsal = pDorsal;
    }

    /**
     * Método para obtener el dorsal de la marca en la tabla de posiciones.
     * @return dorsal
     */
    public int getDorsal() {
          return dorsal;
     }
    
    /**
     * Método para convertir el resultado de tiempo de un string a un double.
     * @param tiempo
     * @return el equivalente en double del tiempo dado
     */
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
    
    /**
     * Método que convierte el resultado de un double a un string.
     * @param tiempo
     * @return Equivalente en string del resultado.
     */
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
    
    /**
     * Función para revisar si dos marcas son iguales
     * @param pAtleta
     * @param pResultado
     * @param pPrueba
     * @param pCompetencia
     * @return true si son iguales y false si no lo son.
     */
    public boolean equals(Atleta pAtleta, double pResultado, Prueba pPrueba, Competencia pCompetencia){
        if (this.atleta.getId().equals(pAtleta.getId()) && 
                resultado == pResultado && 
                this.prueba.getNombre().equals(pPrueba.getNombre()) && this.competencia.getNombre() == pCompetencia.getNombre()){
            return true;
        }
        return false;
    }

}
