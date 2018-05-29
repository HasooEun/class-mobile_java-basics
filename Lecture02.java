import java.util.Scanner;

public class Lecture02{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Lecture02 lecture = new Lecture02();
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
			case 10:	lecture.practice10(s);	break;
			case 11:	lecture.practice11(s);	break;
			case 12:	lecture.practice12(s);	break;
			default:	System.out.println("잘못 입력하셨습니다.");
		}
		s.close();
	}

	public void practice01(Scanner s){
		System.out.print("태어난 년도를 입력하세요. ");
		int birth_year = s.nextInt();
		int age = 2018 - birth_year + 1;
		if(age < 20){
			System.out.println("미성년자 입니다.");
		} else {
			System.out.println("미성년자가 아닙니다.");
		}
	}

	public void practice02(Scanner s){
		System.out.print("직사격형의 가로 길이를 입력하세요. ");
		int width = s.nextInt();
		System.out.print("직사격형의 세로 길이를 입력하세요. ");
		int height = s.nextInt();
		int area = width * height;
		System.out.print("직사각형의 넓이는 " + area + "이고, ");
		if(width == height){
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("직사각형입니다.");
		}
	}

	public void practice03(Scanner s){
		System.out.print("아파트의 분양 면적을 입력하세요. ");
		double m2_area = s.nextDouble();
		double pyung_area = Util.round(m2_area / 3.305, 1);
		System.out.print("아파트의 평형은 " + pyung_area + "이고, ");
		if(pyung_area < 30){
			System.out.println("30평 미만이므로 작은 아파트입니다.");
		} else {
			System.out.println("30평 이상이므로 큰 아파트입니다.");
		}
	}

	public void practice04(Scanner s){
		System.out.print("국어 점수를 입력하세요. ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		int math = s.nextInt();
		int total = kor + eng + math;
		double avg = Util.round(total/3D, 1);
		System.out.println("입력하신 점수의 총점은 " + total + "이고,");
		System.out.println("평균은 " + avg + " 입니다.");
		if(kor >= 90){
			System.out.println("국어 점수가 우수합니다.");
		}
		if(eng >= 90){
			System.out.println("영어 점수가 우수합니다.");
		}
		if(math >= 90){
			System.out.println("수학 점수가 우수합니다.");
		}
	}

	public void practice05(Scanner s){
		System.out.println("온도를 입력하세요.");
		System.out.print("[입력 예 - 20 C, 68 F] ");
		double input_degree = s.nextDouble();
		char kind = s.next().charAt(0);
		double output_degree = 0;
		if(kind == 'C'){
			output_degree = input_degree * 1.8 + 32;
		} else if(kind == 'F'){
			output_degree = (input_degree - 32) / 1.8;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println("변환된 온도는 " + Util.round(output_degree, 1) + " 입니다.");
	}

	public void practice06(Scanner s){
		System.out.print("날 수를 입력하세요. ");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		int m_count = (int) (seconds / 1000000);
		System.out.println("날 수에 해당되는 기간은 " + seconds + "초 입니다.");
		if(m_count > 0){
			System.out.println("100만 초가 " + m_count + "번 포함됩니다.");
		}
	}

	public void practice07(Scanner s){
		System.out.print("신장(cm단위)을 입력하세요. ");
		int height = s.nextInt();
		System.out.print("체중(kg단위)를 입력하세요. ");
		int weight = s.nextInt();
		double bmi = weight / Math.pow(height/100D, 2);
		if(bmi >= 25){
			System.out.println("당신은 비만입니다.");
		}else{
			System.out.println("당신은 비만이 아닙니다.");
		}
	}

	public void practice08(Scanner s){
		System.out.print("태어난 년도를 입력하세요. ");
		int birth_year = s.nextInt();
		int age = 2018 - birth_year + 1;
		if(age < 7){
			System.out.println("유아입니다.");
		}else if(age < 13){
			System.out.println("어린이입니다.");
		}else if(age < 20){
			System.out.println("청소년입니다.");
		}else if(age < 30){
			System.out.println("청년입니다.");
		}else if(age < 60){
			System.out.println("중년입니다.");
		}else{
			System.out.println("노년입니다.");
		}
	}

	public void practice09(Scanner s){
		System.out.print("물의 온도를 입력하세요. ");
		double input_degree = s.nextDouble();
		if(input_degree >= 80){
			System.out.println("끓는 물입니다.");
		}else if(input_degree >= 40){
			System.out.println("온수입니다.");
		}else if(input_degree >= 25){
			System.out.println("미온수입니다.");
		}else if(input_degree >= 0){
			System.out.println("냉수입니다.");
		}else{
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice10(Scanner s){
		System.out.print("아파트의 분양 면적을 입력하세요. ");
		double m2_area = s.nextDouble();
		double pyung_area = Util.round(m2_area / 3.305, 1);
		System.out.print("아파트의 평형은 " + pyung_area + "이므로 ");
		if(pyung_area < 15){
			System.out.println("소형 아파트입니다.");
		}else if(pyung_area < 30){
			System.out.println("중소형 아파트입니다.");
		}else if(pyung_area < 50){
			System.out.println("중형 아파트입니다.");
		}else{
			System.out.println("대형 아파트입니다.");
		}
	}

	public void practice11(Scanner s){
		System.out.print("월 일을 입력하세요. ");
		int month = s.nextInt();
		int day = s.nextInt();
		int day_count = 0;
		int iDayOfEachMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month > 12 || month < 1 || day < 1 || day > iDayOfEachMonth[month-1]){
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for(int i = 1; i < month; i++){
			day_count += iDayOfEachMonth[i-1];
		}
		day_count += day;
		System.out.println("이 날짜는 1년 중 " + day_count + "번째 날에 해당됩니다.");
	}

	public void practice12(Scanner s){
		System.out.print("3개의 수를 입력하세요. ");
		int num1 = s.nextInt(), num2 = s.nextInt(), num3 = s.nextInt();
		int max_num = num1, min_num = num1;

		if(max_num < num2){
			max_num = num2;
		} else {
			min_num = num2;
		}

		if(max_num < num3){
			max_num = num3;
		} else if(num3 < min_num){
			min_num = num3;
		}
		System.out.println("가장 큰 수는 " + max_num + "이고, 가장 작은 수는 " + min_num + "입니다.");
	}
}