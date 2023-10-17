//https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        //sc=nextLine();
        char c=sc.next().charAt(0);
        if(c>='A'&&c<='Z')
            System.out.println("1");
        else if(c>='a'&&c<='z')
            System.out.println("0");
        else
            System.out.println("-1");

    }
}
