package bg.softuni.pathfinderbankin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HomeController {


//    @GetMapping("/")
//    public ModelAndView index(){
//        double sofiaTemp= new Random().nextDouble();
//        ModelAndView mvn = new ModelAndView();
//
//        mvn.setViewName("index");
//        mvn.addObject("sofiaTemperature",sofiaTemp);
//
//        return mvn;
//    }

    /**
     *
     * @param model
     * @return Second commit
     */

    @GetMapping("/")
    public String index(Model model){
        double sofiaTemp= new Random().nextDouble();

        model.addAttribute("sofiaTemperature",sofiaTemp);

        return "index";
    }


}
