package fact.it.exerciserefuelling.controller;

import fact.it.exerciserefuelling.model.Refuelling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {

        Integer previous = Integer.parseInt(request.getParameter("previous"));
        Integer current = Integer.parseInt(request.getParameter("current"));
        Double litres = Double.parseDouble(request.getParameter("litres"));

        Refuelling refuelling = new Refuelling(previous, current, litres);
        model.addAttribute("refuelling", refuelling);



        return "refuelling";
    }

}
