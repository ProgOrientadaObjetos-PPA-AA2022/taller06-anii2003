/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.CiudadHospital;
import paquete02.Enfermero_a;
import paquete02.EntidadHospitalaria;
import paquete02.Medico;

/**
 *
 * @author DELL
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Datos del Hospital  
        String nombreHospital;
        String direccion;
        String ciudadHospital;
        String provincia;

        // Datos del médico
        String nombreMedico;
        double sueldoMensualMedico;
        String especialidad;
        int nEspecialidades;
        int med;
        int enfe;
        double sueldoMedico;
        Medico[] medicosHospital;
        Enfermero_a[] enfermerosHospital;

        // Datos del enfermero
        String nombreEnfermero;
        double sueldoEnfermero;
        String contratoE;

        System.out.print("Nombre del Hospital: ");
        nombreHospital = leer.nextLine();
        System.out.print("Dirección: ");
        direccion = leer.nextLine();
        System.out.print("Ciudad: ");
        ciudadHospital = leer.nextLine();
        System.out.print("Provincia: ");
        provincia = leer.nextLine();
        System.out.print("Número de especialidades: ");
        nEspecialidades = leer.nextInt();
        System.out.print("Ingrese el número de médicos: ");
        med = leer.nextInt();
        System.out.print("Ingrese el número de enfermeros: ");
        enfe = leer.nextInt();
        
        // Limpiar el buffer
        leer.nextLine();

        medicosHospital = new Medico[med];
        
        System.out.println("\nListado de médicos");

        for (int i = 0; i < med; i++) {
            System.out.printf("\nIngrese el nombre del médico %d: ", i + 1);
            nombreMedico = leer.nextLine();
            System.out.printf("Ingrese el sueldo del médico %d: ", i + 1);
            sueldoMedico = leer.nextDouble();
            // Limpiar el buffer
            leer.nextLine();
            System.out.printf("Ingrese la especialidad del médico %d: ", i + 1);
            especialidad = leer.nextLine();

            Medico m1 = new Medico(nombreMedico, sueldoMedico, especialidad);

            medicosHospital[i] = m1;
        }

        enfermerosHospital = new Enfermero_a[enfe];
        
        System.out.println("\nListado de enfermeros");

        for (int i = 0; i < enfe; i++) {
            System.out.printf("\nIngrese el nombre del enfermero/a %d: ", i + 1);
            nombreEnfermero = leer.nextLine();
            System.out.printf("Ingrese el sueldo del enfermero/a %d: ", i + 1);
            sueldoEnfermero = leer.nextDouble();
            // Limpiar el buffer
            leer.nextLine();
            System.out.printf("Ingrese el tipo de contrato del enfermero/a %d: ", i + 1);
            contratoE = leer.nextLine();

            Enfermero_a e1 = new Enfermero_a(nombreEnfermero, sueldoEnfermero, contratoE);

            enfermerosHospital[i] = e1;
        }

        EntidadHospitalaria hospital = new EntidadHospitalaria(nombreHospital, direccion, nEspecialidades, medicosHospital, enfermerosHospital);

        hospital.establecerSueldoTotalPorMes();

        System.out.println("\n\n"+hospital);
    }
}
