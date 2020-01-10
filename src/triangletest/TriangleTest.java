package triangletest;

import triangle.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class TriangleTest {
	
	private Triangle tr;
	//private int a;
	//private static int b;
	
	@BeforeAll
	static void startTest() {
		
		System.out.println("Test Begin!");
		//b = 2;
		
	}
		
	@BeforeEach //substitui o @Before
	void setUp() {
		
		tr = new Triangle();
		//a = 1;
		
	}
	
		
	@Test
	@DisplayName("Test method isTriangle")//opcional
	void isTriangle() {		
		
		/*System.out.println(a);
		b = b + 1;
		System.out.println(b);*/
		
		assertTrue(tr.isTriangle(3, 4, 5));		
		assertFalse(tr.isTriangle(0, 0, 0));
		
	}

	@Test
	@DisplayName("Test method isEquilateral")//opcional
	@RepeatedTest(2)//opcional
	void isEquilateral() {		
		
		/*a = a + 1;
		System.out.println(a);
		b = b + 1;
		System.out.println(b);*/
		
		assertEquals( 1, tr.isEquilateral(10, 10, 10));		
		assertEquals(-1, tr.isEquilateral(7, 8, 9));
				
	}
	
	 //@Disabled("Disabled method until isEscaleno been implemented")
	 @Test
	 @DisplayName("Test method isScalene")//opcional	 
	 void isScalene() {		
		
		 assertEquals(2, tr.isScalene(7, 8, 9));
		 assertEquals(-1, tr.isScalene(7, 7, 8));
		 //System.out.println("Nada");
							
	 }
	 
	 @Test
	 @DisplayName("Test method isIsosceles")//opcional	 
	 void isIsosceles() {		
		
		 assertEquals(-1, tr.isIsosceles(7, 8, 9));
		 assertEquals(3, tr.isIsosceles(7, 7, 8));
		 //System.out.println("Nada");
							
	 }
	 
	 //@Disabled("Disabled method until isRectangle been implemented")
	 @Test
	 @DisplayName("Test method isRectangle")//opcional	 
	 void isRectangle() {		
		
		 assertEquals(4, tr.isRectangle(5, 12, 13));
		 assertEquals(-1, tr.isRectangle(7, 7, 8));
		 //System.out.println("Nada");
							
	 }
	 
	 @Test
	 @DisplayName("Roda na versão 8 e 10 do Java")//opcional
	 @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_10, JRE.JAVA_11})
	 void onJava() {
		 System.out.println("JRE OK");
	 }
	 
	 @Test
	 @EnabledOnOs({ OS.LINUX })
	 void onLinux() {
		 
		 System.out.println("OS OK");
	    
	 }
	 
	@AfterEach
    void finaSet() {
		
		System.out.println("End Test.");
		
	}
		
	@AfterAll
	static void closeTest() {
		
		System.out.println("Test End!");
		//b = 2;
		
	}	
	

}
