package simuladoPOO.menu;

import java.util.Scanner;

public class Menu {
	
	public static final int mostrar() {
		Scanner teclado = new java.util.Scanner(System.in);
		System.out.println("/*-----------------------------------------------*/");
		System.out.println("/*              Menu do simulado                 */");
		System.out.println("/*-----------------------------------------------*/");
		System.out.println("/*                                               */");
		System.out.println("/*  1 - Fisica                                   */");
		System.out.println("/*  2 - Juridica                                 */");
		System.out.println("/*  99 - Sair do simulado                        */");
		System.out.println("/*                                               */");
		System.out.println("/*-----------------------------------------------*/");
		System.out.println("/* Escolha uma opcao : ");
		return teclado.nextInt();
	}

}
