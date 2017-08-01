package Questao1;

public class Retangulo {
	
	private double altura;
	private double largura;
		
	public Retangulo () {
		this.altura = 0;
		this.largura = 0;
	}
	
	public Retangulo (double largura, double altura) {
		this.altura = altura;
		this.largura = largura;
	}
		
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	
	public double calculaArea () {
		return altura*largura;
	}
	
	public double calcuraPerimetro () {
		return 2*altura + 2* largura;
	}
	
	@Override
	public String toString() {
		return "Altura: "+altura +"/n" +
				"Largura "+ largura;
	}
	
	public boolean equals(Retangulo retangulo) {
		if (retangulo.getAltura() == altura && retangulo.getLargura() == largura) {
			return true;
		}
		return false;
	}
}
