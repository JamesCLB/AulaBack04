package AulaBackEnd04;

public class conta {
	protected int numero;
	protected String titular;
	protected double saldo;

	public conta(int num, String tit, double sal) {
		this.numero = num;
		this.titular = tit;
		this.saldo = sal;
	}

	public conta(int num, String tit) {
		this.numero = num;
		this.titular = tit;
	}

	public double sacar(double saque) {
		this.saldo -= saque;
		return saque;
	}

	public void depositar(double depo) {
		this.saldo += depo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
