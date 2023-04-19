package Arr1;

public class Arr {

	public static void main(String[] args) {
		int[] asd = {2,5,3};
		int[][] darr = new int[3][];
		int qwe=1;
		for(int i=0;i<darr.length;i++) {
			darr[i]=new int[asd[i]];
			for(int j=0;j<darr[i].length;j++) {
				darr[i][j]=qwe++;
			}
		}
		for(int i=0;i<darr.length;i++) {
			for(int j=0;j<darr[i].length;j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
