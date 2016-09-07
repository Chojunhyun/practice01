package practice01;

import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		
		int num = 0, cnt=1;		// num:입력값, cnt:카운트
		int min=1, max=100;
		boolean b = true;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요." + k);
		System.out.println("1-100");
		
		while(b) {
			System.out.print(cnt++ + " >> ");
			num = scanner.nextInt();
			
			if(k == num ) {		// 정답일 경우
				System.out.println("찾았습니다.");
				System.out.print("다시 하시겠습니까(y/n)>>");
				String answer = scanner.next();
				
				if(answer.equals("n")) {
					b = false;				// 반복문(while) 종료
				}
				else {
					k = r.nextInt(100) + 1;	// 랜덤한 수 다시 받기
					System.out.println("수를 결정하였습니다. 맞추어 보세요." + k);
					min = 1;
					max = 100;
					cnt=1;
				}
			}
			else if(k > num) {		// 정답(k)보다 입력값(num)이 작을 경우 
				System.out.println("더 높게");
				min = num;
				System.out.println(min + "-" + max);
			}
			else {					// 정답(k)보다 입력값(num) 클 경우
				System.out.println("더 낮게");
				max = num;
				System.out.println(min + "-" + max);
			}
		}
		
		
		scanner.close();
	}
}
