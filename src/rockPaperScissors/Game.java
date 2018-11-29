package rockPaperScissors;

import java.util.Scanner;
import java.util.Random;



public class Game {

	
	
	public static void main(String[] args){
		int p1h;
		do {
		p1h=human();
		
		int c1h=computer();
		 
		System.out.print(CheckHands(p1h,c1h));
		}while (p1h < 4);
		System.out.println("Thanks");
	}
		
		

	public static int human(){
		int h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 for paper, 2 for scissors and1 3 for rock or 4 to exit");
		h = sc.nextInt();
		sc.close();
		return h;}
		
		
	public static int computer() {
		Random rnd = new Random();
		int cm = rnd.nextInt (3)+1;
		return cm;
		}
	
	public static Boolean CheckHands(int p1h, int c1h) {
		int Paper = 1;
		int	Scissors = 2;
		int Rock = 3;
		
		if (p1h == c1h) {
			System.out.println("The game is a draw");
		return false;
		
		}else {
			switch (p1h) {
				case 1:
					if (c1h == Scissors) {
					System.out.println("Computer has won");
						return true;
						}
					else {
						System.out.println("Human has won");
						return false;
					}
					
				case 2:
					if (c1h == Rock) {
						System.out.println("Computer has won");
						return true;
					}
					else {
				System.out.println("Human has won");
						return false;
					}
			
				case 3:
					if (c1h == Paper) {
						System.out.println("Computer has won");
						return true;
					}
					else {
						System.out.println("Human has won");
						return false;
					}
				
			}
			return false;	
		}
	}
}
	

		 