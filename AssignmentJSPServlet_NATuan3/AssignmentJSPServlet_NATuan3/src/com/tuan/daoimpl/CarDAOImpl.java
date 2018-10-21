/**
 * 
 */
package com.tuan.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tuan.dao.CarDAO;
import com.tuan.model.Car;
import com.tuan.sqlserver.ConnectDB;
import com.tuan.utility.DBUtils;

/**
 * @author Tuan
 *
 */
public class CarDAOImpl implements CarDAO{
        private ConnectDB connectDB;
        private DBUtils dbUtils;
        @Override
        public List<Car> getAllListCar() {
                connectDB = new ConnectDB();
                dbUtils = new DBUtils();
                Connection conn = connectDB.getConnection();
                List<Car> listCar = new ArrayList<>();
                PreparedStatement preparedStatement = null;
                ResultSet resultSet = null;
                Car car = null;
                String sql = "select CarID,Maker,Model,ManufactureYear,Color,Note from Car";
                try {
                        preparedStatement = conn.prepareStatement(sql);
                        resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()) {
                                car = new Car();
                                car.setCarID(resultSet.getInt("CarID"));
                                car.setMaker(resultSet.getString("Maker"));
                                car.setModel(resultSet.getString("Model"));
                                car.setManufactureYear(resultSet.getString("ManufactureYear"));
                                car.setColor(resultSet.getString("Color"));
                                car.setNote(resultSet.getString("Note"));
                                
                                listCar.add(car);
                        }
                } catch (SQLException e) {
                        System.out.println("Loi khi query all car");
                } finally {
                        dbUtils.closeResultSet(resultSet);
                        dbUtils.closePreparedStatement(preparedStatement);
                        dbUtils.closeConnection(conn);
                }
                return listCar;
        }
}
