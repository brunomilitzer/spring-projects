package br.com.brunomilitzer.trainings.spring.springjdbc.springcore.constructorinjection.ambiguity;

public class Addition {

    public Addition(int a, double b) {

        System.out.println("Inside constructor INTEGER AND DOUBLE");
        System.out.println(a);
        System.out.println(b);
    }

  /*  public Addition(double a, double b) {

        System.out.println("Inside constructor DOUBLE");
    }*/

    /*public Addition(int a, int b) {

        System.out.println("Inside constructor INT");
    }

    public Addition(String a, String b) {

        System.out.println("Inside constructor STRING");
    }*/
}
