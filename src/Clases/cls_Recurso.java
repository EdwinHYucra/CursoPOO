/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Recurso {
    
    protected String _nombre;
    protected String _estado;

    public cls_Recurso(String nombre, String estado) {
        this._nombre = nombre;
        this._estado = estado;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + _nombre + ", Estado: " + _estado);
    }
}
