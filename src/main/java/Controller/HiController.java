package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hi")
public class HiController {
    @RequestMapping(method = RequestMethod.GET) String printHi(ModelMap model)
    {
        model.addAttribute("title1", "Hi Title");
        model.addAttribute("message1", "Hi Spring MVC Framework!");
        return "hi";
    }


}
