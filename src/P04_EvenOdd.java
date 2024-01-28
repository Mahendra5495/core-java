import java.util.Scanner;

public class P04_EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		
		String ans = n % 2 == 0? "Even" : "Odd";
		System.out.println(String.format("%d is %s", n, ans));
		sc.close();
	}

}
