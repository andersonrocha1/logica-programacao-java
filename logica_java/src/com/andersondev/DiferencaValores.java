package com.andersondev;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaValores {
	/*
	Leia quatro valores inteiros A, B, C, D a seguir. Calcule
	e mostre a diferença do produto de A e B pelo produto de C e D
	segundo a fórmula DIFERENCA = (A * B - C * D)
	
	ENTRADA: O arquivo de entrada contém 4 valores inteiros
	
	SAÍDA: Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
	com um espaço em branco antes e depois da igualdade.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int DIFERENCA = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	

	}

}
