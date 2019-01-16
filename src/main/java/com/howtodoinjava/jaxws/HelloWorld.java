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
@SOAPBinding(style = Style.DOCUMENT) 
public interface HelloWorld {

	Employee deleteEmployeeById(Integer id);

	Employee updateEmployeeById(Integer id, Employee e);

	Employee addEmployee(Employee e) throws URISyntaxException;

	Employee updateEmployeeById(Integer id);

	Employees getAllEmployees();
	@WebMethod
	String getMsg(String msg);

}
