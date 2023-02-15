package Formula_de_Bhaskara;

import java.util.Locale;
import java.util.Scanner;

public class Formula_de_Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		// verifica se os valores são possiveis calcular
		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}	
		else {
			// formula de bhaskara calculando os valores de r1 e r2
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		sc.close();	
		
		}
	
}