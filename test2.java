import java.util.Scanner;
class Test{
public static void checkEvenOdd(int a){
	if((a/2)*2==a)System.out.println("EVEN");
	else
	System.out.println("ODD");
	}
public static void main(String args[]){
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt();
	Test.checkEvenOdd(n);
	}
}