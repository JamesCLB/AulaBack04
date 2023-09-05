package AulaBackEnd04;

public class contaEmpr extends conta{

	private double limiteEmprestimo;
	
	
	public contaEmpr(int num, String tit, double sal, double limiteEmp) {
		super(num, tit, sal);
		this.limiteEmprestimo = limiteEmp;
	}
	public contaEmpr(int num, String tit, double limiteEmp) {
		super(num, tit);
		this.limiteEmprestimo = limiteEmp;
	}
	public double getLimitEmp() {
		return this.limiteEmprestimo;
	}
	public void setLimitEmp(double limit) {
		this.limiteEmprestimo = limit;
	}
	
	@Override
	public double sacar(double saque) {
		this.saldo -= saque + 5;
		return saque; 
	}
}
