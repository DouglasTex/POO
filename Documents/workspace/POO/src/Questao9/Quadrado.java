package Questao9;

public class Quadrado extends Quadrilateros{

	public Quadrado(double lado) {
		super(lado);
	}

	@Override
	public double calculaPerimetro() {
		return lado*4;
	}

	@Override
	public double calculaArea() {
		return lado*lado;
	}
	
	@Override
	public String toString() {
		return "Lado: "+lado;
	}

}
