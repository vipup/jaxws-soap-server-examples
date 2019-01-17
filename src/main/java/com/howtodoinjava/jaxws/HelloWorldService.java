package com.howtodoinjava.jaxws;
   
import javax.jws.WebService;
 
 
  
 
@WebService(endpointInterface = "com.howtodoinjava.jaxws.HelloWorld")
public class HelloWorldService implements HelloWorld{
	 
	@Override
    public String getMsg(String msg)
    {
		return   "Message requested : " + msg; 
        
    }
    
}