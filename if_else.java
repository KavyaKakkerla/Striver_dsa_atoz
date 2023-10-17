public class Solution {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        String ans;
        if(a>b)
        ans="greater";
        //System.out.println("greater");
        else if(a<b)
        ans="smaller";
        //System.out.println("smaller");
        else
        ans="equal";
       // System.out.println("equal");
        return ans;
        
    }
}
