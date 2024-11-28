
import java.util.Scanner;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

public class Exercicio4 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		double x, y, result;
		
		System.out.println("Digite o número de divisões: ");
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.printf("Digite os valores: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão Impossível\n");
			} else {
				result = x/y;
				System.out.printf("%.1f\n\n", result);
			}
			
		}
				
	}

}
