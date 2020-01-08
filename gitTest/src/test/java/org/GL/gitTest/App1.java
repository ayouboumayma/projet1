package org.GL.gitTest;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App1 {
	public static void main(String[] args) {
		System.out.println("hello");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null ;
		try { 
			date1 = format.parse("20/10/1995");
		}catch(ParseException e) {
			e.printStackTrace();
		}
		client clt = new client("222","njhn","jkkj","jkhsds","kk", date1, false);
			int age = clt.calculAge();
			System.out.println(age);
		
	}
	

}
