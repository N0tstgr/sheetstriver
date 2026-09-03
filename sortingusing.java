import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] nums = {1,2,6,4,5};
	    System.out.println(Rsort(nums,0));
	    
         	}
         	static boolean Rsort(int[] nums, int index){
         	    if(index==nums.length-1){
         	        return true;
         	    }
         	    return nums[index]<nums[index+1] && Rsort(nums, index+1);
         	}
}
