package com.howtodoinjava.jersey;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Test;

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Gender;

public class EmployeeTest {

	@Test
	public void testEmployee() {
		Employee e = new Employee();
		assertNotNull(e);
	}

	@Test
	public void testEmployeeObjectArray() {
		Employee e = null;
		e = new Employee(11);
		assertEquals(  e.getId(), new Integer(11));
		e = new Employee(11, "Text Name");
		assertEquals(  e.getId(), new Integer(11));
		assertEquals(  "Text Name" , e.getName());

		// ...
		e = new Employee(11, "Text Name", new BigInteger(""+new Date().getTime()), Math.PI, Float.MIN_VALUE , Long.MAX_VALUE, "test@java.lang", Gender.BIGENDER, true);
		assertEquals(  e.getId(), new Integer(11));
		assertEquals(  "Text Name", e.getName() );
		assertNotNull( e.getDob() );
		
		assertNotNull( e.getLat()  );
		assertNotNull( e.getLon()  );
		assertNotNull( e.getPhone()   );
		assertNotNull( e.getPhone()   );
		assertEquals( Gender.BIGENDER,  e.getSex() );
		assertTrue( e.getAlive() );
		
	}

}
