package AulaBackEnd04;

public class triangulo {
	public double a, b, c;
	
	public double calculaArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
