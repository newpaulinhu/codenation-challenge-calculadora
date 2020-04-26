package br.com.codenation.calculadora;

public class Salario {

	protected double salarioBruto;
	
	protected double salarioLiquido;
	
	public Salario(double salarioBruto) {
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioBruto;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public long getSalarioLiquido() {
		return  Math.round(salarioLiquido);
	}
	
	public void descontar(double valorDescontos) {
		salarioLiquido -= valorDescontos;
	}

}