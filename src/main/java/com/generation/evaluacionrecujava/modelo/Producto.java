package com.generation.evaluacionrecujava.modelo;

public class Producto extends TipoProducto {
    public String nombreProducto;
    public int precio;
    public int costo;
    public Producto() {
        super();
    }
    public Producto(String nombre, int precio, String nombreProducto, int precio2, int costo) {
        super(nombre, precio);
        this.nombreProducto = nombreProducto;
        precio = precio2;
        this.costo = costo;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    @Override
    public String toString() {
        return super.toString() + "Producto [nombreProducto=" + nombreProducto + ", precio=" + precio + ", costo=" + costo + "]";
    }

    
    

}
