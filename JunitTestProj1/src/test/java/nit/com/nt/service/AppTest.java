package nit.com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@DisplayName("Testing  the Apptest")
//@TestMethodOrder(MethodName.class)
//@TestMethodOrder(MethodName.OrderAnnotation.class)// Execute  method  on the  Based on the @order(1) ......
//@TestMethodOrder(MethodName.DisplayName.class)// Execute  method  on the  Based on DisplayName("Test 1) ......
@TestMethodOrder(MethodName.Random.class)// Execute  method at random Order......
public class AppTest {

	
	private static Arithmetic op;
	
	
	@BeforeAll
	public static void setup()
	{
		System.out.println("TestArithmaticOpertation.setup()");
		op=new Arithmetic();		
	}
		
	
	
	@BeforeEach
	public void beforeTest()
	{
		System.out.println("AppTest.beforeTest()");
	}
	
	
	
	@Test
	
	@DisplayName("Testing 1 with Positive")
	//@Order(2)
	//@Tag("test")
	public void testWithPositives()
	{
		System.out.println("AppTest.testWithPositives()");
		float excepted=30.0f;
		float actual=op.sum(10.50f,20.0f);		
		//perform testing
		assertEquals(excepted,actual,0.5);
	}
   
	
	@Test
	//@Order(3)
	@DisplayName("Testing 2 with Negative")
	public void testWithNegetives()
	{
		System.out.println("AppTest.testWithNegetives()");
		float excepted=-30.0f;
		float actual=op.sum(-10.0f,-20.0f);
		//perform testing
		assertEquals(excepted,actual);
	}
	
	
	
	@Test
	@DisplayName("Testing 3 with Zero")
	//@Tag("test")
	//@Order(4)
	public void testWithZeros()
	{
		System.out.println("AppTest.testWithZeros()");
		float excepted=0.0f;
		float actual=op.sum(0.0f,0.0f);
		//perform testing
		assertEquals(excepted,actual);
	}
	
	
	
	@Test
	//@Order(1)
	@DisplayName("Testing 4 With Mixed")
	public void testWithMixedValues()
	{
		
		System.out.println("AppTest.testWithMixedValues()");
		float a=10;
		float b=-20;
		float excepted=-10.0f;
		float actual=op.sum(a,b);		
		//perform testing
		assertEquals(excepted,actual);
	}

	
	@AfterAll
	public static void tearDown()
	{
		System.out.println("TestArithmaticOpertation.tearDown()");
		op=null;		
	}
	
	
	
	
	
	

}
