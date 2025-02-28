package web.model.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        cars.add(new Car("Mersedes", "GL", 2020));
        cars.add(new Car("Audi", "A6", 2000));
        cars.add(new Car("Porshe", "911", 1995));
        cars.add(new Car("Kia", "Soul", 2005));
        cars.add(new Car("Renault", "Logan", 1995));

    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> editedListCars = cars;
        if (count < 5) {
            editedListCars = cars.subList(0, count);
        }
        return editedListCars;
    }
}

