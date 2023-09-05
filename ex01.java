package AulaBackEnd04;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner batata = new Scanner(System.in);
		triangulo t1 = new triangulo();
		System.out.println("Enter measures of first triangle: ");
		t1.a = batata.nextDouble();
		t1.b = batata.nextDouble();
		t1.c = batata.nextDouble();
		triangulo t2 = new triangulo();
		System.out.println("Enter measures of secont triangle: ");
		t2.a = batata.nextDouble();
		t2.b = batata.nextDouble();
		t2.c = batata.nextDouble();
		double area1 = t1.calculaArea();
		double area2 = t2.calculaArea();
		System.out.println("Areas: ");
		System.out.printf("1a %.2f", area1);
		System.out.printf("2a %.2f", area2);
		
		
	}

}
