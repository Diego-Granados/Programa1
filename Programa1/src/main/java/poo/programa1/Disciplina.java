/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.ArrayList;

/**
 *
 * @author Dandiego
 */
public class Disciplina {
    private String nombre;
    private boolean tipo;
    private ArrayList<Prueba> pruebas;
    public Disciplina(String pNombre, boolean pTipo){
        nombre = pNombre;
        tipo = pTipo;
        pruebas = new ArrayList<Prueba>();
    }
    
    public void agregarPrueba(String pNombre, String pCategoria, String pGenero){
        Prueba prueba = new Prueba(pNombre, pCategoria, pGenero, this);
        for (Prueba elemento : pruebas){
            if (elemento.equals(prueba)){
                System.out.println("ERROR: La prueba ingresada ya está registrada. No se agregó a la lista.");
                prueba = null; // borramos la prueba
                return;
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
    
}
