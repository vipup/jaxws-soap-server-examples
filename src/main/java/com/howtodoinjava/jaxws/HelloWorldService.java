package com.howtodoinjava.jaxws;
  
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
  
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
@WebService(endpointInterface = "com.howtodoinjava.jaxws.HelloWorld")
public class HelloWorldService implements HelloWorld{
	
	@WebMethod
	@Override
	public Employee deleteEmployeeById(Integer id)
	{      
	    return new Employee(1,"Deleted Arnold");
	}
	
	@WebMethod
	@Override
	public Employee updateEmployeeById( Integer id, Employee e)
	{
		return e;
	}

	@WebMethod
	@Override
	public Employee addEmployee( Employee e ) throws URISyntaxException
	{ 
		return e;
	}
    
	@WebMethod
	@Override
    public Employee updateEmployeeById( Integer id)
    {
         
        Employee emp = new Employee(id,"Updated Max");
         
        emp.setId(id);
        emp.setName("Lokesh Gupta");
         
        
        return emp;
    }
    
    
	@WebMethod 
	@Override
    public Employees getAllEmployees()
    {
        Employees list = new Employees();
        list.setEmployeeList(new ArrayList<Employee>());
         
        list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
        list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
        list.getEmployeeList().add(new Employee(3, "David Kameron"));
         
        return list;
    }
    
	@WebMethod 
	@Override
    public String getMsg(String msg)
    {
        String output = "Message requested : " + msg;
        //Simply return the parameter passed as message
        return output;
    }
    
}