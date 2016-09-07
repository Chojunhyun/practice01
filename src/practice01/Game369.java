package practice01;

public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			String str = String.valueOf(i);
			
			if(str.length() == 1) {		// 한자리 수
				if(str.charAt(0)=='3' || str.charAt(0)== '6' || str.charAt(0)=='9') {
					System.out.println(i + " 짝");
				}
			}
			else {						// 두자리 수
				if(str.charAt(0)=='3' || str.charAt(0)== '6' || str.charAt(0)=='9'
						|| str.charAt(1)== '3' || str.charAt(1)=='6' || str.charAt(1)=='9') {
					System.out.print(i);
					
					// 두자리수 박수 구별(짝 or 짝짝)
					if((str.charAt(0)=='3' || str.charAt(0)== '6' || str.charAt(0)=='9')
						&& (str.charAt(1)== '3' || str.charAt(1)=='6' || str.charAt(1)=='9')) {
						System.out.println(" 짝짝");
					}
					else {
						System.out.println(" 짝");
					}
				}
			}
		}
	}
}
