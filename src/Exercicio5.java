
import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

public class Exercicio5 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		int n, result;
		
		System.out.println("Digite o valor para fatorar: ");
		n = scan.nextInt();
		
		result = 1;
		
		if(n == 0 || n == 1) {
			System.out.println("1");
		} else {
			
			for(int i = 0; i < n; i++) {
				result = result * (n-i);
			}
			
			System.out.printf("\n%d", result);
			
		}
				
	}

}
