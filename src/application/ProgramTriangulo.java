package application;

import java.util.*;

import Entity.Triangulo;
public class ProgramTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xA, xB, xC, yA, yB, yC;
		double p = 0, area = 0, p1 = 0, area1 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as dimensões do primeiro triangulo");
	/*	xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		p = (xA + xB + xC) / 2;
		area = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p1 = (yA + yB + yC) / 2;
		area = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));*/
		Triangulo x, y;
		x= new Triangulo();
		y= new Triangulo();
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		System.out.println("Digite as dimensões do segundo triangulo");

		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());

		if (x.area() > y.area())

		{

		} else if (x.area() == y.area()) {
			System.out.println("A área dos 2 triangulos são iguais" + x.area()+"segunda: "+y.area());
		} else {
			System.out.println("O segundo triangulo é maior");

		}
		

	}

}
