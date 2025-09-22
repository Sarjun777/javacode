package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Copyfromonetoanotherandreverse {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int []a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int [] b=new int[a.length];
		
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}

		System.out.println(Arrays.toString(b));
	}

}
