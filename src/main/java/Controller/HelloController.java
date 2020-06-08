package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET) String printHello(ModelMap model)
    {
        model.addAttribute("title2","Hello Title");
        model.addAttribute("message2","Hello Spring MVC framework!");
        return "hello";
    }

}
