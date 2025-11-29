package nit.com.nt.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MoreOperationOnServiceTest {
	
	private static MoreOperationONService service;
	
	
	@BeforeAll
	public  static void setUpOnce()
	{
		System.out.println("MoreOperationOnServiceTest.setUpOnce()");
		service=new MoreOperationONService();
		
	}
	
	
	@Test
	public void testIsPallendromeWithValidData()
	{
		System.out.println("MoreOperationOnServiceTest.testIsPallendromeWithValidData()");
		String msg="madam";
		assertTrue(service.isPallendrome(msg));
	}
	
	
	@Test
	public void testIsPallendromeWithInvalidData()
	{
		System.out.println("MoreOperationOnServiceTest.testIsPallendromeWithInvalidData()");
		String msg="Harry";
		assertFalse(service.isPallendrome(msg));
	}
	
	@Test
	@Tag("prod")
	@DisplayName("Testing with Valid date")
	public void testShowDateByValidMonth()
	{
		System.out.println("MoreOperationOnServiceTest.testShowDateByValidMonth()");
		Date actual=service.showDateByMonth(1);
		assertNotNull(actual);
	}
	
	@Test
	@Tag("prod")//TO check Specific   Test case method
	@DisplayName("Testing with Invalid date")
	public void testShowDateByInvalidMonth()
	{
		System.out.println("MoreOperationOnServiceTest.testShowDateByInvalidMonth()");
		Date actual=service.showDateByMonth(-1);
		assertNull(actual);
	}
	
	@Test
	public void testSingletomLocalTime()
	{
		System.out.println("MoreOperationOnServiceTest.testSingletomLocalTime()");
		LocalTime time1=LocalTime.now();
		LocalTime time2=LocalTime.of(10,20);
		assertNotSame(time1,time2);
	}
	
	@Test
	public void testSingletonRuntime()
	{
		System.out.println("MoreOperationOnServiceTest.testSingletonRuntime()");
		Runtime time1=Runtime.getRuntime();
		Runtime time2=Runtime.getRuntime();
		assertSame(time1,time2);
	}
	
	
	
	@AfterAll
	public  static void tearDown()
	{
		System.out.println("MoreOperationOnServiceTest.tearDown()");
		service=null;
		
	}

}
