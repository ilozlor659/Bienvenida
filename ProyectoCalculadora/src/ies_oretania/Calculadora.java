package ies_oretania;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce un número: ");
		num2 = sc.nextInt();
		
		//suma
		double suma;
		suma = num1 + num2;
		
		System.out.println("La suma de los dos números es: " + suma);
		
		//resta
		double resta;
		resta = num1 - num2;
		
		System.out.println("La resta de los dos números es: " + resta);
		
		//multiplicación
		double multiplicacion;
		multiplicacion = num1 * num2;
		
		System.out.println("La multiplicación de los dos números es: " + multiplicacion);
		
		//división
		double division;
		division = num1 / num2;
		double resto;
		resto = num1 % num2;
		
		System.out.println("La división de los números es: " + division);
		System.out.println("El resto de la división es: " + resto);
		
	

	}

}
