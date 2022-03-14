package application;

import java.util.Scanner;

import Entity.Produto;

public class appication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores do Produto");
		Produto produto= new Produto();
		produto.addProductQuantity(sc.nextInt());
		produto.setName(sc.next());
		produto.setPrice(sc.nextDouble());
		System.out.println(produto);
		produto.addProductQuantity(10);
		System.out.println(produto);
		produto.removeProductQuantity(15);
		System.out.println(produto);
		System.out.println(produto.priceTotal());

	}

}
