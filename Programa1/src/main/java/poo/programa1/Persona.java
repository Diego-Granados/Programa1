/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.ArrayList;
import java.time.LocalDate;
        
/**
 *
 * @author dandi
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String id;
    protected static ArrayList<String> idList;
    private LocalDate fecha;
    private String pais;
    private String correo;
    private String telefono;
    public Persona(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        nombre = pNombre;
        apellido1 = pApellido1;
        apellido2 = pApellido2;
        id = pId;
        idList = new ArrayList<>();
        pais = pPais;
        correo = pCorreo;
        telefono = pTelefono;
        fecha = pFecha;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    public String getNombre(){
        return nombre;
    } 
    public void setApellido1(String pApellido1){
        apellido1 = pApellido1;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido2(String pApellido2){
        apellido2 = pApellido2;
    }
    public String getApellido2(){
        return apellido2;
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
    public void setFecha(LocalDate pFecha){
        fecha = pFecha;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setCorreo(String pCorreo){
        correo = pCorreo;
    }
    public String getCorreo(){
        return correo;
    }
    public void setTelefono(String pTelefono){
        telefono = pTelefono;
    }
    public ArrayList<String> getIdList(){
        return idList;
    }
    
    
}
