/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta clase se usa para representar las disciplinas de atletismo.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */

public class Prueba{
    private String nombre;
    private String categoria;
    private String genero;
    private Disciplina disciplina;
    private ArrayList<Marca> marcas;

    /**
     * Este HashMap se usa para asignar la identificación según el parámetro de la Configuración.
     */
    public HashMap<Competencia, Integer> contador;
    
    /**
     * Constructor de la Prueba.
     * @param pNombre
     * @param pCategoria
     * @param pGenero
     * @param pDisciplina
     */
    public Prueba(String pNombre, String pCategoria, String pGenero, Disciplina pDisciplina){
        nombre = pNombre;
        categoria = pCategoria;
        genero = pGenero;
        disciplina = pDisciplina;
        marcas = new ArrayList<Marca>();
        contador= new HashMap<>();
    }
    
    /**
     * Método para obtener el String
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método para establecer el nombre.
     * @param pNombre
     */
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    /**
     * Método para obtener Marcas.
     * @return ArrayList de las marcas.
     */
    public ArrayList<Marca> getMarcas(){
         return marcas;
    }
    
    /**
     * Método para obtener la categoría
     * @return categoría
     */
    public String getCategoria(){
        return categoria;
    }

    /**
     * Método para establecer la categoría
     * @param pCategoria
     */
    public void setCategoria(String pCategoria){
        categoria = pCategoria;
    }

    /**
     * Método para obtener género.
     * @return género de la prueba.
     */
    public String getGenero(){
        return genero;
    }

    /**
     * Método para establecer el género de la prueba.
     * @param pGenero
     */
    public void setGenero(String pGenero){
        genero = pGenero;
    }
    
    /**
     * Método para obtener la disciplina a la que pertenece la prueba.
     * @return
     */
    public Disciplina getDisciplina(){
        return disciplina;
    }

    /**
     * Método para establecer la disciplina a la que pertenece la prueba.
     * @param pDisciplina
     */
    public void setDisciplina(Disciplina pDisciplina){
        disciplina = pDisciplina;
    }
    
    /**
     * Método para verificar si dos pruebas son iguales.
     * @param pPrueba
     * @return true si sus valores son iguales y false si no lo son.
     */
    public boolean equals(Prueba pPrueba){
        if (this.nombre.equals(pPrueba.getNombre()) && 
                this.categoria.equals(pPrueba.getCategoria()) && 
                this.genero.equals(pPrueba.getGenero())){
            return true;
        }
        return false;
    }
    
    /**
     * Método para verificar si dos pruebas son iguales recibiendo sus atributos.
     * @param pNombre
     * @param pCategoria
     * @param pGenero
     * @return true si sus valores son iguales y false si no lo son.
     */
    public boolean equals(String pNombre, String pCategoria, String pGenero){
        if (this.nombre.equals(pNombre) && 
                this.categoria.equals(pCategoria) && 
                this.genero.equals(pGenero)){
            return true;
        }
        return false;
    }
    
    /**
     * Método para agregar marca a la lista de pruebas.
     * @param pMarca
     */
    public void agregarMarca(Marca pMarca){
        marcas.add(pMarca);
    }
    
    /**
     * Método para agregar un contador de cuántas pruebas hay en una competencia
     * @param competencia
     */
    public void agregarCompetencia(Competencia competencia){
         contador.put(competencia, 1);
    }

    /**
     * Método para incrementar el contador de la cantidad de pruebas en al competencia.
     * @param competencia
     */
    public void incrementarContador(Competencia competencia){
        contador.put(competencia, contador.get(competencia) + 1);
        // cuando ponemos una entrada que ya existe, no la 
    }
    
    /**
     * Método que retorna el contador de las pruebas en una competencia.
     * @param competencia
     * @return la cantidad de pruebas en una competencia.
     */
    public int getContador(Competencia competencia){
        return  contador.get(competencia);
    }
    
    /**
     * Método para ordenar las marcas en orden descendente de acuerdo a la distancia y la competencia.
     * @param pCompetencia
     */
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
    
    /**
     * Método para dar los lugares de una competencia.
     * @param pCompetencia
     */
    public void darLugares(Competencia pCompetencia){
         int i = 1;
         for (Marca marcaIter : marcas){
              if (marcaIter.getCompetencia() == pCompetencia){
                   marcaIter.setLugar(i);
                   i++;
              }           
         }
    }

    /**
     * Método para ordenar las marcas en orden ascendente de acuerdo con el tiempo.
     * @param pCompetencia
     */
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
