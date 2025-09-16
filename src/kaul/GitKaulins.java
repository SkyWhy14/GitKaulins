package kaul;

import java.util.Random;
import java.util.Scanner;



public class GitKaulins {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Esi sveicināts mana metama kauliņa programma!");
		int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.print("Cik reizes mest kaulinu: ");
		reizes = scan.nextInt();
		
			mestkaulinu(reizes);
			scan.close();
		}

	static void mestkaulinu(int reizes) {
		
		int skaitlis;
		Random rand = new Random();
		for(int i=1;i<=reizes;i++) {
		skaitlis = rand.nextInt(6)+1;
		if(skaitlis == 6)
			System.out.println("Uzkrita skaitlis : "+skaitlis+" 7");
		else 
			System.out.println("Uzkrita skaitlis : "+skaitlis);
			
		}
	}
	
		
	
}
	
		
	

