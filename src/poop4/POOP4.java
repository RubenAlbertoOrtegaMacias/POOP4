/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;
//en la varible punto tenemos una refenrencia en @ 63º21 en el paquete poop4
/**
 * Programa para ver como crear iteraciones de clases
 * @author estudiante
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Buitres Fac. Med.
        Punto punto = new Punto();
        punto.imprimirPunto();
        //System.out.println(punto);
        Punto punto1 =new Punto(7,15);
        punto1.imprimirPunto();
        punto.x=23;
        punto.y=7;
        punto.imprimirPunto();
        
        Profesor profesor = new Profesor();
        System.out.println(profesor.nombre);
        System.out.println(profesor.apellido);
        System.out.println(profesor.edad);
        System.out.println(profesor.especialidad);
        System.out.println(profesor.añosExpericiencia);
        Profesor profesor1=new Profesor("Jose","Perez",19,"algodonero",1);
        profesor1.imprimirProfesor();
        Profesor profesor2= new Profesor();
        profesor2.nombre="Pablo";
        profesor2.apellido="Leticia";
        profesor2.edad=28;
        profesor2.especialidad="Licenciado";
        profesor2.añosExpericiencia=3;
        profesor2.imprimirProfesor();
    }
    
}
