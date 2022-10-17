/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Esta clase representa los visores de los atletas.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */
public class Visor extends Persona {
    private ArrayList<Atleta> atletas = new ArrayList<Atleta>();

    /**
     * Método constructor de visor.
     * @param pNombre
     * @param pApellido1
     * @param pApellido2
     * @param pId
     * @param pPais
     * @param pFecha
     * @param pCorreo
     * @param pTelefono
     */
    public Visor(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        super(pNombre, pApellido1, pApellido2, pId, pPais, pFecha, pCorreo, pTelefono);
    }
    
    /**
     * Función para agregar un atleta a la lista de atletas que el visor supervisa o ve.
     * @param pAtleta
     */
    public void agregarAtleta(Atleta pAtleta){
        atletas.add(pAtleta);
        System.out.println("Atleta " + pAtleta.getNombre() + " " +pAtleta.getApellido1() + " " + 
                pAtleta.getApellido2() + " agregado con éxito");
    }
    
    /**
     * Función para borrar un atleta de la lista de atletas que el visor supervisa.
     * @param pId
     */
    public void borrarAtleta(String pId){
        for (Atleta atleta : atletas) {
            if(atleta.getId().equals(pId)){
                atletas.remove(atleta);
                System.out.println("Atleta borrado con éxito.");
                return;
            }
        }
        System.out.println("ERROR: Identificación ingresada no es válida.");  
    }

    /**
     * Retorna la lista de atletas que el visor supervisa
     * @return ArrayList de atletas.
     */
    public ArrayList<Atleta> getAtletas() {
          return atletas;
     }
    
}
