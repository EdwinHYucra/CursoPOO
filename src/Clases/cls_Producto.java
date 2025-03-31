/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USER
 */
public class cls_Producto {
    private int _id;
    private String _nombre;
    private int _stock;
    private double _precio; //float
    
    public cls_Producto () {
        this._id = 0;
        this._nombre = "None";
        this._stock = 0;
        this._precio = 0.00;
    }
    public cls_Producto (int id, String nombre, int stock, double precio) {
        this._id = id;
        this._nombre = nombre;
        this._stock = stock;
        this._precio = precio;
    }
    
    public void mostrar_Info1(){
        
        String info = String.format("""
                      |===========================|
                      | Producto           
                      | Nombre: %s
                      | ID: %d
                      | Stock: %d 
                      | Precio: %.2f
                      |===========================|
                      """, _nombre, _id, _stock, _precio);
        System.out.println(info);
    }
    public void mostrar_Info2() {
        String info = """
                      | Nombre: """ + _nombre + """
                      | ID: """ + _id + """
                      | Stock: """ + _stock + """
                      | Precio: """ + String.format("%.2f", _precio) + """
                      """;
        System.out.println(info);
    }
}
