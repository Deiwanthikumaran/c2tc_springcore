package com.tnsif.springcore;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext();
    	Airtel airtel=(Airtel) context.getBean("air");
    	airtel.call();
    	airtel.data();
    }
}
