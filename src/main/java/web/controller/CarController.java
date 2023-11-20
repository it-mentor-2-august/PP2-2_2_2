package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping(value = "/auto")
public class CarController {
    private final CarService car;

    public CarController(CarService car) {
        this.car = car;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "5") int count,
                          Model model){
        List<Car> carsList = car.getCars(count);
        model.addAttribute("cars", carsList);
        return "cars";
    }
}
