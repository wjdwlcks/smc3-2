import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		

	System.out.print("10���� ���� ������  �ϳ��� ���纸����(1~50)���� : ");
	Scanner sc = new Scanner(System.in);	
	int b= sc.nextInt();
	int count =0;
	for(int i=0;i<10;i++) {
	int a= (int)(Math.random()*50+1);
	System.out.print(a+" ");
	
	if(a==b) {
		count++;
		
	}
	
}
	
	System.out.println(" ");
	if(count==1) {
		System.out.println("��÷");
	}
	else
		System.out.println("����");
	
	
	
	
	
	}

}
