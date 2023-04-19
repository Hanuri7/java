package test.EX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXtest3 {
	static void inputTest( ) {
		Scanner s =new Scanner(System.in);
		int i1 =0, i2 =0;
		System.out.print("* 분자(나누어지는 수)입력 :");
		i1 =s.nextInt();
		System.out.print("* 분모(나누는 수(입력) :");
		i2 =s.nextInt();
		System.out.printf("%d ÷ %d = %d\n",i1,i2,i1/i2);
		s.close();
	}
	public static void main(String[] args) {
		try{
			inputTest();
		}catch(Exception e) {
			System.out.println("정수를 0으로 나누었는지 확인");
			System.out.println("입력 값이 정수가 맞는지 확인");
		}
	}
}
