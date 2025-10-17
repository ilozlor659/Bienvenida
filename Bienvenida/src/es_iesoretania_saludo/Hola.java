package es_iesoretania_saludo;
import java.util.Scanner;
public class Hola{
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Hola bro");
		int num1;
		int num2;
		int total;
		
		System.out.println("Introduce un número:");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número:");
		num2 = sc.nextInt();
		
		total = num1 + num2;
		
		System.out.println("La suma de los dos números es: " + total);


	}
}
