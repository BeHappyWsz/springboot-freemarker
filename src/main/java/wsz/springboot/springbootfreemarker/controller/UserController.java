package wsz.springboot.springbootfreemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wsz.springboot.springbootfreemarker.service.UserService;

/**
 * Created by wsz
 * date 2018/4/12
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String findById(@PathVariable(value = "id")long id, Model model){
        model.addAttribute("user",userService.findById(id));
        return "user";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(Model model){
        model.addAttribute("userList",userService.getAllUser());
        return "all";
    }
}
