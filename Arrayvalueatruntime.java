package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayvalueatruntime {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int [] input =new int[sc.nextInt()];
		for(int i=0;i<=input.length-1;i++)
		{
			input[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(input));
		

	}

}
