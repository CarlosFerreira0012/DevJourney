/*
 * 
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos

*
*What is the dollar price? 3.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20
*
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import conversor.CurrencyConverter;

public class ProgramPrincipal {

	public static void main(String[] args) {

		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price?");
		double price = sc.nextDouble();

		System.out.print("How many dollars will be bought?");
		double quantity = sc.nextDouble();

		double result = CurrencyConverter.converte(quantity, price);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		// Errado System.out.print("Amount to be paid in reais: ", converter.value);

		sc.close();

	}

}
