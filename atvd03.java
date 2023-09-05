package AulaBackEnd04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atvd03 {

	public static void main(String[] args) {
		List<conta> contas = new ArrayList<>();
		System.out.println("Digite o numero de contas que serão digitadas:");
		Scanner batata = new Scanner(System.in);
		int qtd = batata.nextInt();
		int ii = 1;
		while(ii <= qtd) {
			System.out.printf("\nConta #%d", ii);
			System.out.println("Conta Poupança ou Empresarial (p/e)? ");
			String pOuM = batata.next();
			System.out.println("Numero da conta: ");
			int num = batata.nextInt();
			System.out.println("Nome do titular: ");
			String titulo = batata.next();
			System.out.println("Saldo inicial: ");
			double saldo = batata.nextDouble();
			switch(pOuM){
			case "p":
				System.out.println("Taxa de juros (%): ");
				double taxa = batata.nextDouble();
				if(saldo > 0) {
					contaPoup conta = new contaPoup(num, titulo, saldo, taxa);
				}else {
					contaPoup conta = new contaPoup(num, titulo, taxa);
				}
				break;
			case "e":
				System.out.println("Limite de empréstimo: ");
				double limit = batata.nextDouble();
				if(saldo > 0) {
					contaEmpr conta = new contaEmpr(num, titulo, saldo, limit);
				}else {
					contaEmpr conta = new contaEmpr(num, titulo, limit);
				}
				break;
			case "P":
				System.out.println("Taxa de juros (%): ");
				double taxa2 = batata.nextDouble();
				if(saldo > 0) {
					contaPoup conta = new contaPoup(num, titulo, saldo, taxa2);
				}else {
					contaPoup conta = new contaPoup(num, titulo, taxa2);
				}
				break;
			case "E":
				System.out.println("Limite de empréstimo: ");
				double limit2 = batata.nextDouble();
				if(saldo > 0) {
					contaEmpr conta = new contaEmpr(num, titulo, saldo, limit2);
				}else {
					contaEmpr conta = new contaEmpr(num, titulo, limit2);
				}
				break;
			default:
				System.out.println("Opção inexistente");
			}
			
			ii++;
		}
		double saque = 100;
		double saldoTotal = 0;
	}

}
