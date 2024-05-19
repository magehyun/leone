import java.util.Scanner;
import java.util.Random;
public class shj20201697_mid2 {

	public static void main(String[] args) {

		
		
		int me = 100;
		int cp = 100;
		
		int at1 = 10;
		int at2 = 15;
		int atx1 = 0;
		int atx2 = 0;
		
		int p = 8;
		
		int turn1 = 0;
		int turn2 = 0;
		
		
		while (me > 0 && cp >0 ) {
			Scanner s = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("다음중 내고 싶은 포지션을 선택하시오 \n1.가위 2.바위 3.보");
			int x = s.nextInt();
			int select= r.nextInt(3);
			
			switch(select) {	
			case 0:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				if (x== 1) {
					System.out.println("비겼습니다.");
				} else if (x == 2) {
					System.out.println("이겼습니다.");
					turn1 ++;
				} else if (x==3){
					System.out.println("졌습니다.");
					turn2 ++;
				}
				break;
			case 1:
				System.out.println("컴퓨터는 바위를 냈습니다.");
				if (x== 1) {
					System.out.println("졌습니다.");
					turn2++;
				} else if (x == 2) {
					System.out.println("비겼습니다.");
				} else if(x==3){
					System.out.println("이겼습니다.");
					turn1++;
				}
				break;
			case 2:
				System.out.println("컴퓨터는 보를 냈습니다.");
				if (x== 1) {
					System.out.println("이겼습니다.");
					turn1++;
				} else if (x == 2) {
					System.out.println("졌습니다.");
					turn2++;
				} else if(x==3){
					System.out.println("비겼습니다.");
				}
				break;
			default:
				System.out.println("문제가 생겼습니다4");
				break;
			}
			
			if(turn1 > 0 && atx1 == 0) {
				System.out.println("당신의 턴입니다.\n 1.공격 2.공격강화 3.체력회복");
				int g = s.nextInt();
				switch(g){
				case 1:
					if (Math.random()<= 0.1) {
						cp -= at1*2;
						System.out.println("크리티컬!");
					}else {
						cp -= at1;
					}
					System.out.println("컴퓨터를 공격하였습니다.");
					break;
				case 2:
					System.out.println("공격을 강화하였습니다.");
					atx1++;
					break;
				case 3:
					me += p;
					System.out.println("체력회복 하였습니다.");
					break;
				default:
					System.out.println("문제가 생겼습니다6");
					break;
				}
				System.out.println("내체력="+me+"\n컴퓨터 체력="+cp);
				turn1 --;
			}
			else if (turn2 >0 && atx2 == 0) {
				int h = r.nextInt(3);
				System.out.println("컴퓨터의 턴입니다.");
				switch(h){
				case 0:
					if (Math.random()<= 0.1) {
						me -= at1*2;
						System.out.println("크리티컬!");
					}else {
						me -= at1;
					}
					System.out.println("당신을 공격하였습니다.");
					break;
				case 1:
					System.out.println("컴퓨터가 공격을 강화하였습니다.");
					atx2++;
					break;
				case 2:
					cp += p;
					System.out.println("컴퓨터가 체력회복 하였습니다.");
					break;
				default:
					System.out.println("문제가 생겼습니다6");
					break;
				}
				System.out.println("내체력="+me+"\n컴퓨터 체력="+cp);
				turn2--;
			}
			else if(turn1 > 0 && atx1 == 1){
				System.out.println("당신의 턴입니다.\n 1.강화공격 2.체력회복");
				int g = s.nextInt();
				switch(g){
				case 1:
					if (Math.random()<= 0.1) {
						cp -= at2*2;
						System.out.println("크리티컬!");
					}else {
						cp -= at2;
					}
					System.out.println("컴퓨터를 공격하였습니다.");
					break;
				case 2:
					me += p;
					System.out.println("체력회복 하였습니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 턴을넘깁니다.");
					break;
				}
				System.out.println("내체력="+me+"\n컴퓨터 체력="+cp);
				turn1 --;
			}
			else if(turn2 > 0 && atx2 == 1){
				int h = r.nextInt(2);
				System.out.println("컴퓨터의 턴입니다.");
				switch(h){
				case 0:
					if (Math.random()<= 0.1) {
						me -= at2*2;
						System.out.println("크리티컬!");
					}else {
						me -= at2;
					}
					System.out.println("당신을 공격하였습니다.");
					break;
				case 1:
					cp += p;
					System.out.println("컴퓨터가 체력회복 하였습니다.");
					break;
				default:
					System.out.println("잘못된 입력입니다. 턴을넘깁니다.");
					break;
				}
				System.out.println("내체력="+me+"\n컴퓨터 체력="+cp);
				turn2--;
			}
			else {
				System.out.println("다음턴");
			}
			if(me < 0) {
				System.out.println("당신이 졌습니다.");
			}
			else if(cp <0) {
				System.out.println("당신이 이겼습니다.");
			}
		}
		
		
	}

}
