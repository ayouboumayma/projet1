package org.GL.gitTest;

public class ImpUtil implements MyInterface {
	int a = 1 ;

	public double prod(double x, double y) {
		
		return x*y;
	}

	public double div(double x, double y) {
		
		return x/y;
	}

	
	public double add(double x, double y) {
		
		return x+y;
	}

	
	public double soustr(double x, double y) {
		
		return x-y;
	}

	
	public int Pgcd(int a, int b) {
		while (a != b) {
			 if (a < b)
				 b = b - a ;
			 else 
				 a = a - b ;
		}            return a;
		
		
	
	}

	
	public int fact(int a) {
	    if (a<0)
	    	 throw new IllegalArgumentException("negative number for factorial");
	    else if (a==0) return (1);
	    else return (a*fact(a-1));
		
	}

	
	public String bin(int a) {
		
		return Integer.toBinaryString(a);
	}
	
	
	public boolean Estpair(int a) {
		if(a%2 == 0)
			return true ;
		else 
			return false;
		
	}

	public int repet() {
		
		return a++;
	}

}
