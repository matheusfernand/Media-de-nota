package application;

import java.util.Scanner;

public class vetmat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//N�mero de alunos na sala
		System.out.println("Insira o n�mero de alunos");
		int numAlunos = sc.nextInt();
		double[] notaAlunos = new double[numAlunos];
		double soma = 0;

		//Repeti��o para pedir a nota de todos os alunos
		for (int i = 0; i<numAlunos; i++) {
			System.out.println("Nota do aluno " + (i+1) + ":");
			notaAlunos[i] = sc.nextDouble();
			
		}
		//Repeti��o para mostrar a nota de todos os alunos individualmente e os lista pelo n�mero
		for (int i = 0; i<numAlunos; i++) {
			System.out.println((i+1) + " - " + notaAlunos[i]);
		}
		System.out.println("A m�dia da nota da sala �: " + soma / numAlunos);
	}
}
