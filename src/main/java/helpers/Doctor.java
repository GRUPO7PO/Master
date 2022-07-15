/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Maria Jose
 */
public class Doctor extends Persona {
    //Declaracion de atributos
    public String especialidad;

public Doctor(){
   establecerNombre("Luis");
   establecerApellido("Fitzgerald");
   establecerDni("0610197723456");
   }


    //Establecer para el atributo especialidad de la subclase doctor
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String MostrarEspecialidad() {
        System.out.println("Especialidad:" +especialidad);
        return null;
    }
    
}
