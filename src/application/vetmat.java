package application;

import java.util.Scanner;

public class vetmat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Número de alunos na sala
		System.out.println("Insira o número de alunos");
		int numAlunos = sc.nextInt();
		double[] notaAlunos = new double[numAlunos];
		double soma = 0;

		//Repetição para pedir a nota de todos os alunos
		for (int i = 0; i<numAlunos; i++) {
			System.out.println("Nota do aluno " + (i+1) + ":");
			notaAlunos[i] = sc.nextDouble();
			
		}
		//Repetição para mostrar a nota de todos os alunos individualmente e os lista pelo número
		for (int i = 0; i<numAlunos; i++) {
			System.out.println((i+1) + " - " + notaAlunos[i]);
		}
		System.out.println("A média da nota da sala é: " + soma / numAlunos);
	}
}
