package Questao4;

public class Bits {
	
	private boolean [] listBits;
	
	public Bits(int tamanho) {
		this.listBits = new boolean [tamanho];
	}

	public Bits and (Bits a) throws TamDiException{
		if (listBits.length != a.getBits().length) {
			throw new TamDiException();
		}
		
		Bits res = new Bits(listBits.length);
		
		for (int i = 0; i < listBits.length; i++) {
			res.getBits()[i] = listBits[i] && a.getBits()[i];
		}
		
		return res;
	}
	
	public boolean[] getBits() {
		return listBits;
	}
	
	
	public boolean equals(Bits lista) {
		boolean saida = true;
		for (int i = 0; i < listBits.length; i++) {
			if (listBits[i] != lista.getBits()[i]) {
				saida = false;
			}
		}
		return saida;
	}
	
	@Override
	public String toString() {
		String saida = "";
		for (int i = 0; i < listBits.length; i++) {
			saida += listBits[i] + " ";
			
		}
		return saida;
	}
	
}
