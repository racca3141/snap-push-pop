import java.util.*;
import java.util.Scanner;

public class ComputeSteps{

	public ComputeSteps(){

	}
	
	public int fib(int s){
		if(s == 0) return 0;
		if(s == 1) return 3;
		if(s == 2) return 5;
		
		return fib(s - 1) + fib(s - 2) - 1;
	}

	public boolean pal(String s){
		if(s.length() == 1) return true;
		if(s.length() == 2) return s.substring(0,1).equals(s.substring(1,2));
	
		if(s.substring(0,1).equals(s.substring(s.length() - 1)))
			return pal(s.substring(1, s.length() - 1));
		else
			return false;
	}


	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		ComputeSteps cs = new ComputeSteps();

		int total = 0;
		System.out.println("For the following stairs, you are only allowed to take 1, 3, 5 or any combination of these steps: ");
		System.out.println();
		for(int c = 0; c <= 10; c++){
			total = cs.fib(c);
			System.out.println("For stairs with " + c + " steps, there are " + total + " ways of getting to the top.");
		}

		System.out.println();
		System.out.println();
		
		while(true){
			System.out.print("Type a word to check if it's a palindrome (or Enter to exit): ");
			String checkWord = reader.nextLine();
			
			if(checkWord.equals("")) break;

			System.out.println("Is '" + checkWord + "' a palindrome? " + cs.pal(checkWord));
			System.out.println();
		}	

	}

}
