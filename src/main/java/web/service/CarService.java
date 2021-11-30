package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public CarService() {
    }

    public List<Car> carsList(long count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Red", "hybrid", 4));
        cars.add(new Car("White", "combustion", 6));
        cars.add(new Car("Green", "hybrid", 4));
        cars.add(new Car("Black", "combustion", 4));
        cars.add(new Car("Blue", "electric", 3));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
