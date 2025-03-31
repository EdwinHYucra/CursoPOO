/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Libro extends cls_Recurso {
    
    private int _id_libro;
    private String _autor;
    private String _editorial;
    private String _isbn;
    
    public cls_Libro(String nombre, String estado, int _id_libro, String autor, String editorial, String isbn) {
        super(nombre, estado);
        
        this._id_libro = _id_libro;
        this._autor = autor;
        this._editorial = editorial;
        this._isbn = isbn;
    }
    
    public void mostrarInformacionLibro() {
        System.out.println("ID Libro: " + _id_libro + ", Autor: " + _autor + ", Editorial: " + _editorial+", ISBN: "+_isbn);
    }

    public int getId_libro() {
        return _id_libro;
    }

    public void setId_libro(int _id_libro) {
        this._id_libro = _id_libro;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }

    public String getEditorial() {
        return _editorial;
    }

    public void setEditorial(String _editorial) {
        this._editorial = _editorial;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public String getIsbn() {
        return _isbn;
    }

    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }
    
}
