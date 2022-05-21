/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class Enfermero_a {   
    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero_a(String n,double sueldoM,String t) {
        nombre = n;
        sueldoMensual = sueldoM;
        tipo = t;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }
    
    public void establecerSueldoMensual(double sM){
        sueldoMensual = sM;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }   
    
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
