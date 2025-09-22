package basicprogram;

import java.util.Arrays;

public class Arraybacics {

	public static void main(String[] args) {
		
		
		//Arry Int
		int [] rno=new int[3];
		rno[0]=21;
		rno[1]=29;
		rno[2]=31;
		
		
		
		System.out.println(Arrays.toString(rno));
		
		//Array String
		String [] name=new String[4];
		name[0]="SArjun";
		name[1]="Sjun";
		name[2]="SAjun";
		name[3]="SArjn";
		System.out.println(Arrays.toString(name));
		
		//Arrays Boolean
		Boolean[] b1=new Boolean[2];
		b1[0]=true;
		b1[1]=false;
		System.out.println(Arrays.toString(b1));
		
		//Arrays Char
		char[] c1=new char[3];
		c1[0]='s';
		c1[1]='a';
		c1[2]='r';
		System.out.println(Arrays.toString(c1));
		
		
	}

}
