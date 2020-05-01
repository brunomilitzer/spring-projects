package br.com.brunomilitzer.trainings.spring.springmvc.controller;

import br.com.brunomilitzer.trainings.spring.springmvc.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {

    @RequestMapping("/readObject")
    public ModelAndView sendObject() {

        Employee employee = new Employee();
        employee.setId( 555 );
        employee.setName( "Vanessa de Garcez" );
        employee.setSalary( 2500D );

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "displayObject" );
        modelAndView.addObject( "employee", employee );

        return modelAndView;
    }
}
