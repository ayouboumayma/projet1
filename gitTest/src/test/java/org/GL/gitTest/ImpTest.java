package org.GL.gitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;






class ImpTest {
	
	static ImpUtil iu = new ImpUtil();
	
	static int  cpt = 0 ;
	
	
	@AfterEach
	public  void incrCount() {
		
		cpt++;
	}
	@AfterAll
	public static void afficheCount() {
		
		System.out.println("nbr de tests : " + cpt);
	}
	
	
	@DisplayName("test d'execution ")
	@BeforeAll
	public static void classTest() {
		
		assertEquals("class test.ImpUtil", iu.getClass().toString());
		System.out.println("class ok");
	}
	
	@RepeatedTest(10) 
	@DisplayName("Repetetion") 	
	
	 void repetition() {
		
		assertEquals(6, iu.repet(), "not equal");
		
		
	}
	@Test
	@DisplayName("teste de produ")
	void testProd() {
		//fail("Not yet implemented");
		assertEquals(12,iu.prod(2,6));
		
	}

	@Test
	@DisplayName("teste de la division")
	void testDiv() {
		//fail("Not yet implemented");
		assertEquals(2,iu.div(8,4));
	}

	@Test
	@DisplayName("teste de ajoute")
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(12,iu.add(6,6));
	}
	
    
	@Test
	
	//@DisplayName("teste de soustraction")
	void testSoustr() {
		//fail("Not yet implemented");
		assertEquals(3,iu.soustr(6,3));
	}

	@Test
	@DisplayName("teste de pgcd")
	void testPGCD() {
		//fail("Not yet implemented");
		assertEquals(15,iu.Pgcd(15,45));
	}

	@Test
	@DisplayName("teste de factoriel")
	void testFact() {
		//fail("Not yet implemented");
		assertEquals(120, iu.fact(5));
	}

	@Test
	@DisplayName("teste de binaire")
	void testBin() {
		//fail("Not yet implemented");
		assertEquals("1111", iu.bin(15));
	}
	
    @ParameterizedTest
    @ValueSource(ints = {15, 236, 37})
	@Test
	 void EstPair(int arg) {
		assertTrue(iu.Estpair(arg),"not pair");
	}
	

}
