package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		while( true ){
		
			Random r = new Random();
			int k = r.nextInt( 100 ) + 1;
			
			int max = 100;
			int min = 1;
			int tryCount = 0;
			
			while( true ){
			
				System.out.println( min + "-" + max );
				System.out.print( ++tryCount + ">>");
				int guess = scanner.nextInt();
			
				if( guess > k ) {
					System.out.println( "�� ����" );
					max = guess;
				} else if( guess < k ){
					System.out.println( "�� ����" );
					min = guess;
				} else {
					System.out.println( "�¾ҽ��ϴ�.");
					break;
				}
			}
			
			System.out.print( "�ٽ��Ͻðڴϱ�?(y/n)>>" );
			String yn = scanner.next();
			if( "y".equals( yn ) == false ){
				break;
			}
		}
		
		scanner.close();
	}
}
