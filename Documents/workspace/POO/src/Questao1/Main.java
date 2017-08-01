package Questao1;
import javax.swing.JOptionPane;

public class Main {
	
	public Main() {
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a largura do retangulo:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura do retangulo:"));
		
		Retangulo r = new Retangulo(largura, altura);
		
		System.out.println(r.toString());
		System.out.println("Perimetro do retangulo: "+ r.calcuraPerimetro());
		System.out.println("Area do retangulo: " + r.calculaArea());
		
	}
}
