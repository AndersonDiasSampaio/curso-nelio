package application;

import java.util.*;

public class ProgramTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xA, xB, xC, yA, yB, yC;
		double p = 0, area = 0, p1 = 0, area1 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as dimens�es do primeiro triangulo");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite as dimens�es do segundo triangulo");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		p = (xA + xB + xC) / 2;
		area = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p1 = (yA + yB + yC) / 2;
		area = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		if (p > p1)

		{
			System.out.println("O primeiro triangulo � maior");

		} else if (p == p1) {
			System.out.println("A �rea dos 2 triangulos s�o iguais");
		} else {
			System.out.println("O segundo triangulo � maior");

		}
	}

}
