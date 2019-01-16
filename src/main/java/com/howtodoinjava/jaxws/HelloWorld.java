package com.howtodoinjava.jaxws;

import java.net.URISyntaxException;

import javax.jws.WebService;
 

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
//Service Endpoint Interface
@WebService
public interface HelloWorld {

	Employee deleteEmployeeById(Integer id);

	Employee updateEmployeeById(Integer id, Employee e);

	Employee addEmployee(Employee e) throws URISyntaxException;

	Employee updateEmployeeById(Integer id);

	Employees getAllEmployees();

	String getMsg(String msg);

}
