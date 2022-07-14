/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *Clase Padre o SuperClase Persona
 * @author Marlon Galo
 */
public abstract class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;


    //Constructor sin parametros
    public Persona() {
    }
    
    //Establecer y Obtener
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerDni() {
        return dni;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerDni(String dni) {
        this.dni = dni;
    }

    
    //Mostrar o imprimir informacion
    public String mostrarDatos(){
        System.out.println("Nombre: " +nombre +"\nApellido: " +apellido +"\nDocumento Nacional de Identificacion: " +dni);
        return null;
    }
    
}
