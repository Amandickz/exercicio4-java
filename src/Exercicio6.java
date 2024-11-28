
import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

public class Exercicio6 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o número: ");
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.printf("%d\n", i);
			}
		}
				
	}

}
