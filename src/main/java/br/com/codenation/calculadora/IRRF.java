package br.com.codenation.calculadora;

public class IRRF extends Imposto {

	public IRRF() {
	}
	
	public IRRF(Imposto imposto) {
		super(imposto);
	}
	
	
	public double calcula(Salario salario) {
		if (salario.getSalarioLiquido() <= 3000) {
			return 0;
		} else if (salario.getSalarioLiquido() > 3000 && salario.getSalarioLiquido() <= 6000) {
			return salario.getSalarioLiquido() * 0.075;
		} else {
			return salario.getSalarioLiquido() * 0.15;
		}
	}
}
