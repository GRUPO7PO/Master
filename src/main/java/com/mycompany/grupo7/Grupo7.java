/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.grupo7;

import helpers.Deportista;
import helpers.Doctor;


/**
 *
 * @author Marlon Galo
 */
public class Grupo7 {

    public static void main(String[] args) {
       //Instanciar
       Deportista deportista = new Deportista();
       Doctor doctor =new Doctor();
       
       //llamando por herencia a los atributos privados de la superclase persona atravez de la subclase Deportista
       System.out.println("\nInformacion General del Deportista");
       deportista.setDeporte("Futbol");
       deportista.mostrarDatos();
       deportista.mostrarDeporte();
   
       //llamando por herencia a los atributos privados de la superclase persona atravez de la subclase Doctor
       System.out.println("\nInformacion General del Doctor");
       doctor.mostrarDatos();
       doctor.setEspecialidad("Pediatria");
       doctor.MostrarEspecialidad();
       
    }
}
