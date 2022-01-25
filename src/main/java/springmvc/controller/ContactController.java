package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.Service.UserService;
import springmvc.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ContactController {
    @Autowired
    private UserService userService;
    @ModelAttribute
    public void CommonData(Model m){
        m.addAttribute("Header","Learn Spring With Dinkar");
    }
    @RequestMapping("/contact")
    public String  showform(){
        return "contact";
    }

    @RequestMapping(path = "/Success",method = RequestMethod.POST)
    public String Handle(@ModelAttribute User user,Model model){

        System.out.println(user);
        this.userService.createUser(user);
        List<User> users = this.userService.display();
        model.addAttribute("userdetails",users);
        /*System.out.println("user email :"+email);
        System.out.println("usernme is :"+Username);
        System.out.println("Password is :"+Password);*/
        //model.addAttribute("user",user);

        return "Success";
    }
}
