package Problems;

import java.util.*;


public class Problem55 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Input seconds : ");
		int seconds = in.nextInt();
		int S = seconds%60;
		int H = seconds/60;
		int M = H%60;
		System.out.println(H + " : " + M + " : " + S);
		System.out.println("\n");
		
		
	}

}
