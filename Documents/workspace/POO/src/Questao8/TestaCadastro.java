package Questao8;

import java.util.ArrayList;
import java.util.List;

public class TestaCadastro {
	
	public static void main(String[] args) {
		
		List<Pessoa> p = new ArrayList<Pessoa>();
		
		p.add(new Cliente(1123, "Zacarias", (new Data(1, 2, 2000))));
		p.add(new Cliente(666, "Josué da Barra", (new Data(10, 10, 1910))));
		p.add(new Cliente(321, "Maria Coisinha", (new Data(8, 6, 1980))));
		
		p.add(new Funcionario(1200, "Figueira", new Data(9, 9, 1990)));
		p.add(new Funcionario(2900, "Frangoso", new Data(5, 2, 1996)));
		p.add(new Funcionario(3200, "Chapolin", new Data(9, 10, 1986)));
		
		p.add(new Gerente("Urbanismo", 5000, "Castor Silva", new Data(6, 1, 1966)));
		p.add(new Gerente("Logistica", 6800, "Sivirina", new Data(1, 3, 1986)));
		p.add(new Gerente("Nem ele sabe", 7000, "Algusto", new Data(7, 12, 1969)));
		
		for (Pessoa pessoa : p) {
			System.out.println(pessoa.imprimeDados());
			System.out.println("\n-------------------\n");
		}
		
		
	}

}
