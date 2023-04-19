package test.met;

import java.util.Scanner;

public class method3 {
	static void printAdd(int i1, int i2) {
		int dex =i1 +i2;
		System.out.printf("%d + %d = %d\n",i1,i2,dex);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		int i1=0,i2=0;
		while (true) {
			System.out.print("정수 입력 1");
			i1 =s.nextInt();
			System.out.print("정수 입력 2");
			i2 =s.nextInt();
			printAdd(i1, i2);
			System.out.println("NEXT? (y/n)");
			String con =s2.nextLine();
			if(con.equals("n")||con.equals("N")) {
				break;
			}
		}
		System.out.println("Close");
		s.close();
		s2.close();
	}
}
