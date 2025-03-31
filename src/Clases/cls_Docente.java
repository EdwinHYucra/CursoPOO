/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Docente extends cls_Usuario {
    private String _especialidad;

    public cls_Docente(String nombre, String especialidad) {
        super(nombre);
        this._especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Docente: " + _nombre + ", Especialidad: " + _especialidad);
    }
}
