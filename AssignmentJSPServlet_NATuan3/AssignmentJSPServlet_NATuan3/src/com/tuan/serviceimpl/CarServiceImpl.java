/**
 * 
 */
package com.tuan.serviceimpl;

import java.util.List;

import com.tuan.dao.CarDAO;
import com.tuan.daoimpl.CarDAOImpl;
import com.tuan.model.Car;
import com.tuan.service.CarService;

/**
 * @author Tuan
 *
 */
public class CarServiceImpl implements CarService{
        private CarDAO carDAO;
        @Override
        public List<Car> getAllListCar() {
                carDAO = new CarDAOImpl();
                return carDAO.getAllListCar();
        }
        
}
