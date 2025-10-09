package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl {
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList();
        carList.add(new Car("A","Red",1));
        carList.add(new Car("B","Black",12));
        carList.add(new Car("C","QQQ",13));
        carList.add(new Car("D","NEWCOLOR",14));
        carList.add(new Car("E","WWW",15));
        return carList;
    }
}
