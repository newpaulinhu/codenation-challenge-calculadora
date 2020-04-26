package br.com.codenation.calculadora;

public class INSS extends Imposto {

	public INSS() {
	}
	
	public INSS(Imposto imposto) {
		super(imposto);
	}
	
	
	public double calcula(Salario salario) {
		if (salario.getSalarioBruto() <= 1500) {
			return salario.getSalarioBruto() * 0.08;
		} else if (salario.getSalarioBruto() > 1500 && salario.getSalarioBruto() <= 4000) {
			return salario.getSalarioBruto() * 0.09;
		} else {
			return salario.getSalarioBruto() * 0.11;
		}
	}
}
