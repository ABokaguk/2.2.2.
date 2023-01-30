package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        Car car1 = new Car(1, "Lada", 2010);
        Car car2 = new Car(2, "Polo", 2015);
        Car car3 = new Car(3, "Mercedes", 2000);
        Car car4 = new Car(4, "BMW", 2020);
        Car car5 = new Car(5, "Audi", 2018);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int amount) {
        if (amount >= 5 || amount <= 0) {
            return cars;
        } else {
            return cars.stream().limit(amount).toList();
        }
    }
}