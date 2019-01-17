package com.howtodoinjava.jaxws;
 

import java.net.URISyntaxException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC) 
public interface HelloWorld {
	@WebMethod
	Employee deleteEmployeeById(Integer id);
	@WebMethod
	Employee updateEmployeeById(Integer id, Employee e);
	@WebMethod
	Employee addEmployee(Employee e) throws URISyntaxException;
 
	@WebMethod
	Employees getAllEmployees();
	
	
	@WebMethod
	String getMsg(String msg);

}
