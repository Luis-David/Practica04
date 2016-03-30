package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionTest {
	// -----------1er TEST
	// List<Integer> arreglo;
	//
	// //@Test : etiqueta que avisa que esto es una prueba (para que la pruebe
	// //
	// @Test(expected=NullPointerException.class)
	// public void probarCollectionTest() {
	// arreglo.get(0);
	// }
	//

	// ----2do TEST
	// List<Integer> arreglo = new ArrayList<Integer>();
	//
	// // @Test : etiqueta que avisa que esto es una prueba (para que la pruebe
	// //(expected = IndexOutOfBoundsException.class) :
	// @Test(expected = IndexOutOfBoundsException.class)
	// public void probarCollectionTest() {
	// arreglo.get(0);
	// }

	// --- NOTAS
	// @before antes de que se haga el test
	// por ejemplo si voy a revisar datos en una tabla, puedo usar before para
	// llenarla
	// despu{es usar @after para vaciarla por ejemplo

	// @beforeclass antes de la clase : se hace s{olo una vez al inicio del
	// test.

	List<Integer> arreglo;

	@BeforeClass
	public static void inicializarClase() {
		System.out.println("inicio a nivel de clase");
	}

	@Before
	public void inicializar() {
		System.out.println("inicializar");
		arreglo = new ArrayList<Integer>();
	}
	
	@After
	public void finalizar() {
		System.out.println("se termino metodo");
	}

	@Test(expected = NullPointerException.class)
	public void probarNullPointerTest() {
		arreglo.get(0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void probarIndexOutTest() {
		arreglo.get(0);
	}

}
