package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count, Model model){
        List<Car> cars = new CarServiceImpl().getCars(count);
        model.addAttribute("cars", cars);
  /*      for (Car car:cars){
            System.out.println(car.getColor()+" "+car.getModel()+" "+car.getNumber());
        }
   */     return "cars";
    }

}
