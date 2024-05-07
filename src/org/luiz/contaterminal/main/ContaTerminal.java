package org.luiz.contaterminal.main;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Terminal</h1>
 * @author Luiz Rodrigo da Silva Maciel
 * @version 1.0
 */

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Bem vindo ao CenterBank!");
		System.out.println("Para criar sua conta digital, vamos seguir alguns passos");
		System.out.println("Primeiro, digite o número da conta:");
		
		int numeroConta = entrada.nextInt();
		
		System.out.println("Ótimo, agora digite a agência:");
		
		String agencia = entrada.next();
		
		System.out.println("Digite agora, por favor, o seu nome:");
		
		String nome = entrada.next();
		
		//Linha necessária para que o nextDouble não pegue o Enter e retorne uma excessão
		entrada.nextLine();
		
		System.out.println("Excelente, agora pra finalizar, digite seu saldo:");
		
		double saldo = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Criando sua conta...");
		System.out.println();
		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta número "+numeroConta+" e seu saldo R$"+saldo+" já está disponível para saque");
	}
}
