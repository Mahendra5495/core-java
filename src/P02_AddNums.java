import java.util.Scanner;

public class P02_AddNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 and number 2: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(String.format("%d + %d = %d", n1, n2, n1 + n2));
		sc.close();
	}

}
