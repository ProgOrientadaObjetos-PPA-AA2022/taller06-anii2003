/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class CiudadHospital {
    private String ciudad;
    private String provincia;
    
    public CiudadHospital(String n, String p){
        ciudad = n;
        provincia = p;
    }

    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerProvincia(String n){
        provincia = n;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerProvincia(){
        return provincia;
    }
}
