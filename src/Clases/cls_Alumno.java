/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Alumno extends cls_Usuario {
    private String _codigoAlumno;

    public cls_Alumno(String nombre, String codigoAlumno) {
        super(nombre);
        this._codigoAlumno = codigoAlumno;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alumno: " + _nombre + ", Código: " + _codigoAlumno);
    }
}
