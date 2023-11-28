package ud2ED;

import java.util.Scanner;

public class Ejercicio2Examen {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=0;
		do {
			System.out.println("Introduce un numero");
			num=in.nextInt();
			if (!esValido(num))
					System.out.println("Rango no valido");
		}while(esValido(num)==false);
		multiplica(num);
	}
	public static boolean esValido(int num) {
		if (num>=0 && num<=10)
			return true;
		
		return false;
	}

	public static void multiplica (int num) {
		for (int i=0;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
}
