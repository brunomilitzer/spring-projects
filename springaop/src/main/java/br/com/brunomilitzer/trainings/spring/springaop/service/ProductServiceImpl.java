package br.com.brunomilitzer.trainings.spring.springaop.service;

public class ProductServiceImpl implements ProductService {

    @Override
    public int multiply( int num1, int num2 ) {
        System.out.println("Inside the multiply() method");
        return num1 * num2;
    }
}
