package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		
		if (salarioBase < 0) {
			return 0;
		}
		
		Imposto inss = new INSS();
		Imposto irrf = new IRRF();
		Salario salario = new Salario(salarioBase);
		
		salario.descontar(inss.calcula(salario));
		
		salario.descontar(irrf.calcula(salario));
		
		return salario.getSalarioLiquido() < 1039L ? 0L : salario.getSalarioLiquido();
	}
	
}
