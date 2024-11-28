
import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

public class Exercicio3 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int n;
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a quantidade de casos de teste: ");
		n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			nota1 = scan.nextDouble();
			nota2 = scan.nextDouble();
			nota3 = scan.nextDouble();
			
			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			
			System.out.printf("Média Ponderada: %.1f\n\n", media);
			
		}
				
	}

}
