package com.generation.evaluacionrecujava.modelo;

public class TipoProducto {
    public String nombre;
    public int precio;
    
    public TipoProducto() {
    }

    public TipoProducto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    } 

    
}
