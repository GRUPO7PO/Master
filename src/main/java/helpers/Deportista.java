/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.helpers;

/**
 *
 * @author Maria Jose
 */
public class Deportista extends Persona{
    //Declaracion de atributo deporte
    private String deporte;

    
    public Deportista() {
        establecerNombre("Oscar");
        establecerApellido("Fusser");
        establecerDni("0801200289235");
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    public String mostrarDeporte() {
        System.out.println("Deporte:" +deporte);
        return null;
    }
       
}
