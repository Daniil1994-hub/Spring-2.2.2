package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCarList(int count) {
        List<Car> carList;
        if (count > 5 || count < 0) {
            carList = carDao.getCarList().stream().limit(5).toList();
        } else {
            carList = carDao.getCarList().stream().limit(5).toList();
        }
        return carList;
    }

}