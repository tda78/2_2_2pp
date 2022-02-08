package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

//@Service
public class CarServiceImpl implements carService{

    private ArrayList<Car>cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("yellow", "Audi X5", "111-111"));
        cars.add(new Car("white", "honda CRW", "c014ta - 70"));
        cars.add(new Car("black", "BMV X4", "007"));
        cars.add(new Car("red", "toyote rav4", "moya-toyota"));
        cars.add(new Car("grey", "lada largus", "34-64 TOM"));
    }

    @Override
    public List<Car> getCars(int count) {
        List result = new ArrayList<>();
        if (count>5) count=5;
        for(int i=0;i<count; i++){
            result.add(cars.get(i));
        }
        return result;
    }
}
