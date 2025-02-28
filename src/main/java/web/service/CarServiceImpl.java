package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.DAO.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarServ {

    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

}
