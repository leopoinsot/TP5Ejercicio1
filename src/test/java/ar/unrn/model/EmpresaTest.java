package ar.unrn.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

	@Test
	void calcularMontoTotalDeSueldosTest() {
		var regular = new Regular(10);
		var liderDeProyecto = new LiderDeProyeto(100, regular);
		var mandoMedio = new MandoMedio(1000, liderDeProyecto);
		var gerente = new Gerente(10000, mandoMedio);
		var director = new Director(100000, gerente);

		var empresa = new Empresa(director);
		assertEquals(111110, empresa.calcularMontoTotalDeSueldos());
	}

	//FALTA IMPLEMENTAR UN TEST MAS (NO LO IMPLEMENTE PORQUE NO SE QUE TEST PONER)
	//NO TIENE MUCHA LOGICA DE NEGOCIO

}