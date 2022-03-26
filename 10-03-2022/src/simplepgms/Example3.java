package simplepgms;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		String n=null;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name");
			n=sc.nextLine();
			System.out.println("Name="+n);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
