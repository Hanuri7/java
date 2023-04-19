package test.EX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXtest2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int i1 =0, i2 =0;
		try {
			System.out.print("* 분자(나누어지는 수)입력 :");
			i1 =s.nextInt();
			System.out.print("* 분모(나누는 수(입력) :");
			i2 =s.nextInt();
			System.out.printf("%d ÷ %d = %d\n",i1,i2,i1/i2);
		}catch (ArithmeticException e) {
			System.out.println("* Type Error | 정수 0을 입력*");
			System.out.print("* 분모(나누는 수(입력) :");
			i2 =s.nextInt();
			System.out.printf("%d ÷ %d = %d\n",i1,i2,i1/i2);
		}catch(InputMismatchException e){
			System.out.println("* Type Error | 정수 입력 오류 *");
		}finally {
			System.out.println("Program Close");
		}
		s.close();
	}
}
