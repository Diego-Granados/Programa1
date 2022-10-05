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
public class Atleta extends Persona {
    private ArrayList<Marca> marcas;
    public Atleta(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        super(pNombre, pApellido1, pApellido2, pId, pPais, pFecha, pCorreo, pTelefono);
        marcas = new ArrayList<Marca>();
    }
    
    public void agregarMarca(Marca pMarca){
        marcas.add(pMarca);
    }
}
