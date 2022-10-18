/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta clase se usa para representar las Competencias.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */
public class Competencia {
    private String nombre;
    private int id;
    private LocalDate fechainicio;
    private LocalDate fechafinal;

    /**
     * Este HashMap almacena los nombres de las competencias y su objeto relacionado
     * para poder acceder al objeto con solo el nombre fácilmente.
     */
    public static HashMap<String, Competencia> competencias = new HashMap<>();
    private String pais;
    private String lugar;

    /**
     * Este HashMap permite acceder a las disciplinas fácilmente con solo su nombre.
     */
    public HashMap<String, Disciplina> disciplinasDict;

    /**
     * Este HashMap permite acceder a las pruebas de las disciplinas.
     */
    public HashMap<Disciplina, ArrayList<Prueba>> pruebasDict;

    /**
     * Este ArrayList contiene las marcas relacionadas con esta competencia.
     */
    public ArrayList<Marca> marcas;
    
    /**
     * Constructor de competencia
     * @param pNombre
     * @param pId
     * @param pPais
     * @param pLugar
     * @param pFechainicio
     * @param pFechafinal
     */
    public Competencia(String pNombre, int pId, String pPais, String pLugar, LocalDate pFechainicio, LocalDate pFechafinal){
        nombre = pNombre;
        id = pId;
        pais = pPais;
        lugar = pLugar;
        fechainicio = pFechainicio;
        fechafinal = pFechafinal;
        marcas = new ArrayList<>();
        disciplinasDict = new HashMap<>();
        pruebasDict = new HashMap<>();
        Competencia.competencias.put(nombre, this);
    }
    
    /**
     * Método para establecer el nombre
     * @param pNombre
     */
    public void setNombre(String pNombre){
        nombre = pNombre;
    }

    /**
     * Método para obtener el nombre
     * @return nombre de la competencia
     */
    public String getNombre(){
        return nombre;
    } 

    /**
     * Método para establecer la identificación de la competencia
     * @param pId
     */
    public void setId(int pId){
        id = pId;
    }

    /**
     * Método para obtener la identificación de la competencia.
     * @return identificación
     */
    public int getId(){
        return id;
    }

    /**
     * Método para establecer el país de la competencia
     * @param pPais
     */
    public void setPais(String pPais){
        pais = pPais;
    }

    /**
     * Método para obtener el país de la competencia
     * @return país
     */
    public String getPais(){
        return pais;
    }
    
    /**
     * Método para establecer el lugar de la competencia
     * @param pLugar
     */
    public void setLugar(String pLugar){
        lugar = pLugar;
    }
    
    /**
     * Método para obtener el lugar de la competencia
     * @return lugar
     */
    public String getLugar(){
        return lugar;
    }

    /**
     * Método para establecer la fecha de inicio de la competencia
     * @param pFecha
     */
    public void setFechainicio(LocalDate pFecha){
        fechainicio = pFecha;
    }

    /**
     * Método para obtener la fecha de inicio de la competencia
     * @return fecha de inicio
     */
    public LocalDate getFechainicio(){
        return fechainicio;
    }

    /**
     * Método para establecer la fecha final de la competencia
     * @param pFecha
     */
    public void setFechafinal(LocalDate pFecha){
        fechafinal = pFecha;
    }

    /**
     * Método para obtener la fecha final de la competencia
     * @return fecha final de la competencia
     */
    public LocalDate getFechafinal(){
        return fechafinal;
    }
    
    /**
     * Método para agregar disciplinas a la competencia
     * @param pDisciplina
     */
    public void agregarDisciplina(Disciplina pDisciplina){
         disciplinasDict.put(pDisciplina.getNombre(), pDisciplina);
        pruebasDict.put(pDisciplina, new ArrayList<Prueba>());
    }
    
    /**
     * Método para agregar pruebas a la competencia
     * @param pDisciplina
     * @param pPrueba
     */
    public void agregarPrueba(Disciplina pDisciplina, Prueba pPrueba){
        pruebasDict.get(pDisciplina).add(pPrueba);
    }
    
    /**
     * Método para agregar marcas a la competencia
     * @param pAtleta
     * @param pResultado
     * @param pPrueba
     */
    public void agregarMarca(Atleta pAtleta, double pResultado, Prueba pPrueba){
        Marca newMarca = new Marca(pAtleta, pResultado, pPrueba, this);
        pPrueba.incrementarContador(this);
        this.marcas.add(newMarca);
    }
    
    public void agregarMarca(Marca marca){
        
        marca.getPrueba().incrementarContador(this);
        this.marcas.add(marca);
    }
    
    public boolean equals(String pNombre, String pPais, String pLugar, LocalDate pFechainicio, LocalDate pFechafinal){
          if (this.nombre.equals(pNombre) && this.pais.equals(pPais) && this.lugar.equals(pLugar) && this.fechainicio.isEqual(pFechainicio) && this.fechafinal.isEqual(pFechafinal)){
                return true;
            }
          return false;
          
    }
   
    
}
