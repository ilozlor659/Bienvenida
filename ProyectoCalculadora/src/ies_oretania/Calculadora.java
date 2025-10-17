package ies_oretania;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Todo en double para permitir decimales
		//variables
		
		double num1;
		double num2;
		
		//Cambio de nextInt a nextDouble respecto a la versión 1.5
		System.out.println("Introduce un número: ");
		num1 = sc.nextDouble();
		System.out.println("Introduce un número: ");
		num2 = sc.nextDouble();
		
		//suma
		double suma;
		suma = num1 + num2;
		
		System.out.printf("La suma de los dos números es: %.2f \n", suma);
		
		//resta
		double resta;
		resta = num1 - num2;
		
		System.out.printf("La resta de los dos números es: %.2f \n ", resta);
		
		//multiplicación
		double multiplicacion;
		multiplicacion = num1 * num2;
		
		System.out.printf("La multiplicación de los dos números es: %.2f \n", multiplicacion);
		
		//división y resto
		double division;
		division = num1 / num2;
		double resto;
		resto = num1 % num2;
		
		System.out.printf("La división de los números es: %.2f \n", division);
		System.out.printf("El resto de la división es: %.2f \n", resto);
		
	//Código realizado por Isaac Lozano Lorente 1ºDAW

	}

}
