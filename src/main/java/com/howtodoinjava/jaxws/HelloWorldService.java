package com.howtodoinjava.jaxws;
  
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
 

import com.howtodoinjava.soap.Employee;
import com.howtodoinjava.soap.Employees;
  
 
@WebService(endpointInterface = "com.howtodoinjava.jaxws.HelloWorld")
public class HelloWorldService implements HelloWorld{
	 
	@Override
    public String getMsg(String msg)
    {
        String output = "Message requested : " + msg;
        //Simply return the parameter passed as message
        return output;
    }
    
}