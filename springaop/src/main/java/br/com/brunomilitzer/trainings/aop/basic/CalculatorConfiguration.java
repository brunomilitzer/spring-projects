package br.com.brunomilitzer.trainings.aop.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("br.com.brunomilitzer.trainings.aop.basic")
@EnableAspectJAutoProxy
public class CalculatorConfiguration {
}
