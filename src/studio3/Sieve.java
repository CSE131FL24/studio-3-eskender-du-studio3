package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find all the prime numbers up to n:");
		int n = in.nextInt();
		
		boolean[] prime = new boolean[n+1];
		
		for (int i = 2; i <= n; i++) {
			prime[i]=true;
		}
		
		for (int i = 2; i*i <= n; i++) {
			if (prime[i]) {
				for (int j = i*i; j <= n; j+=i) {
					prime[j]=false;
				}
				
			}
			
		}
		
		System.out.println("All the numbers up to "+ n + " are: ");
		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				System.out.print(i+" ");
			}
		}

	}

}
