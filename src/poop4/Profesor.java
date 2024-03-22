/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que crea un objeto Profesor con 5 atributos 
 * @author estudiante
 */
public class Profesor {
    String nombre;
    String apellido;
    int edad;
    String especialidad;
    int añosExpericiencia;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Profesor() {
    }
    /**
     * Constructor lleno
     * @param nombre nombre del profesor
     * @param apellido apellido del profesor
     * @param edad edad del profesor
     * @param especialidad especialidad del profesor
     * @param añosExpericiencia años de experiencia del profesor
     */
    public Profesor(String nombre, String apellido, int edad, String especialidad, int añosExpericiencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.especialidad = especialidad;
        this.añosExpericiencia = añosExpericiencia;
    }
    /**
     * metodo para imprimir toda la informacion del profesor
     */
    public void imprimirProfesor(){
        //System.out.println("profesor: "+nombre+" "+apellido+" tiene "+edad+" años, especialidad: "+especialidad+" con "+añosExpericiencia+ " año(s) de Experiencia");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(especialidad);
        System.out.println(añosExpericiencia);
    }
    /**
     * metodos que puede realizar Profesor
     */
    public void enseñar(){
        System.out.println("Dando la clase.. ");
    }
    public void califcar(){
        System.out.println("Calificando... ");
    }
    public void atenderConsultas(){
        System.out.println("Esta dando asesorias");
    }
    public void prepararMaterial(){
        System.out.println("preparando material");
    }
    public void evaluarProyectos(){
        System.out.println("Evaluando");
    }
}
