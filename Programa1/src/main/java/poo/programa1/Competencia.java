/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import static poo.programa1.Persona.idList;

/**
 *
 * @author dandi
 */
public class Competencia {
    private String nombre;
    private String id;
    private LocalDate fechainicio;
    private LocalDate fechafinal;
    private String pais;
    private String lugar;
    private ArrayList<Disciplina> disciplinas;
    private HashMap<Disciplina, ArrayList<Prueba>> disciplinasDict;
    private ArrayList<Marca> marcas;
    
    public Competencia(String pNombre, String pId, String pPais, String pLugar, LocalDate pFechainicio, LocalDate pFechafinal){
        nombre = pNombre;
        id = pId;
        pais = pPais;
        lugar = pLugar;
        fechainicio = pFechainicio;
        fechafinal = pFechafinal;
        disciplinas = new ArrayList<>();
        disciplinasDict = new HashMap<>();
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    } 
    public void setId(String pId){
        id = pId;
    }
    public String getId(){
        return id;
    }
    public void setPais(String pPais){
        pais = pPais;
    }
    public String getPais(){
        return pais;
    }
    
    public void setLugar(String pLugar){
        lugar = pLugar;
    }
    
    public String getLugar(){
        return lugar;
    }
    public void setFechainicio(LocalDate pFecha){
        fechainicio = pFecha;
    }
    public LocalDate getFechainicio(){
        return fechainicio;
    }
    public void setFechafinal(LocalDate pFecha){
        fechafinal = pFecha;
    }
    public LocalDate getFechafinal(){
        return fechafinal;
    }
    
    public void agregarDisciplina(Disciplina pDisciplina){
        disciplinas.add(pDisciplina);
        disciplinasDict.put(pDisciplina, new ArrayList<Prueba>());
    }
    
    public void agregarPrueba(Disciplina pDisciplina, Prueba pPrueba){
        disciplinasDict.get(pDisciplina).add(pPrueba);
    }
    
    public void agregarMarca(Atleta pAtleta, double pResultado, Prueba pPrueba){
        Marca newMarca = new Marca(pAtleta, pResultado, pPrueba, this);
        this.marcas.add(newMarca);
        pPrueba.agregarMarca(newMarca);
        pAtleta.agregarMarca(newMarca);
    }
    
    
}
