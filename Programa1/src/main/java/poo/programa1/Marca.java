/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.programa1;

/**
 *
 * @author Dandiego
 */
public class Marca {
    private double resultado;
    private Atleta atleta;
    private Prueba prueba;
    private Competencia competencia;
    
    public Marca(Atleta pAtleta, double pResultado, Prueba pPrueba, Competencia pCompetencia){
        atleta = pAtleta;
        resultado = pResultado;
        prueba = pPrueba;
        competencia = pCompetencia;
        pPrueba.agregarMarca(this);
    }
    public void setResultado(double pResultado){
        resultado = pResultado;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

}
