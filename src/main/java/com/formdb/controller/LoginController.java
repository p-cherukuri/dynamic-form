package com.formdb.controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.formdb.model.User;
import com.formdb.service.UserService;
import com.formdb.model.Form;
import com.formdb.service.FormService;

/**
 * Created by Phani on 2/22/17.
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private FormService formService;

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the e-mail address provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has successfully registered!");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @RequestMapping(value="/admin/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getFirstName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage","This is an admin database form");
        Form form = new Form();
        modelAndView.addObject("form", form);
        modelAndView.setViewName("/admin/home");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/home", method = RequestMethod.POST)
    public ModelAndView submitNewForm(Form form) {
        ModelAndView modelAndView = new ModelAndView();
        Random rand = new Random();
        int newRandomNum = rand.nextInt(9999);
        Form formExists = formService.findFormBySubmissionNum(newRandomNum);
        while(formExists != null) {
            newRandomNum = rand.nextInt(9999);
            formExists = formService.findFormBySubmissionNum(newRandomNum);
        }
        formService.saveForm(form, newRandomNum);
        modelAndView.addObject("submissionMessage","Form submission success! Please note your submission ID: " + newRandomNum);
        modelAndView.addObject("form", new Form());
        modelAndView.setViewName("/admin/home");
        return modelAndView;
    }


}
