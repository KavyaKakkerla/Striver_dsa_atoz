import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.

		*/
		int n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//int[n+1] dp;
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
			for(int i=2;i<=n;i++)
			{
				dp[i]=dp[i-1]+dp[i-2];
			}
		System.out.println(dp[n]);
		


		
	}

}
2ND SOLUTION
  import java.util.Scanner;
public class Solution {

	public static int Fib(int n)
	{
		if(n<=1)
			return n;
		return Fib(n-1)+Fib(n-2);
	}
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.

		*/
		int n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int ans=Fib(n);
		System.out.println(ans);


		
	}

}

