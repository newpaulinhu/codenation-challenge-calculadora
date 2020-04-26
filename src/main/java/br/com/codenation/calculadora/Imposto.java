package br.com.codenation.calculadora;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
    public Imposto() { }

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}


	public abstract double calcula(Salario orcamento);
	
	protected double calculaOutroImposto(Salario orcamento) {
		if(outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}
}
