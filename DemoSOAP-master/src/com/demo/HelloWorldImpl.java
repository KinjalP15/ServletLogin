package com.demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
    @Override  
    public String getHelloWorldAsString(String name) {  
        return "Hello World JAX-WS " + name;  
    }  
}
