package AulaBackEnd04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atvd01 {

	public static void main(String[] args) {
		Scanner batata = new Scanner(System.in);
		List<funcionario> funcionarios = new ArrayList<>();
		System.out.println("Quantos funcionarios você quer registrar? ");
		int qtd = batata.nextInt();
		int contador = 1;
		String nome;
		int id;
		double salario;
		while (contador <= qtd) {
			System.out.printf("Funcionario %d", contador);
			System.out.println("\nNome: ");
			nome = batata.next();
			System.out.println("Id: ");
			id = batata.nextInt();
			System.out.println("Salario: ");
			salario = batata.nextInt();
			funcionarios.add(new funcionario(nome, id, salario));
			contador++;
		}
		System.out.println("Informe o id do funcionario que tera o aumento salarial em porcentagem: ");
		int idF = batata.nextInt();
		for (funcionario funcionario : funcionarios) {
			if (funcionario.getId() == idF) {
				System.out.println("Funcionario encontrado");
				System.out.printf("Salario: %.2f", funcionario.getSalario());
				System.out.println("\nDigite quantos porcento no aumento salarial: ");
				double aumentoP = batata.nextDouble();
				funcionario.aumento(aumentoP);
			}
		}
		System.out.println("Lista de funcionarios:");
		for(funcionario func : funcionarios) {
			System.out.printf("\n%d, %s, %.2f", func.getId(), func.getName(), func.getSalario());
		}
	}
}
