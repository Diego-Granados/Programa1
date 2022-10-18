/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Esta clase representa los atletas.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */
public class Atleta extends Persona {
    private ArrayList<Marca> marcas;

    /**
     * Constructor de Atleta
     * @param pNombre
     * @param pApellido1
     * @param pApellido2
     * @param pId
     * @param pPais
     * @param pFecha
     * @param pCorreo
     * @param pTelefono
     */
    public Atleta(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        super(pNombre, pApellido1, pApellido2, pId, pPais, pFecha, pCorreo, pTelefono);
        marcas = new ArrayList<Marca>();
    }
    
    /**
     * Método para agregarle una marca al atleta.
     * @param pMarca
     */
    public void agregarMarca(Marca pMarca){
        marcas.add(pMarca);
    }
    
    /**
     * Método que borra una marca del atleta.
     * @param pMarca 
     */
    public void borrarMarca(Marca pMarca){
        marcas.remove(pMarca);
    }

    /**
     * Método para obtener la lista de marcas del atleta.
     * @return el ArrayList de marcas del atleta.
     */
    public ArrayList<Marca> getMarcas() {
          return marcas;
     }
    
    
}
