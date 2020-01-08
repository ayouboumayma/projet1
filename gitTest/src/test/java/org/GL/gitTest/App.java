package org.GL.gitTest;

public class App 
{
	
	public boolean IsPalindrome(String word) {
		if (word==null) {
			throw new IllegalArgumentException("input String Null");
		}
		if (word.equals(Reverse(word))) {
			return true;
		}
		else return false;
	}
	private String Reverse(String input) {
		String rev ="";
		for(int i = input.length()-1;i>=0 ; i--) {
			{rev = rev+input.charAt(i);}
		}
		return rev;
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	}
