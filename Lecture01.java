import java.util.Scanner;

public class Lecture01{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Lecture01 lecture = new Lecture01();
		System.out.print("실습문제 번호를 입력하세요. ");
		switch(s.nextInt()){
			case 1:		lecture.practice01(s);	break;
			case 2:		lecture.practice02(s);	break;
			case 3:		lecture.practice03(s);	break;
			case 4:		lecture.practice04(s);	break;
			case 5:		lecture.practice05(s);	break;
			case 6:		lecture.practice06(s);	break;
			default:	System.out.println("잘못 입력하셨습니다.");
		}
		s.close();
	}

	public void practice01(Scanner s){
		System.out.print("태어난 년도를 입력하세요. ");
		int birth_year = s.nextInt();
		int age = 2018 - birth_year + 1;
		System.out.println("당신의 나이는 " + age + " 입니다.");
	}

	public void practice02(Scanner s){
		System.out.print("섭씨 온도를 입력하세요. ");
		double c_degree = s.nextDouble();
		double f_degree = c_degree * 1.8 + 32;
		System.out.println("화씨 온도는 " + Util.round(f_degree, 1) + "도 입니다.");
	}

	public void practice03(Scanner s){
		System.out.print("직사격형의 가로 길이를 입력하세요. ");
		int width = s.nextInt();
		System.out.print("직사격형의 세로 길이를 입력하세요. ");
		int height = s.nextInt();
		int area = width * height;
		System.out.println("직사각형의 넓이는 " + area + " 입니다.");
	}

	public void practice04(Scanner s){
		System.out.print("아파트의 분양 면적을 입력하세요. ");
		double m2_area = s.nextDouble();
		double pyung_area = Util.round(m2_area / 3.305, 1);
		System.out.println("아파트의 평형은 " + pyung_area + " 입니다.");
	}

	public void practice05(Scanner s){
		System.out.print("날 수를 입력하세요. ");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("날 수에 해당되는 시간은 모두 " + seconds + "초 입니다.");
	}

	public void practice06(Scanner s){
		System.out.print("국어 점수를 입력하세요. ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		int math = s.nextInt();
		int total = kor + eng + math;
		double avg = Util.round(total / 3, 1);
		System.out.println("입력하신 점수의 총점은 " + total + "이고,");
		System.out.println("평균은 " + avg + " 입니다.");
	}
}