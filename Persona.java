package datosgenerales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melissa
 */
public class Persona {
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    int edad;
    int dia;
    int mes;
    int anio;
    String estadoCivil;
    String carnet;
    
    public Persona(String nombre1,String nombre2,String apellido1,String apellido2,int edad,int dia,int mes,int anio,String estadoCivil,String carnet){
        this.nombre1= nombre1;
        this.nombre2= nombre2;
        this.apellido1= apellido1;
        this.apellido2= apellido2;
        this.edad= edad;
        this.dia= dia;
        this.mes= mes;
        this.anio= anio;
        this.estadoCivil= estadoCivil;
        this.carnet= carnet;
    }
    
    public void imprimirDatos() {
        System.out.println("DATOS GENERALES");
        System.out.println("Nombres: " + nombre1 + " " + nombre2);
        System.out.println("Apellidos: " + apellido1 + " " + apellido2);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Carnet de estudiante: " + carnet);
    }
    
}
