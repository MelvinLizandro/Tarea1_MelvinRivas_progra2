/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_melvinrivas_progra2;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author l3306
 */
class animales {
    String nombre;
    String tipo;
    Color color;
    Date fehca;
    int precio;

    public animales(String nombre, String tipo, Color color, Date fehca, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.fehca = fehca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Color getColor() {
        return color;
    }

    public Date getFehca() {
        return fehca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFehca(Date fehca) {
        this.fehca = fehca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + ", tipo: " + tipo + ", color: " + color + ", fehca: " + fehca + ", precio: " + precio ;
    }
    

       
}
