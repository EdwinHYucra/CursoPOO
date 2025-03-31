/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_PrestamoLibro extends abs_ServicioBiblioteca{
    private String _titulo;
    private String _usuario;

    public cls_PrestamoLibro(String titulo, String usuario) {
        this._titulo = titulo;
        this._usuario = usuario;
    }

    @Override
    public void ejecutarServicio() {
        System.out.println("Préstamo registrado: Libro '" + _titulo + "' para usuario " + _usuario);
    }
}
