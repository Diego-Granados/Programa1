/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.ArrayList;
import java.util.HashMap;

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
    public HashMap<Competencia, Integer> contador;
    
    public Prueba(String pNombre, String pCategoria, String pGenero, Disciplina pDisciplina){
        nombre = pNombre;
        categoria = pCategoria;
        genero = pGenero;
        disciplina = pDisciplina;
        marcas = new ArrayList<Marca>();
        contador= new HashMap<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public ArrayList<Marca> getMarcas(){
         return marcas;
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
    
    public Disciplina getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(Disciplina pDisciplina){
        disciplina = pDisciplina;
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
    
    public void agregarCompetencia(Competencia competencia){
         contador.put(competencia, 1);
    }
    public void incrementarContador(Competencia competencia){
        contador.put(competencia, contador.get(competencia) + 1);
    }
    
    public int getContador(Competencia competencia){
        return  contador.get(competencia);
    }
    
    public void ordenarMarcasDistancia(Competencia pCompetencia){
         for (int i  = 1; i < marcas.size(); ++i){
              Marca key = marcas.get(i);
              int j = i - 1;
              while (j >= 0 && marcas.get(j).getResultado() < key.getResultado()){
                    marcas.set(j+1, marcas.get(j));
                   j = j - 1;
              }
              marcas.set(j+1, key);
         }
         darLugares(pCompetencia);
    }
    
    public void darLugares(Competencia pCompetencia){
         int i = 1;
         for (Marca marcaIter : marcas){
              if (marcaIter.getCompetencia() == pCompetencia){
                   marcaIter.setLugar(i);
                   i++;
              }           
         }
    }
    public void ordenarMarcasTiempo(Competencia pCompetencia){
         for (int i  = 1; i < marcas.size(); ++i){
              Marca key = marcas.get(i);
              int j = i - 1;
              while (j >= 0 && marcas.get(j).getResultado() > key.getResultado()){
                    marcas.set(j+1, marcas.get(j));
                   j = j - 1;
              }
              marcas.set(j+1, key);
         }
         int i = 1;
         for (Marca marcaIter : marcas){
              if (marcaIter.getCompetencia() == pCompetencia){
                   marcaIter.setLugar(i);
                   i++;
              }           
         }
    }
}
