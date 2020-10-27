package entities;

public class PessoaFisica extends Pessoa{


	private Double gastosSaude;
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double impostoDeRenda() {
		if(rendaAnual < 20000.00) {
			return rendaAnual * 0.15 - abateSaude();
		}
		else if(rendaAnual >= 20000.00) {
			return rendaAnual * 0.25 - abateSaude();
		}
		else {
			return null;
		}
	}
	
	public Double abateSaude() {
		if(gastosSaude > 0) {
			return gastosSaude * 0.5;
		}
		else {
			return 0.00; //fazer o teste de zero e null
		}
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public String toString() {
		return name + ": $" + String.format("%.2f", impostoDeRenda());
	}
	
	
	
}
