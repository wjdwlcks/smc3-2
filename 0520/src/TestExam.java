import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
			
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("500 이하의 자연수를 입력하세요.");
		
		int a = scan.nextInt();
		int sum=0;
		
		for(int i=1;i<=a;i++){
			if(i%3==0 && i%2==1){
				System.out.println(i);
				sum+=i;
				
			}
			
		}
		System.out.println("1~"+a+"까지 3의 배수이면서 홀수인 수의 합은 "+sum+"입니다.");
		

	}

}
