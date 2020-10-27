package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		System.out.println();
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?: ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				Double saudeDespesas = sc.nextDouble();
				Pessoa ip = new PessoaFisica(name, rendaAnual, saudeDespesas);
				pessoas.add(ip);
			}
			else if(op == 'c') {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				Pessoa cp = new PessoaJuridica(name, rendaAnual, employees);
				pessoas.add(cp);
			}
					
		}
		System.out.println("TAXES PAID:");
		Double sum = 0.0;
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
			sum += pessoa.impostoDeRenda();
		}
		
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
