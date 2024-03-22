/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que crea un objeto TrianguloRectangualo con 5 atributos
 * @author estudiante
 */
public class TrianguloRectangulo {
    float base;
    float altura;
    float hipotenusa;
    float angulo1; 
    float angulo2;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public TrianguloRectangulo() {
    }
    /**
     * Constructor lleno
     * @param base base del triangulo 
     * @param altura altura del triangulo
     * @param hipotenusa hipotenusa del triangulo
     * @param angulo1 angulo 1 del triangulo
     * @param angulo2 angulo 2 del triangulo
     */
    public TrianguloRectangulo(float base, float altura, float hipotenusa, float angulo1, float angulo2) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }
    /**
     * metodos que puede realizar TrianguloRectangulo
     */
    public void calcularArea(){
        System.out.println("Calculando el area...");
    }
    public void calcularPerimetro(){
        System.out.println("Calculando el perimetro...");
    }
    public void obtenerAngulos(){
        System.out.println("calculando los angulos");
    }
    public void cambiarBase(){
        System.out.println("cambiando la base");
    }
    public void cambiarAltura(){
        System.out.println("cambiando la altura");
    }
}
