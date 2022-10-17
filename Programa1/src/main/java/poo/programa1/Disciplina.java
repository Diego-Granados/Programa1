/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import poo.programa1.GUI.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 * Esta clase se usa para representar las disciplinas de atletismo.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */
public class Disciplina {
    private String nombre;
    private boolean tipo;

    /**
     * Cada Disciplina va a estar compuesto por sus propias pruebas.
     * Estas están contenidas en este ArrayList. A partir de esta lista,
     * es como se puede acceder a estas pruebas.
     */
    public ArrayList<Prueba> pruebas;
    
    /**
     * Este HashMap relaciona el nombre de las disciplinas con su objeto.
     * De esta forma, podemos fácilmente obtener la disciplina con solamente su nombre.
     */
    public static HashMap<String, Disciplina> disciplinas = new HashMap<>();
    
    /**
     * Constructor de Disciplina
     * @param pNombre
     * @param pTipo
     */
    public Disciplina(String pNombre, boolean pTipo){
        nombre = pNombre;
        tipo = pTipo;
        pruebas = new ArrayList<Prueba>();
        Disciplina.disciplinas.put(pNombre,  this); // se agrega a sí misma a la lista de disciplinas.
    }
    
    /**
     * Método para agregar un prueba la disciplina.
     * Genera una excepción si la prueba ya existe.
     * @param pNombre
     * @param pCategoria
     * @param pGenero
     * @throws Exception
     */
    public void agregarPrueba(String pNombre, String pCategoria, String pGenero) throws Exception{
        Prueba prueba = new Prueba(pNombre, pCategoria, pGenero, this);
        for (Prueba elemento : pruebas){
            if (elemento.equals(prueba)){
                 Exception e = new Exception("La prueba ingresada ya está registrada");
                 throw e;
            }
        }
        pruebas.add(prueba);
    }
    
    /**
     * Método para obtener una prueba de la lista de pruebas de la disciplina.
     * @param pNombre
     * @param pCategoria
     * @param pGenero
     * @return la prueba que se solicita. null si no la encuentra.
     */
    public Prueba getPrueba(String pNombre, String pCategoria, String pGenero){
        for (Prueba prueba : pruebas){
            if (prueba.equals(pNombre, pCategoria, pGenero)){
                return prueba;
            }
        }
        return null;
    }
    
    /**
     * Método para obtener el nombre.
     * @return nombre
     */
    public String getNombre(){
         return nombre;
    }
    
    /**
     * Método para obtener el tipo.
     * @return tipo
     */
    public boolean getTipo(){
         return tipo;
    }

    /**
     * Método para establecer el nombre del string.
     * @param nombre
     */
    public void setNombre(String nombre) {
          this.nombre = nombre;
     }

    /**
     * Método para establecer el tipo.
     * @param tipo
     */
    public void setTipo(boolean tipo) {
          this.tipo = tipo;
     }
}
