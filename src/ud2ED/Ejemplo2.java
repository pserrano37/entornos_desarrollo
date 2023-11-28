package ud2ED;
//Que muestre los pares del 0 al 100
public class Ejemplo2 {
	public static void main(String[] args) {
		int i=0;
		do {
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}while(i<100);
		System.out.println("Hasta luego");
	}
}
