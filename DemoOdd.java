import java.util.Scanner;

public class DemoOdd{

	public static void main(String args[]){

while(true){	
	System.out.println("Type the Number:  ");

	Scanner scanNum1 = new Scanner(System.in);

	long num1 = scanNum1.nextLong();
	
	if( num1 % 2 == 0 ){
		System.out.println(num1 + " is Even Number" );
		}
	else{
		System.out.println(num1 + "is Odd Number");
		}
}
}
}