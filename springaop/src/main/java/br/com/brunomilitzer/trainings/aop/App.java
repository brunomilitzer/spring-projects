package br.com.brunomilitzer.trainings.aop;

import br.com.brunomilitzer.trainings.aop.basic.BasicCalculator;
import br.com.brunomilitzer.trainings.aop.basic.CalculatorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main Class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext( CalculatorConfiguration.class );
        context.getBean( "arithmeticCalculator", BasicCalculator.class ).multiply( 2, 5 );
        //context.getBean( "arithmeticCalculator", BasicCalculator.class ).addition( 2, 5 );
        //context.getBean( "arithmeticCalculator", BasicCalculator.class ).division( 2, 0 );
    }
}
