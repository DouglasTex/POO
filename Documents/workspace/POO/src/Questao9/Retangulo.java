package Questao9;

public class Retangulo extends Quadrilateros {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calculaPerimetro() {
		return base*2 + altura*2;
	}

	@Override
	public double calculaArea() {
		return base*altura;
	}
	
	@Override
	public String toString() {
		return "Base: "+base+" | "+
				"Altura: "+altura;
	}

}
