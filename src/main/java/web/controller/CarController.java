package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServ;

import java.util.List;

@Controller
public class CarController {
    private CarServ carServ;

    CarController(CarServ carServ) {
        this.carServ = carServ;
    }

    @RequestMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> list = carServ.getCars(count);

        model.addAttribute("cars", list);
        return "cars";
    }


}
