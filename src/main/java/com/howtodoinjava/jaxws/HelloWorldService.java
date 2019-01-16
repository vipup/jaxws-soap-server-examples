package com.howtodoinjava.jaxws;
  
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
 

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
 
@WebService
public class HelloWorldService
{
	
	@WebMethod
	public Employee deleteEmployeeById(Integer id)
	{      
	    return new Employee(1,"Deleted Arnold");
	}
	
	@WebMethod
	public Employee updateEmployeeById( Integer id, Employee e)
	{
		return e;
	}

	@WebMethod
	public Employee addEmployee( Employee e ) throws URISyntaxException
	{ 
		return e;
	}
    
	@WebMethod
    public Employee updateEmployeeById( Integer id)
    {
         
        Employee emp = new Employee(id,"Updated Max");
         
        emp.setId(id);
        emp.setName("Lokesh Gupta");
         
        
        return emp;
    }
    
    
	@WebMethod
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
    public String getMsg(String msg)
    {
        String output = "Message requested : " + msg;
        //Simply return the parameter passed as message
        return output;
    }
    
}