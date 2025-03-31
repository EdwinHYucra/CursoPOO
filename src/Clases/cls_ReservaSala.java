/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author USER
 */
public class cls_ReservaSala extends abs_ServicioBiblioteca{
    private String _sala;
    private String _horario;

    public cls_ReservaSala(String sala, String horario) {
        this._sala = sala;
        this._horario = horario;
    }

    @Override
    public void ejecutarServicio() {
        System.out.println("Sala reservada: " + _sala + " a las " + _horario);
    }
}
