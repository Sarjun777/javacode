package basicprogram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String s1="from";
		String s2="form";
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not Anagram");
		}
		else
			
		{
			char [] c1=s1.toCharArray();
			char [] c2=s2.toCharArray();
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("They are Anagram");
			}
			else
			{
				System.out.println("They are not Anagram");
			}
		}
		

	}

}
