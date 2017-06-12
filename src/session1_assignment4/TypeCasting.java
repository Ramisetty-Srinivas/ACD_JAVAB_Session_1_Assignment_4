package session1_assignment4;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values for 'a' and 'b'");
		a = s.nextByte();
		b = s.nextShort();
		c = a+b;
		System.out.println("The value of Integer after adding Byte & Short : " +c);
		
		System.out.println("Enter the values of 'b' and 'c'");
		b = s.nextShort();
		c = s.nextInt();
		d = b+c;
		System.out.println("The value of Long after adding Short & Integer : " +d);
		
		System.out.println("Enter the values of 'c' and 'd'");
		c = s.nextInt();
		d = s.nextLong();
		e = c+d;
		System.out.println("The value of Float after adding Integer & long : " +e);
		
		System.out.println("Enter the values of 'd' and 'e'");
		d = s.nextLong();
		e = s.nextFloat();
		f = d+e;
		System.out.println("The value of Double after adding Long & Float : " +f);
		
		s.close();
		
		
	}

}
