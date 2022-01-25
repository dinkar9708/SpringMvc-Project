package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Welcome(){
        System.out.println("Welcome to My Spring MVC project");
        return "Welcome";
    }
    @RequestMapping("/home")
    public String home(Model model){

        System.out.println("This is Home Page");
        model.addAttribute("name","Dinkar Kumar");
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("This is about page");
        return "about";
    }
}
