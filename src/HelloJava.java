import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your first name.");

		String name = scan.next();

		System.out.println("Hello, " + name);

		scan.close();

	}

}
