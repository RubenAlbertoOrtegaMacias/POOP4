/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que crea un Objeto Alumno con 5 atributos
 * @author estudiante
 */
public class Alumno {
    String nombre;
    String apelldio;
    int edad;
    String grado;
    double promedio;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Alumno(){
    }
    /**
     * Constructor lleno
     * @param nombre nombre del alumno
     * @param apellido apellido del alumno
     * @param edad edad del alumno
     * @param grado grado del alumno
     * @param promedio promedio del alumno
     */
    public Alumno(String nombre,String apellido,int edad,String grado,double promedio){
        this.nombre=nombre;
        this.apelldio=apellido;
        this.edad=edad;
        this.grado=grado;
        this.promedio=promedio;
    }
    /**
     * metodos que puede realizar Alumno
     */
    public void estudiar(){
        System.out.println("Estudiando...zzz");
    }
    public void hacerTare(){
        System.out.println("Haciendo tarea... zzz");
    }
    public void presentarTarea(){
        System.out.println("Entregando la tarea");
    }
    public void participarClase(){
        System.out.println("levantando la mano");
    }
    public void solicitarAsesoria(){
        System.out.println("Necesito ayuda toy chiquito :c");
    }
}
