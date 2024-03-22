/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que crea objeto coche con 5 atributos
 * @author estudiante
 */
public class Coche {
    String marca;
    String modelo;
    int año;
    String color;
    float velocidad;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Coche() {
    }
    /**
     * Constructor lleno
     * @param marca marca del coche
     * @param modelo modelo del coche
     * @param año año de salida del coche
     * @param color color del coche
     * @param velocidad velocidad maxima del coche
     */
    public Coche(String marca, String modelo, int año, String color, float velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.velocidad = velocidad;
    }
    /**
     * metodos que puede utilizar el coche
     */
    public void acelerar(){
        System.out.println("acelerando");
    }
    
    public void frenar(){
        System.out.println("frenando ");
    }
    public void girarIzquierda(){
        System.out.println("girando a la izquierda..");
    }
    public void girarDerecha(){
        System.out.println("girando a la derecha");
    }
    public void encender(){
        System.out.println("Encender auto");
    }
}
