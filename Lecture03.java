import java.util.Scanner;

public class Lecture03{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Lecture03 lecture = new Lecture03();
		System.out.print("실습문제 번호를 입력하세요. ");
		switch(s.nextInt()){
			case 1:		lecture.practice01(s);	break;
			case 2:		lecture.practice02(s);	break;
			case 3:		lecture.practice03(s);	break;
			case 4:		lecture.practice04(s);	break;
			case 5:		lecture.practice05(s);	break;
			case 6:		lecture.practice06(s);	break;
			case 7:		lecture.practice07(s);	break;
			case 8:		lecture.practice08(s);	break;
			case 9:		lecture.practice09(s);	break;
			default:	System.out.println("잘못 입력하셨습니다.");
		}
		s.close();
	}

	public void practice01(Scanner s){
		int iSum = 0;
		System.out.print("숫자를 입력하세요. ");
		int iNumber = s.nextInt();
		if(iNumber < 1){
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for(int i = 1; i <= iNumber; i++){
			iSum += i;
		}
		System.out.println("1부터 " + iNumber + "까지 더한 결과는 " + iSum + "입니다.");
	}

	public void practice02(Scanner s){
		int iMax_num = -1, iMin_num = 101;
		while(true){
			System.out.print("0부터 100사이의 숫자를 입력하세요. ");
			int iNumber = s.nextInt();
			if(iNumber < 0 || iNumber > 100)	break;
			if(iMax_num < iNumber)	iMax_num = iNumber;
			if(iMin_num > iNumber)	iMin_num = iNumber;
		}
		System.out.println("가장 큰수: " + iMax_num + ", 가장 작은 수: " + iMin_num);
	}

	public void practice03(Scanner s){
		int iCount = 0, iSum = 0;
		while(true){
			System.out.print("0부터 100사이의 숫자를 입력하세요. ");
			int iNumber = s.nextInt();
			if(iNumber < 0 || iNumber > 100)	break;
			iSum += iNumber;
			iCount++;
		}
		double dAvg = Util.round((double)iSum/iCount, 1);
		System.out.println("입력 받은 수의 개수: " + iCount + ", 총합: " + iSum + ", 평균: " + dAvg);
	}

	public void practice04(Scanner s){
		int iNumOfSmall = 0, iNumOfSmall_Mid = 0, iNumOfMiddle = 0, iNumOfLarge = 0;
		for(int i = 0; i < 10; i++){
			System.out.print("분양 면적을 입력하세요. ");
			double m2_area = s.nextDouble();
			double pyung_area = Util.round(m2_area / 3.305, 1);
			System.out.println("이 아파트는 " + pyung_area + "평 입니다.");
			if(pyung_area < 15){
				iNumOfSmall++;
			}else if(pyung_area < 30){
				iNumOfSmall_Mid++;
			}else if(pyung_area < 50){
				iNumOfMiddle++;
			}else{
				iNumOfLarge++;
			}
		}
		System.out.println("소형: " + iNumOfSmall + ", 중소형: " + iNumOfSmall_Mid + ", 중형: " + iNumOfMiddle + ", 대형: " + iNumOfLarge);
	}

	public void practice05(Scanner s){
		System.out.print("정사각형의 크기를 입력하세요. ");
		int iSize = s.nextInt();
		for(int i=0; i<iSize; i++){
			for(int j=0; j<iSize; j++){
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public void practice06(Scanner s){
		System.out.print("높이와 왼쪽 여백의 크기를 입력하세요. ");
		int iHeight = s.nextInt();
		int iMargin = s.nextInt();
		for(int i=1; i<=iHeight; i++){
			for(int j=1; j<=iMargin+iHeight-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice07(Scanner s){
		System.out.print("높이를 입력하세요. ");
		int iHeight = s.nextInt();
		for(int i=1; i<=iHeight; i++){
			for(int j=1; j<=iHeight-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice08(Scanner s){
		System.out.print("출력 모드(1: 홀수 단, 2: 짝수 단)를 입력하세요. ");
		int iMode = s.nextInt();
		if(iMode == 1){
			iMode += 2;
		} else if(iMode != 2){
			System.out.println("잘못 입력하셨습니다.");
		}
		for(int i=iMode; i<=9; i+=2){
			for(int j=1; j<=9; j++){
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				if(j % 3 == 0){
					System.out.println();
				}
			}
			System.out.println();
		}
	}

	public void practice09(Scanner s){
		System.out.print("출력 모드(1: 홀수 단, 2: 짝수 단)를 입력하세요. ");
		int iMode = s.nextInt();
		System.out.print("한 줄에 출력할 개수를 입력하세요.");
		int iColumn = s.nextInt();
		if(iMode == 1){
			iMode += 2;
		} else if(iMode != 2){
			System.out.println("잘못 입력하셨습니다.");
		}
		for(int i=iMode; i<=9; i+=2){
			for(int j=1; j<=9; j++){
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				if(j % iColumn == 0){
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}