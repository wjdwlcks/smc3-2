import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Grade me = new Grade();
		me.math=sc.nextInt();
		me.science =sc.nextInt();
		me.english= sc.nextInt();
		System.out.println("Æò±Õ¿î "+me	.average());
		

	}

}

class Grade{
	int math;
	int science;
	int english;
	
	int average(){
		int result;
		
		result= (math+science+english)/3;
		return result;
		
	}
	
}
