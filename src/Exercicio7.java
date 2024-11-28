
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

public class Exercicio7 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		double quadrado, cubo;
		
		System.out.println("Digite o número: ");
		n = scan.nextInt();
		
		System.out.println("\n");
		
		for(int i = 1; i <= n; i++) {
			
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			
			System.out.printf("%d %.0f %.0f\n", i, quadrado, cubo);
			
		}
				
	}

}
