/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana01;
import Clases.*;
/**
 *
 * @author USER
 */
public class PracticaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Practica 1 */
        
        cls_Producto obj_Producto1 = new cls_Producto();
        cls_Producto obj_Producto2 = new cls_Producto(1,"Mouse",30,15.20);
        
        obj_Producto1.mostrar_Info1();
        
        
        
        obj_Producto2.mostrar_Info1();
        obj_Producto1.mostrar_Info2();
        obj_Producto2.mostrar_Info2();
        
        /* Practica 2 */
        
        /* Herencia */
        
        cls_Libro obj_libro = new cls_Libro("Aprende React v18", "Disponible",1,"Miguel Angel Durán García","Leanpub","ISBN 784895956-4");
        obj_libro.mostrarInformacion();
        obj_libro.mostrarInformacionLibro();
        
        
        /* Abstracción */
        
        cls_ReservaSala obj_reservaSala = new cls_ReservaSala("Sala 13", "16:45");
        obj_reservaSala.ejecutarServicio();
        
        cls_PrestamoLibro obj_prestamoLibro = new cls_PrestamoLibro("Aprende React v18", "Edwin Eulogio");
        obj_prestamoLibro.ejecutarServicio();
        
        
        /* Encapsulamiento */
        
        System.out.println(obj_libro.getNombre());
        System.out.println(obj_libro.getAutor());
        System.out.println(obj_libro.getIsbn());
        
        /* Polimorfismo */
        
        //Sobre carga de métodos
        
        cls_Notificacion obj_notificacion = new cls_Notificacion();
        
        obj_notificacion.enviarMensaje("Edwin@utp.edu.pe");
        obj_notificacion.enviarMensaje("Edwin@utp.edu.pe", "Su libro está retrasado");
        obj_notificacion.enviarMensaje("Edwin@utp.edu.pe", "Su libro está disponible.", 1);
        
                
        //Sobrescritura de métodos
        
        cls_Usuario usuario1 = new cls_Usuario("Carlos");
        
        cls_Alumno alumno1 = new cls_Alumno("Lucía", "A12345");
        
        cls_Docente docente1 = new cls_Docente("María", "Matemáticas");

        usuario1.mostrarInformacion();
        alumno1.mostrarInformacion();
        docente1.mostrarInformacion();
    }
    
}
