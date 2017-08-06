package Questao8;

public class Cliente extends Pessoa {
	private int codigo;
	
	public Cliente(int codigo, String nome, Data nascimento) {
		super(nome, nascimento);
		this.codigo = codigo;
		
	}

	@Override
	public String imprimeDados() {
		return "Código: "+codigo+"\n"+
				"Nome "+nome+"\n"+
				"Nascimento: "+nascimento.getDia()+"/"+nascimento.getMes()+"/"+nascimento.getAno();
	}

}
