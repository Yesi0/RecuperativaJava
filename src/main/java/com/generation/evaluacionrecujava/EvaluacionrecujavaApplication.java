package com.generation.evaluacionrecujava;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import com.generation.evaluacionrecujava.modelo.Producto;
import com.generation.evaluacionrecujava.modelo.TipoProducto;


@SpringBootApplication
public class EvaluacionrecujavaApplication {
	/*
 * José es el dueño de un minimarket de barrio, lleva más de 15 años administrando el
funcionamiento completo de su negocio, siempre lo ha hecho de manera análoga, lo cual en un
inicio no presentaba problemas, pero con el pasar de los años esto ha generado errores
humanos, pérdidas de registros, documentos estropeados por la antigüedad y una nula
posibilidad de poder estudiar el real crecimiento de su negocio año tras año.
José te contrata para generar un software para su negocio.
Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
minimarket

Puntos a considerar:
● El minimarket cuenta con tipos de productos y productos entre otros objetos
● Se debe crear una función que permita a don Jose obtener las ganancias sobre una
venta (ocupar hashmap)
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
productos y que luego los muestre.
● Se debe crear una función que dado un diccionario de productos con sus respectivos
precios se obtenga, la ganancia total, el producto más caro y el producto más barato.
 * 
 */

/*
 * Clase Padre tipos de productos, clase hija productos
 * 
 * ganancias sobre ventas =  producto y precio venta del producto, para esto
 * en el Hashmap la llave será el tipo de producto y el precio el valor.
 * Se le íde que ingrese el producto que vendio y el precio.
 *
 * Pedir que ingrese cantidad de productos 
 * Guardar en arreglo cantidad de productos
 * mostrar la cantidad de productos ingresada
 * 
 * productos y precios respectivos. obtener ganancia total, producto mas caro y mas barato.
 */
	/**
	 *
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombreProducto = teclado.nextLine();
		ArrayList <Producto> misProductos = new ArrayList<Producto>();

		//se crea Hashmap para guardar  producto con su respectivo precio
		HashMap <String, Integer> Venta = new HashMap<String, Integer>();
		
		
		int cantidadProductos; 
		int cantidadVenta;
		
		//se pide al usuario que ingrese cantidad de productos y venta. Con condiciones
		//que sea positivo para que no arroje errores posteriores
		do{
			System.out.print("Indique la cantidad de productos que va a ingresar: ");
			cantidadProductos = teclado.nextInt();
			if(cantidadProductos <= 0){
				System.out.print("La cantidad de productos debe ser mayor a cero, porfavor intente denuevo");
			}

		}while(cantidadProductos <= 0); 

		do{
			System.out.print("Indique la cantidad de ventas por producto: ");
			cantidadVenta = teclado.nextInt();
			if(cantidadVenta <= 0){
				System.out.print("La cantidad de ventas debe ser mayor a cero, por favor entente mas tarde");
			}
		}while(cantidadVenta <= 0);


		
		for(int x = 1; x <= cantidadVenta; x++){ 
			System.out.print("Ingresa precio " +x+ " del producto "+ nombreProducto +": ");
			 int precio = teclado.nextInt(); 

			
			
		
			




	}






}
