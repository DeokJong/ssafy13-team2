import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static int T;
	private static int[] dp = new int[11];
	public static void main(String[] args) {
		T = sc.nextInt();
		sc.nextLine();
		initializeDp();
		
		for(int i =0;i<T;i++) {
			System.out.println(dp[Integer.parseInt(sc.nextLine())-1]);
		}
		
	}
	
	private static void initializeDp() {
		dp[0] = 1;
		dp[1] = 2;
		dp[2] = 4;
		
		for(int i =3;i<10;i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
	}
}
