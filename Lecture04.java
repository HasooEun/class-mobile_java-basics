import java.util.Scanner;

public class Lecture04{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Lecture04 lecture = new Lecture04();
		System.out.print("실습문제 번호를 입력하세요. ");
		switch(s.nextInt()){
			case 1:		lecture.practice01(s);	break;
			case 2:		lecture.practice02(s);	break;
			case 3:		lecture.practice03(s);	break;
			case 4:		lecture.practice04();	break;
			default:	System.out.println("잘못 입력하셨습니다.");
		}
		s.close();
	}

	public void practice01(Scanner s){
		int iSum = 0; 
		Lecture04_sub lecture04_sub = new Lecture04_sub();
		while(true){
			lecture04_sub.showMenu();
			int menu = s.nextInt();
			if(menu == 1){
				iSum += 15000;
			}else if(menu == 2){
				iSum += 10000;
			}else if(menu == 3){
				iSum += 7000;
			}else if(menu == 4){
				iSum += 2000;
			}else if(menu == 5){
				System.out.println("현재까지의 주문 금액은 " + iSum + "원 입니다.\n");
				break;
			}else{
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("현재까지의 주문 금액은 " + iSum + "원 입니다.");
		}
		System.out.println("총 주문 금액은 " + iSum + "원 입니다.");
	}

	public void practice02(Scanner s){
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하세요. ");
		char cChar = s.next().charAt(0);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하세요. ");
		int iHeight = s.nextInt(), iMargin = s.nextInt();
		Lecture04_sub lecture04_sub = new Lecture04_sub();
		for(int i = 1; i <= iHeight; i++){
			lecture04_sub.printCharWithBlank(iMargin + iHeight - i, i, cChar);
			System.out.println();
		}
	}

	public void practice03(Scanner s){
		Lecture04_sub lecture04_sub = new Lecture04_sub();
		for(int i = 1; i <= 10; i++){
			System.out.print(i + "번재 사람의 신장(cm)과 체중(kg)을 입력하세요. ");
			int iHeight = s.nextInt(), iWeight = s.nextInt();
			lecture04_sub.askBiman(iHeight, iWeight);
		}
	}

	public void practice04(){
		int iSum = 0;
		Lecture04_sub lecture04_sub = new Lecture04_sub();
		Scanner s = new Scanner(System.in);
		while(true){
			int iPrice = lecture04_sub.selectMenu(s);
			if(iPrice == -1){
				System.out.println("현재까지의 주문 금액은 " + iSum + "원 입니다.\n");
				break;
			}else if(iPrice == -2){
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			iSum += iPrice;
			System.out.println("현재까지의 주문 금액은 " + iSum + "원 입니다.");
		}
		s.close();
		System.out.println("총 주문 금액은 " + iSum + "원 입니다.");
	}
}

class Lecture04_sub{

	public void showMenu(){
		System.out.println("1. 피자(15,000원), 2. 스파게티(10,000원), 3. 셀러드(7,000원), 4. 음료수(2,000원)");
		System.out.print("메뉴를 선택해주세요. (종료: 5) ");
	}

	public void printCharWithBlank(int iNumOfBlanks, int iSize, char cChar){
		for(int i=0; i<iNumOfBlanks; i++){
			System.out.print(" ");
		}
		for(int i=0; i<iSize; i++){
			System.out.print(cChar);
		}

	}

	public void askBiman(int height, int weight){
		double bmi = weight / Math.pow(height/100D, 2);
		if(bmi < 18.5){
			System.out.println("저체중입니다.");
		}else if(bmi < 23){
			System.out.println("정상체중입니다.");
		}else if(bmi < 25){
			System.out.println("과체중입니다.");
		}else if(bmi < 30){
			System.out.println("경도비만입니다.");
		}else{
			System.out.println("고도비만입니다.");
		}
	}

	public int selectMenu(Scanner s){
		
		System.out.println("1. 피자(15,000원), 2. 스파게티(10,000원), 3. 셀러드(7,000원), 4. 음료수(2,000원)");
		System.out.print("메뉴를 선택해주세요. (종료: 5) ");
		int menu = s.nextInt();		
		if(menu == 1){
			return 15000;
		}else if(menu == 2){
			return 10000;
		}else if(menu == 3){
			return 7000;
		}else if(menu == 4){
			return 2000;
		}else if(menu == 5){
			return -1;
		}else{
			return -2;
		}
	}
}