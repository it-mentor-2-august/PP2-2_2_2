package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> carList = new ArrayList<>();


    public CarService() {
        this.carList.add(new Car("Toyota", "Camry", 2010));
        this.carList.add(new Car("Honda", "Civic", 2011));
        this.carList.add(new Car("Ford", "Mondeo", 2018));
        this.carList.add(new Car("Chevrolet", "Taho", 2009));
        this.carList.add(new Car("BMW", "X1", 2015));
    }


    public List<Car> getCars(int count) {
        if (count >= carList.size()){
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
