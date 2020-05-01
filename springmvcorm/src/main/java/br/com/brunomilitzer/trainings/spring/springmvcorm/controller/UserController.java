package br.com.brunomilitzer.trainings.spring.springmvcorm.controller;

import br.com.brunomilitzer.trainings.spring.springmvcorm.model.User;
import br.com.brunomilitzer.trainings.spring.springmvcorm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private UserService service;

    public UserService getService( ) {
        return service;
    }

    @Autowired
    public void setService( UserService service ) {
        this.service = service;
    }

    @RequestMapping( "registrationPage" )
    public String showRegistrationPage( ) {
        return "userReg";
    }

    @RequestMapping( value = "/registerUser", method = RequestMethod.POST )
    public String registerUser( @ModelAttribute( "user" ) User user, ModelMap model ) {
        int result = service.save( user );

        model.addAttribute( "result", "User Created With ID: " + result );

        return "userReg";
    }

    @RequestMapping("validateEmail")
    public @ResponseBody String validateEmail( @RequestParam("id") int id ) {
        User user = service.getUser( id );
        String msg = "";

        if (user != null) {
            msg = id + " already exists";
        }

        return msg;
    }

    @RequestMapping( "getUsers" )
    public String loadUsers(ModelMap model ) {
        List<User> users = service.getUsers();

        model.addAttribute( "users", users );

        return "displayUsers";
    }
}
