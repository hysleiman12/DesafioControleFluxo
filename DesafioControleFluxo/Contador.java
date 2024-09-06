package DesafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int parametroUm, ParametroDois;

		System.out.println("Informe o número a ser o primeiro parâmetro: ");
		parametroUm = ler.nextInt();

		System.out.println("Informe o número a ser o segundo parâmetro: ");
		ParametroDois = ler.nextInt();

		try {

			contar(parametroUm, ParametroDois);
		} catch (Exception e) {
			System.out.println("O segundo número de parametro dever maior que o primeiro!.");
		}finally {
			System.out.println("Finalizado!!!");
			ler.close();
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException,InputMismatchException {

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo número de parâmetro deve ser maior que primeiro ");
			
			
		
		}
		int contador = parametroDois - parametroUm;
		for (int iteracao = 1; iteracao <= contador; iteracao++) {
	
			System.out.printf("\nImprimindo a diferença de %d e %d. Contando %d",parametroUm,
			parametroDois,iteracao,"\n");
			
		}

		

	}
	
}
