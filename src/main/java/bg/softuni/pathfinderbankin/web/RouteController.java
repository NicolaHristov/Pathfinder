package bg.softuni.pathfinderbankin.web;

import bg.softuni.pathfinderbankin.model.dto.RouteShortInfoDto;
import bg.softuni.pathfinderbankin.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RouteController {


    private RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/routes")
    public String routes(Model model){

//        RouteShortInfoDto randomRoute = routeService.getRandomRoute();
        List<RouteShortInfoDto> routes = routeService.getAll();
        model.addAttribute("allRoutes",routes);

        return "routes";
    }
}
