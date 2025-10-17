package es_iesoretania_saludo;
import java.util.Scanner;
public class Hola{
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Hola bro");
		System.out.println("Vamos a hacer una suma");
		int num1;
		int num2;
		int num3;
		int num4;
		int total;
		
		System.out.println("Introduce un número:");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número:");
		num2 = sc.nextInt();
		System.out.println("Introduce otro número:");
		num3 = sc.nextInt();
		System.out.println("Introduce otro número:");
		num4 = sc.nextInt();
		
		total = num1 + num2 + num3 + num4;
		System.out.println("La suma de los cuatro números es: " + total);


	}
}
