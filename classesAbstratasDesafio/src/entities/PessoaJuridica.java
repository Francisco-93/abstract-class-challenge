package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroFuncionarios;
		
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double impostoDeRenda() {
		if(numeroFuncionarios > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
	}

	@Override
	public String toString() {
		return name + ": $" + String.format("%.2f", impostoDeRenda());
	}
	
	
}
