package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public Double Dividir(Scanner scan) throws ArithmeticException, InputMismatchException {

		try {
			System.out.print("Digite um numerador: ");
			Object num = scan.nextDouble();
			System.out.print("Digite um denominador: ");
			Object denom = scan.nextDouble();
			if ((Double)denom == 0) {
				throw new ArithmeticException ("Não se pode dividir por zero.");			
			}
			
			if ((Double)denom == null || (Double)num == null ) {
				throw new InputMismatchException ("Valor inserido inválido.");			
			}
			
			double res = (double) ((Double)num/(Double)denom);

			String resStr = String.format("%.2f", res);
			return Double.parseDouble(resStr);

		} 

		catch (InputMismatchException e) {
			System.out.println("Valor inserido inválido");
			return null;
		}
		catch (ArithmeticException e ){
			System.out.println(e.getMessage());
			return null;
		}
	}

}
