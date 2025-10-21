package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl {

    private List<Car> carList = List.of(new Car("A","Red",1),
            new Car("B","Black",12),
            new Car("C","QQQ",13),
            new Car("D","NEWCOLOR",14),
            new Car("E","WWW",15));

    public List<Car> getCarList() {
        return carList;
    }
}