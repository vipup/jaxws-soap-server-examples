package com.howtodoinjava.jaxws;
   
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.jws.WebService;

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
 
 
  
 
@WebService(endpointInterface = "com.howtodoinjava.jaxws.HelloWorld")
public class HelloWorldService implements HelloWorld{
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
	public Employee updateEmployeeById(Integer id) {

		Employee emp = new Employee(id, "Updated Max");

		emp.setId(id);
		emp.setName("Lokesh Gupta");

		return emp;
	}

	@Override
	public Employees getAllEmployees() {
		Employees list = new Employees();
		list.setEmployeeList(new ArrayList<Employee>());

		list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
		list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
		list.getEmployeeList().add(new Employee(3, "David Kameron"));

		return list;
	}
 
 
	@Override
    public String getMsg(String msg)
    {
		return   "Message requested : " + msg; 
        
    }
    
}