/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Usuario {
    protected String _nombre;

    public cls_Usuario(String nombre) {
        this._nombre = nombre;
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + _nombre);
    }
}
