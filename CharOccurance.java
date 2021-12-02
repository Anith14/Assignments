package assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		System.out.println("Occurance of");
		int count =0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='e')
			
			{
				count++;
			}
			
		}
		System.out.println("e=" +count);
	}

	}

