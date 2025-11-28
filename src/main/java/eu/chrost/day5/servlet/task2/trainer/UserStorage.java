package eu.chrost.day5.servlet.task2.trainer;

import eu.chrost.day5.servlet.lectures.DatabaseConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT first_name, last_name FROM users";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new User(rs.getString("first_name"), rs.getString("last_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
