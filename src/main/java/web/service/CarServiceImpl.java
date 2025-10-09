package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> carList(int count) {
        List<Car> carList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            carList.add(carDao.getCarList().get(i));
        }
        return carList;
    }

}