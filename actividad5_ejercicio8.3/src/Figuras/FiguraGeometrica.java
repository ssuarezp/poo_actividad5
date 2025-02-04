/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author EstudianteAuxiliar
 */
public class FiguraGeometrica {
    
    private double volumen; /* Atributo que identifica el volumen de 
    una figura geométrica */
    private double superficie; /* Atributo que identifica la superficie de 
    una figura geométrica */
    /**
    * Método para establecer el volumen de una figura geométrica
    * @param volumen Parámetro que define el volumen de una figura 
    * geométrica
    */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public double getVolumen() {
        return this.volumen;
    }

    public double getSuperficie() {
        return this.superficie;
    }
    
}
