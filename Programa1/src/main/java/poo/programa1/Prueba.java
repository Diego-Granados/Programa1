/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.ArrayList;

/**
 *
 * @author dandi
 */
public class Prueba{
    private String nombre;
    private String categoria;
    private String genero;
    private Disciplina disciplina;
    private ArrayList<Marca> marcas;
    
    public Prueba(String pNombre, String pCategoria, String pGenero, Disciplina pDisciplina){
        nombre = pNombre;
        categoria = pCategoria;
        genero = pGenero;
        disciplina = pDisciplina;
        marcas = new ArrayList<Marca>();
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
    
    public boolean equals(Prueba pPrueba){
        if (this.nombre.equals(pPrueba.getNombre()) && 
                this.categoria.equals(pPrueba.getCategoria()) && 
                this.genero.equals(pPrueba.getGenero())){
            return true;
        }
        return false;
    }
    
    public boolean equals(String pNombre, String pCategoria, String pGenero){
        if (this.nombre.equals(pNombre) && 
                this.categoria.equals(pCategoria) && 
                this.genero.equals(pGenero)){
            return true;
        }
        return false;
    }
    
    public void agregarMarca(Marca pMarca){
        marcas.add(pMarca);
    }
}
