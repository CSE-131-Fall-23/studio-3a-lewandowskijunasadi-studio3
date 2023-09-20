package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		System.out.println("What number do you want to go to?");
		int n = in.nextInt();
		boolean[] numbers = new boolean [n+1];
		for (int i=2; i<=n; i++)
		{
			numbers[i]=true;
		}
		for (int i=2; i<=n; i++)
		{
			if (numbers [i]==true)
			{

				for (int j=2; (j*i)<=n; j++)
				{
					numbers [i*j] = false;
				}

			}

		}
		for (int i=1; i<=n;i++)
		{
			if (numbers[i]==true)
			{
				System.out.println(i);
			}
		}
	}
}

