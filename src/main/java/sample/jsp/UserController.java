package sample.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by anthonycallaert on 05/03/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String showUserList(){
        return "user/list";
    }
}
