package eu.chrost.day5.servlet.lectures;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarStorage {
//    private static final List<Car> CARS = List.of(
//        new Car("Toyota", "Corolla", 2020),
//        new Car("Honda", "Civic", 2019),
//        new Car("Ford", "Mustang", 2021),
//        new Car("Chevrolet", "Camaro", 2018)
//    );

    public static List<Car> getAllCars() {
        //return CARS;

        List<Car> list = new ArrayList<>();

        String sql = "SELECT brand, model, year FROM cars";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                //list.add(new Car(rs.getString(1), rs.getString(2), rs.getInt(3)));
                list.add(mapResultSetToCar(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @SneakyThrows
    private static Car mapResultSetToCar(ResultSet rs) {
        //return new Car(rs.getString(1), rs.getString(2), rs.getInt(3));
        return new Car(rs.getString("brand"), rs.getString("model"), rs.getInt("year"));
    }
}
