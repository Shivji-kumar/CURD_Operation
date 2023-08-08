package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "AOP Transaction Project" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/aop/config.xml");
        
        PaymentService po=context.getBean("payment", PaymentService.class);
        //Authentication print:PaymentStarted
        
        po.makePayment(5000);
    }
}
