package Questao9;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		List<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		
		formas.add(new Retangulo(10, 12));
		formas.add(new Retangulo(5, 7));
		formas.add(new Quadrado(7));
		formas.add(new Quadrado(10));
		formas.add(new Circulo(4));
		formas.add(new Circulo(12));
		
		for (FormaGeometrica formaGeometrica : formas) {
			System.out.println("Dimensoes: "+formaGeometrica.toString());
			System.out.println("Perimetro: "+formaGeometrica.calculaPerimetro());
			System.out.println("Área: "+formaGeometrica.calculaArea());
		}
		
	}

}
