/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class Medico {
    private String nombreDoc;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico(String n,double s, String e){
        nombreDoc = n;
        especialidad = e;
        sueldoMensual = s;
    }
    
    public void establecerNombreMedico(String n){
        nombreDoc = n;
    }
    
    public void establecerEspecialidad(String n){
        especialidad = n;
    }
    
    public void establecerSueldoMensual(double sM){
        sueldoMensual = sM;
    }
    
    public String obtenerNombreMedico(){
        return nombreDoc;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
}
