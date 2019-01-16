package com.howtodoinjava.jaxws;

import java.net.URISyntaxException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC, use=Use.ENCODED)
public interface HelloWorld {

	Employee deleteEmployeeById(Integer id);

	Employee updateEmployeeById(Integer id, Employee e);

	Employee addEmployee(Employee e) throws URISyntaxException;

	Employee updateEmployeeById(Integer id);

	Employees getAllEmployees();

	String getMsg(String msg);

}
