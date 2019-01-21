package com.howtodoinjava.jaxws;
   
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebService;
 
import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
 
 
  
 
@WebService(endpointInterface = "com.howtodoinjava.jaxws.HelloWorld")
public class HelloWorldService implements HelloWorld{
	@Override
	public Employee getEmployeeById(Integer id) {
		return new Employee(id, "Arnold Newest");
	}
	@Override
	public Employee deleteEmployeeById(Integer id) {
		return new Employee(1, "Deleted Arnold");
	}

	@Override
	public Employee updateEmployeeById(Integer id, Employee e) {
		return e;
	}

	@Override
	public Employee addEmployee(Employee e) throws URISyntaxException {
		return e;
	}
 

	@Override
	public Employees getAllEmployees() { 
		return getAll();
	}
	
	
	static final Employees list = new Employees();
	static final Employee emp = new Employee(11, "Java To Wsdl", new Date(0), Math.PI, Float.MIN_VALUE , Long.MAX_VALUE, "java@jax.ws", com.howtodoinjava.soap.Gender.BIGENDER, true);

	static {
		list.setEmployeeList(new ArrayList<Employee>());
		list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
		list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
		list.getEmployeeList().add(new Employee(3, "David Kameron"));
		
		list.getEmployeeList().add(emp);
		
	}

	private static final Employees getAll() { 
		return list;
	}
 
 
	@Override
    public String getMsg(String msg)
    {
		return   "Message requested : " + msg; 
        
    }
    
}