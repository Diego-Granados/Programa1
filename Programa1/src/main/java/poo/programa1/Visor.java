/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author dandi
 */
public class Visor extends Persona {
    private ArrayList<Atleta> atletas = new ArrayList<Atleta>();
    public Visor(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        super(pNombre, pApellido1, pApellido2, pId, pPais, pFecha, pCorreo, pTelefono);
    }
    
    /**
     *
     * @param pAtleta
     */
    public void agregarAtleta(Atleta pAtleta){
        atletas.add(pAtleta);
        System.out.println("Atleta" + pAtleta.getNombre() + " " +pAtleta.getApellido1() + " " + 
                pAtleta.getApellido2() + "  agregado con éxito");
    }
    
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

     public ArrayList<Atleta> getAtletas() {
          return atletas;
     }
    
}
