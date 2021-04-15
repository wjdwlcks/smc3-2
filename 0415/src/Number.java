import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		

	System.out.print("10개의 렌덤 숫자중  하나를 맞춰보세요(1~50)까지 : ");
	Scanner sc = new Scanner(System.in);	
	int b= sc.nextInt(); //입력
	int count =0; //당첨여부 확인위해 선언
	for(int i=0;i<10;i++) { // 숫자 랜덤 생성
	int a= (int)(Math.random()*50+1);
	System.out.print(a+" ");
	
	if(a==b) { //만약에 같은숫자가 나오면 count에 1추가
		count++;
		
	}
	
}
	
	System.out.println(" ");
	if(count==1) {	// 1이면 당첨
		System.out.println("당첨");
	}	
	else			//아니면 아님
		System.out.println("ㅉㅉ");
	
	
	
	
	
	}

}
