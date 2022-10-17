/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

import java.util.HashMap;
import java.time.LocalDate;
        
/**
 * Esta clase es una clase abstracta general para representar personas.
 * @author Daniel Granados Retana, 2022104692
 * @author Diego Granados Retana, 2022158363
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String id;

    /**
     * HashMap estático para guardar la lista de personas. Las parejas de valores van 
     * a ser un string para la identificación con un objeto de tipo persona, la persona
     * asociada con esa identificación.
     */
    public static HashMap<String, Persona> List = new HashMap<>();
    private LocalDate fecha;
    private String pais;
    private String correo;
    private String telefono;
    
    /**
     * Método constructor
     * @param pNombre
     * @param pApellido1
     * @param pApellido2
     * @param pId
     * @param pPais
     * @param pFecha
     * @param pCorreo
     * @param pTelefono 
     */
    public Persona(String pNombre, String pApellido1, String pApellido2, String pId, String pPais, LocalDate pFecha, String pCorreo, String pTelefono){
        nombre = pNombre;
        apellido1 = pApellido1;
        apellido2 = pApellido2;
        id = pId;
        pais = pPais;
        correo = pCorreo;
        telefono = pTelefono;
        fecha = pFecha;
        List.put(pId, this);
    }
    
    /**
     * Método establecer para el nombre
     * @param pNombre 
     */
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    /**
     * Método para obtener el nombre de la persona.
     * @return el nombre de la persona
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Método para establecer el primer apellido.
     * @param pApellido1
     */
    public void setApellido1(String pApellido1){
        apellido1 = pApellido1;
    }

    /**
     * Método para obtener el primer apellido
     * @return apellido1
     */
    public String getApellido1(){
        return apellido1;
    }

    /**
     * Método para establecer el segundo apellido.
     * @param pApellido2
     */
    public void setApellido2(String pApellido2){
        apellido2 = pApellido2;
    }

    /**
     * Método para obtener el segundo apellido
     * @return apellido2
     */
    public String getApellido2(){
        return apellido2;
    }

    /**
     * Método para establecer la identificación.
     * @param pId
     */
    public void setId(String pId){
        id = pId;
    }

    /**
     * Método para obtener la identifación
     * @return id
     */
    public String getId(){
        return id;
    }

    /**
     * Método para establecer el país
     * @param pPais
     */
    public void setPais(String pPais){
        pais = pPais;
    }

    /**
     * Método para obtener el país
     * @return pais
     */
    public String getPais(){
        return pais;
    }

    /**
     * Método para establecer la fecha
     * @param pFecha
     */
    public void setFecha(LocalDate pFecha){
        fecha = pFecha;
    }

    /**
     *  Método para obtener la fecha.
     * @return fecha
     */
    public LocalDate getFecha(){
        return fecha;
    }

    /**
     * Método para establecer el correo.
     * @param pCorreo
     */
    public void setCorreo(String pCorreo){
        correo = pCorreo;
    }

    /**
     * Método para obtener el correo.
     * @return correo
     */
    public String getCorreo(){
        return correo;
    }

    /**
     * Método para establecer el teléfono.
     * @param pTelefono
     */
    public void setTelefono(String pTelefono){
        telefono = pTelefono;
    }

    /**
     * Método para obtener el correo.
     * @return
     */
    public String getTelefono(){
        return telefono;
    }

    /**
     *  Método para obtener el HashMap de identificaciones y Personas.
     * @return List
     */
    public HashMap<String,Persona> getList(){
        return List;
    }
}
