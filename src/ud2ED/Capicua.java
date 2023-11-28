package ud2ED;

public class Capicua {

	public static void main(String[] args) {
		int u=0,d=0,c=0,m=0,dm=0;
		int num=12345;
		
		while (num>=10000) {
			num=num-10000;
			dm++;
		}
		while (num>=1000) {
			num=num-1000;
			m++;
		}
		while (num>=100) {
			num=num-100;
			c++;
		}
		while (num>=10) {
			num=num-10;
			d++;
		}
		u=num;
		
		System.out.println(dm+" "+m+" "+" "+c+" "+
				d+" "+u);
		

	}

}
