package Questao9;

public class Circulo implements FormaGeometrica {

	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaPerimetro() {
		return 2*3.14*raio;
	}

	@Override
	public double calculaArea() {
		return 3.14*raio*raio;
	}

	@Override
	public String toString() {
		return "Raio: "+raio;
	}

}
