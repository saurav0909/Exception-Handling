package checkanduncheckexecption;

import java.util.Scanner;

public class UncheckExecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter First Number=");
		num1=sc.nextInt();
		System.out.println("Enter Second Number=");
		num2=sc.nextInt();
		int div=num1/num2;
		System.out.println("result="+div);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			sc.close();
		}
		
		

	}

}
