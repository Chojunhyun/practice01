package practice01;

public class Prob2 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=8; i++) {
			for(int j=i; j<10+i; j++) {
				System.out.print(j + " ");
				count++;
			}
			System.out.println();
		}
	}
}
