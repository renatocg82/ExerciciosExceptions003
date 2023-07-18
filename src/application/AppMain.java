package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Divisao;

public class AppMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Divisao divisao = new Divisao();;
		
		char op = 's';
		Double result = 0.0;
		while (op == 's') {
			result = divisao.Dividir(sc);
			if (result != null) {
				System.out.println("Resultado da divisão: " + String.format("%.2f", result) );
			}	

			sc.nextLine();	
			
			System.out.println("--------------");
			System.out.print("Deseja outra divisão(s/n)? ");
			op = sc.next().charAt(0);
			
		}
		
		
		sc.close();
	}

}
