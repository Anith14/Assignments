package assignments;

public class PalindromeOrNot
{
	public static void main(String[] args) {
		String sep ="civic";
		String rev ="";
		int Strlength=sep.length();
		for(int i=(Strlength-1);i>=0;--i) {
			rev =rev+sep.charAt(i);
		}
		if(sep.equals (rev))
		{
			System.out.println(" palindrome ");
		}
		else 
		{
			System.out.println(" not a palindrome ");
		}
	}
}
