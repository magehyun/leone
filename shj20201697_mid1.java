import java.util.Scanner;
import java.util.Random;
public class shj20201697_mid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("다음중 내고 싶은 포지션을 선택하시오 \n1.가위 \n2.바위\n3.보\n");
		int x = s.nextInt();
		
		int select= r.nextInt(3);
		
		switch(select) {	
		case 0:
			System.out.println("컴퓨터는 가위를 냈습니다.");
			if (x== 1) {
				System.out.println("비겼습니다.");
			} else if (x == 2) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("졌습니다.");
			}
			break;
		case 1:
			System.out.println("컴퓨터는 바위를 냈습니다.");
			if (x== 1) {
				System.out.println("졌습니다.");
			} else if (x == 2) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("이겼습니다.");
			}
			break;
		case 2:
			System.out.println("컴퓨터는 보를 냈습니다.");
			if (x== 1) {
				System.out.println("이겼습니다.");
			} else if (x == 2) {
				System.out.println("졌습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
			break;
		default:
			System.out.println("문제가 생겼습니다");
			break;
		}
	}

}
