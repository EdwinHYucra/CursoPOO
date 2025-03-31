/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Notificacion {
   
    public void enviarMensaje(String destinatario) {
        System.out.println("Enviando notificación a: " + destinatario);
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando notificación a: " + destinatario + " con mensaje: " + mensaje);
    }

    public void enviarMensaje(String destinatario, String mensaje, int prioridad) {
        System.out.println("Enviando notificación a: " + destinatario + " con mensaje: " + mensaje + " y prioridad: " + prioridad);
    }
}
