package pl.coderslab.imageviewer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.imageviewer.model.User;
import pl.coderslab.imageviewer.service.IUserService;
import pl.coderslab.imageviewer.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private IUserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findUsers(Model model){
        var users = (List<User>)userService.findAll();

        model.addAttribute("users", users);

        return "Users";
    }
}