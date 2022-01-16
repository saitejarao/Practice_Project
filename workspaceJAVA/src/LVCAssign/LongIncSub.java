package LVCAssign;

public class LongIncSub {
	
	    static int max_ref; // stores the LIS
	 
	    static int display(int arr[], int n)
	    {
	        if (n == 1)
	            return 1;
	        int res, max_ending_here = 1;
	        for (int i = 1; i < n; i++) {
	            res = display(arr, i);
	            if (arr[i - 1] < arr[n - 1]
	                && res + 1 > max_ending_here)
	                max_ending_here = res + 1;
	        }
	        if (max_ref < max_ending_here)
	            max_ref = max_ending_here;
	        return max_ending_here;
	    }
	 
	    static int test(int arr[], int n)
	    {
	        max_ref = 1;
	        display(arr, n);
	        return max_ref;
	    }
	    public static void main(String args[])
	    {
	        int arr[] = { 57,82,20,11,38,90,36,49 };
	        int n = arr.length;
	        System.out.println("Length of Longest increasing subsequence is " +test(arr, n)
	                           + "\n");
	    }
}

