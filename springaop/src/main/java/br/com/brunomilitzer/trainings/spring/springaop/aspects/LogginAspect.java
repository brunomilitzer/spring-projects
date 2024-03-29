package br.com.brunomilitzer.trainings.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

    @Before( "execution(* br.com.brunomilitzer.trainings.spring.springaop.service.ProductServiceImpl.multiply(..))" )
    public void logBefore( JoinPoint joinPoint ) {
        System.out.println("Before calling the method");
    }

    @After( "execution(* br.com.brunomilitzer.trainings.spring.springaop.service.ProductServiceImpl.multiply(..))" )
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After the method execution");
    }
}
