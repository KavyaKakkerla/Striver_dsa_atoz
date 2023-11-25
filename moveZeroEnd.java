/*Fewer Operations in the Second Implementation: The second implementation eliminates the need for a separate loop to find the first zero. Instead, it simultaneously moves non-zero elements to the front and fills the remaining positions with zeros in a single pass. This reduces the number of iterations over the array and, consequently, the number of operations.

No Swapping in the Second Implementation: The second implementation directly assigns values without the need for swapping. Swapping involves additional temporary variable assignments, which can contribute to inefficiency.

Single Loop in the Second Implementation: The second implementation uses a single loop to accomplish the task, whereas the first implementation uses two loops. Fewer loops generally result in better performance.

In summary, the second implementation is more efficient because it optimizes the process of moving non-zero elements to the front and filling the remaining positions with zeros, resulting in fewer operations and a potentially faster execution time.
*/
class Solution {
    public void moveZeroes(int[] nums) {
        
      /*  if(nums.length==1)
        return;
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
                return;
        }
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }*/
    if(nums.length==1)
        return;
    int nonzeroindex=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=0)
            {
                nums[nonzeroindex]=nums[i];
                nonzeroindex++;
            }
    }
    while(nonzeroindex<nums.length)
    {
        nums[nonzeroindex]=0;
        nonzeroindex++;
    }
}
}
