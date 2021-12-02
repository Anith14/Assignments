package assignments;

public class missingNumber {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,6,8};
		System.out.println("Missing number in arr1 is" +missingNumber(arr1));

	}
	 public static int missingNumber(int[] arr)
	    {
	        int n=arr.length+1;
	        int a=n*(n+1)/2;
	        int b=0;
	        for (int i = 0; i < arr.length; i++) {
	            b+=arr[i];
	        }
	        int missingNumber=a-b;
	        return missingNumber;
}
}