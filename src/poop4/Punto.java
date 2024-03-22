/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Es la clase que crea un objeto con dos atributos
 * @author estudiante
 */
public class Punto {
    int x,y;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Punto() {
    }
    /**
     * Constructor lleno
     * @param x punto 1
     * @param y punto y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * imprime los puntos
     */
    public void imprimirPunto(){
        System.out.println("x="+x+"y="+y);
    }
}
