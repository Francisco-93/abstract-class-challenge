package entities;

public abstract class Pessoa {
	
	protected String name;
	protected Double rendaAnual;
	
	protected Pessoa(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public abstract Double impostoDeRenda();

}
