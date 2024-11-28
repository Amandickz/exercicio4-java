
import java.util.Scanner;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/

public class Exercicio1 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int x;
		
		System.out.println("Digite o valor de x: ");
		x = scan.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i%2 != 0) {
				System.out.printf("%d\n", i);
			}
		}
				
	}

}
