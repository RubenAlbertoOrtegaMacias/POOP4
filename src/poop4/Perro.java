/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que crea un Objeto Perro con 5 atributos
 * @author estudiante
 */
public class Perro {
    String nombre;
    int edad;
    String raza;
    String color;
    String tamaño;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Perro() {
    }
    /**
     * Constructor lleno
     * @param nombre nombre del perro
     * @param edad edad del perro
     * @param raza raza del perro
     * @param color color del perro
     * @param tamaño tamaño del perro
     */
    public Perro(String nombre, int edad, String raza, String color, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
    }
    /**
     * metodos que puede realizar Perro
     */
    public void ladrar(){
        System.out.println("guau guau ");
    }
    public void correr(){
        System.out.println("corriendo...");
    }
    public void dormir(){
        System.out.println("zzz zzzz...");
    }
    public void comer(){
        System.out.println("comiendo...");
    }
    public void jugar(){
        System.out.println("jugando...");
    }
}
