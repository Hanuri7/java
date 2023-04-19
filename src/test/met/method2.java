package test.met;

public class method2 {
	static void printHead(char c, int asd) {
		//System.out.println("-------------------------------------------------------------------------------------------------");
		for(int i=0;i<asd;i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		printHead('*',30);
		System.out.println("yuhan");
		printHead('@',10);
		System.out.println("snow");
		printHead('^',20);
	}

}
