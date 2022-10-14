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
 *
 * @author Dandiego
 */
public class Disciplina {
    private String nombre;
    private boolean tipo;
    public ArrayList<Prueba> pruebas;
    
    public static HashMap<String, Disciplina> disciplinas = new HashMap<>();
    
    public Disciplina(String pNombre, boolean pTipo){
        nombre = pNombre;
        tipo = pTipo;
        pruebas = new ArrayList<Prueba>();
        Disciplina.disciplinas.put(pNombre,  this);
    }
    
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
    
    public Prueba getPrueba(String pNombre, String pCategoria, String pGenero){
        for (Prueba prueba : pruebas){
            if (prueba.equals(pNombre, pCategoria, pGenero)){
                return prueba;
            }
        }
        return null;
    }
    
    public String getNombre(){
         return nombre;
    }
    
    public boolean getTipo(){
         return tipo;
    }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public void setTipo(boolean tipo) {
          this.tipo = tipo;
     }
    
    
}
