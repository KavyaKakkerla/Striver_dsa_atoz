import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		int n;
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		int even_sum=0,odd_sum=0;

		//while(n>0) donot keeep n>=0 tle error is coming
    while(n>0)
		{
			int digit=n%10;
			n=n/10;
			if(digit%2==0)
			{
				even_sum+=digit;
			}
			else
			{
				odd_sum+=digit;
			}
		}
		System.out.println(even_sum+" "+odd_sum);

	}
}
