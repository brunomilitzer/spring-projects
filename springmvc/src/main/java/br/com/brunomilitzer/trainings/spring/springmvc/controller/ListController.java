package br.com.brunomilitzer.trainings.spring.springmvc.controller;

import br.com.brunomilitzer.trainings.spring.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ListController {

    @RequestMapping("/readList")
    public ModelAndView sendList() {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setId( 555 );
        e1.setName( "Vanessa de Garcez" );
        e1.setSalary( 2500D );

        Employee e2 = new Employee();
        e2.setId( 111 );
        e2.setName( "Tales de Garcez" );
        e2.setSalary( 200D );

        Employee e3 = new Employee();
        e3.setId( 777 );
        e3.setName( "Bruno Militzer" );
        e3.setSalary( 6300D );

        employees.add( e1 );
        employees.add( e2 );
        employees.add( e3 );

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "displayList" );
        modelAndView.addObject( "employees", employees );

        return modelAndView;
    }
}
