package AulaBackEnd04;

public class contaPoup extends conta {

	private double taxaJuros;

	public contaPoup(int num, String tit, double sal, double taxa) {
		super(num, tit, sal);
		this.taxaJuros = taxa;
	}

	public contaPoup(int num, String tit, double taxa) {
		super(num, tit);
		this.taxaJuros = taxa;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public double sacar(double saque) {
		saldo -= saque + (saque* (taxaJuros / 100));
		return saque;
	}
}
