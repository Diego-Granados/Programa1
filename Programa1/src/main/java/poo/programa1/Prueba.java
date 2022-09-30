/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

/**
 *
 * @author dandi
 */
public class Prueba {
    private String nombre;
    private String categoria;
    private String genero;
    
    public Prueba(String pNombre, String pCategoria, String pGenero){
        nombre = pNombre;
        categoria = pCategoria;
        genero = pGenero;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String pCategoria){
        categoria = pCategoria;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String pGenero){
        genero = pGenero;
    }
    
}
