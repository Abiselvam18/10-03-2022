package simplepgms;
import java.util.Scanner;
//User defined exception
class CheckAge extends Exception{
	public CheckAge(String s) {
		super(s); //calls super class constructor (Exception class)
	}
}

public class Mainclass {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		try {
			if(age<18) {
				//CheckAge ob=new CheckAge("Not eligible for voting");
				//throw ob;
				throw new CheckAge("Not eligible for voting");
			}
			else {
				System.out.println("You can vote");
			}
		}catch(CheckAge e) {
			e.printStackTrace();
		}
	}

}
