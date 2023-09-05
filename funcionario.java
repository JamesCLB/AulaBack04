package AulaBackEnd04;

public class funcionario {
	private int id;
	private double salario;
	private String nome;

	public funcionario(String nome2, int id2, double salario2) {
		this.id = id2;
		this.nome = nome2;
		this.salario = salario2;
	}

	public void aumento(double aumento) {
		salario = salario + salario * (aumento / 100);
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}
	public String getName() {
		return nome;
	}
}
