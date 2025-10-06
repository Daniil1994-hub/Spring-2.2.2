package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public List<Car> carList(int count) {
        List<Car> carList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            carList.add(Car.carList.get(i));
        }
        return carList;
        }

    }

