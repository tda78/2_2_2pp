package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import web.service.carService;

import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private carService service;
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, Model model){
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
