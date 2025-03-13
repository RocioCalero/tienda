package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductoTest {
	private Producto producto;

	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Monitores",250.00);
	}

	@Test
	@DisplayName ("Prueba de get Nombre")
	void testGetNombre() {
		String producto_esperado = "Monitores";
		assertEquals(producto_esperado, producto.getNombre(), "No coincide el producto");
		
	}
	@Test
	@DisplayName ("Prueba de get Precio")
	void testGetPrecio() {
		double precio_esperado = 250.00;
		assertEquals(precio_esperado, producto.getPrecio(), "No coincide el precio");
	}
	@Test
	@DisplayName ("Prueba de set Nombre, poniendo el nombre Vacio")
	void testSetNombreVacio() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,()-> new Producto(null,250.00));
		String mensaje = "El producto esta vacio";
		assertEquals(mensaje, excepcion);
	}
	@Test
	@DisplayName ("Prueba de Set Precio")
	void testSetPrecio() {
		double precio_esperado = 250.00;
		Exception excepcion = assertThrows(IllegalArgumentException.class,()-> new Producto("Monitores", -250.00));
		String mensajeEsperado = "Error: el precio del producto no puede ser negativo";
		assertEquals(precio_esperado, mensajeEsperado, excepcion);
		
	}

}
