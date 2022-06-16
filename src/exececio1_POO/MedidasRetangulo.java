package exececio1_POO;

import java.util.Locale;
import java.util.Scanner;

import dados_retangulo.Retangulo;

public class MedidasRetangulo {

	public static void main(String[] args) {
		// Programa para ler os valores de Largura e Altura do Retangulo
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Retangulo rect = new Retangulo();
		
		System.out.println("Ente com a Altura e Largura do Triangulo: ");
		rect.altura = teclado.nextDouble();
		rect.largura = teclado.nextDouble();
		System.out.printf("A Area do Retangulo é: %.2f\n", rect.Area());
		System.out.printf("O Perimetro do Retangulo é: %.2f\n", rect.Perimetro());
		System.out.printf("A Diagonal do Retangulo é: %.2f", rect.Diagonal());
		
		
		
		
		
		
		teclado.close();

	}

}
