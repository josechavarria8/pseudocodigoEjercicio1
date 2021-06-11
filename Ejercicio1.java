import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args[])  {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		double i;
		int impares = 0;
		int n;
		int numaleatorio;
		int pares = 0;
		System.out.println("Ingrese un numero: ");
		n = scanner.nextInt();
		for (i=1;i<=n;i++) {
                   
			numaleatorio = random.nextInt(100);
			if (numaleatorio%2 == 0) {
				pares = pares+1;
			} else {
				impares = impares+1;
			}
		}
		System.out.println("Total de numeros pares: "+pares);
		System.out.println("Total de numeros impares: "+impares);
	}


}

