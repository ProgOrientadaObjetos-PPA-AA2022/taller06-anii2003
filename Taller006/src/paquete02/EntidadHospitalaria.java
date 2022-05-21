/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class EntidadHospitalaria {

    private String nombreHospital;
    private CiudadHospital localizacionH;
    private String direccion;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero_a[] enfermeros;
    private double totalSueldoPorMes;

    public EntidadHospitalaria(String n, String d, int e, Medico[] m, Enfermero_a[] enf) {
        nombreHospital = n;
        direccion = d;
        CiudadHospital c1 = new CiudadHospital("Zaruma", "El Oro");
        localizacionH = c1;
        numeroEspecialidades = e;
        medicos = m;
        enfermeros = enf;
    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerLocalizacion(CiudadHospital n) {
        localizacionH = n;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public void establecerNumeroEspecialidades(int n) {
        numeroEspecialidades = n;
    }

    public void establecerMedicos(Medico[] m) {
        medicos = m;
    }

    public void establecerEnfermeros(Enfermero_a[] e) {
        enfermeros = e;
    }

    public void establecerSueldoTotalPorMes() {
        double sumaMedicos = 0;
        double sumaEnfermeros = 0;
        
        for (int i = 0; i < obtenerMedicos().length; i++) {
            sumaMedicos = sumaMedicos + obtenerMedicos()[i].obtenerSueldoMensual();
        }
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            sumaEnfermeros = sumaEnfermeros + obtenerEnfermeros()[i].obtenerSueldoMensual();
        }  
        
        double sumaTotal = sumaMedicos + sumaEnfermeros;
        
        totalSueldoPorMes = sumaTotal;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public CiudadHospital obtenerLocalizacion() {
        return localizacionH;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero_a[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerTotalSueldoPorMes() {
        return totalSueldoPorMes;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nDirección: %s\nCiudad: %s\n"
                + "Provincia: %s\nNúmero de especialidades: %d\n",
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccion(),
                obtenerLocalizacion().obtenerCiudad(),
                obtenerLocalizacion().obtenerProvincia(),
                obtenerNumeroEspecialidades());
        cadena = String.format(cadena + "Listado de médicos\n");
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerMedicos()[i].obtenerNombreMedico(),
                    obtenerMedicos()[i].obtenerSueldoMensual(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format(cadena + "\nListado de enfermeros(as)\n");
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldoMensual(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerTotalSueldoPorMes());
        return cadena;
    }
}
