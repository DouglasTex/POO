package Questao9;

public abstract class Quadrilateros implements FormaGeometrica{
	
	double altura;
	double base;
	double lado;
	
	public Quadrilateros (double base, double altura){
		this.altura = altura;
		this.base = base;
	}
	
	public Quadrilateros (double lado){
		this.lado = lado;
	}
	
	public abstract double calculaPerimetro();
	public abstract double calculaArea();
	

}
