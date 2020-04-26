package br.com.codenation.calculadora;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraSalarioTest {
	

	@Test
	public void salarioLiquidoIsNotNull() {
		assertNotNull(new CalculadoraSalario().calcularSalarioLiquido(1000.0));
	}

	@Test
	public void salarioLiquidoIsAte1500Correto() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(1000);
		
		assertTrue(liquido.equals(0L));
	}
	
	@Test
	public void salarioLiquidoIs150001Correto() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(1500.01);
		
		assertTrue(liquido.equals(1365L));
	}
	
	@Test
	public void salarioLiquido4500Correto() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(4500);
		
		assertTrue(liquido.equals(3705L));
	}
	
	@Test
	public void salarioBruto50000Liquido() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(5000);
		
		assertTrue(liquido.equals(4116L));		
	}

	@Test
	public void salarioBruto6750Liquido5106() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(6750);
		
		assertTrue(liquido.equals(5106L));
	}

	@Test
	public void salarioBruto1000Liquido0() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(1000);
		
		assertTrue(liquido.equals(0L));
	}

	@Test
	public void salarioBruto6700Liquido() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(6700);
		
		assertTrue(liquido.equals(5516L));
	}

	@Test
	public void salarioBruto6000Liquido4940() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(6000);
		
		assertTrue(liquido.equals(4940L));
		
	}

	@Test
	public void salarioBruto1032Liquido949() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(1032);
		
		assertTrue(liquido.equals(0L));
		
	}

	@Test
	public void salarioBrutoNegativoLiquido0() {
		Long liquido = new CalculadoraSalario().calcularSalarioLiquido(-4500);
		
		assertTrue(liquido.equals(0L));
		
	}

	
}