package kaul;

import java.util.Random;

public class kaulins {

	static void mestkaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for(int i=1;i<=reizes;i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis "+skaitlis);
		}
	}
	public static void main(String[] args) {
		mestkaulinu(3);
	}
}
	
		
	

