package com.company.DependencyInversion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLSaver extends UserSaver{
    private String url = "jdbc:mysql://localhost:3306/user_table";
    private String dbUser = "root";
    private String dbPassword;
    private Connection connection;

    public void connect() {
        dbPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println("Connection succeeded");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS `user`(first_name VARCHAR(25) NOT NULL, last_name VARCHAR(25) NOT NULL, age INT, phone VARCHAR(10))");
        preparedStatement.executeUpdate();
    }

    public void addUser() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user_table.user VALUES(?, ?, ?, ?)");
        preparedStatement.setObject(1, user.getFirstName());
        preparedStatement.setObject(2, user.getLastName());
        preparedStatement.setObject(3, user.getAge());
        preparedStatement.setObject(4, user.getPhone());
        preparedStatement.execute();
    }

    @Override
    public void save() throws SQLException {
        getUserInputData();
        this.connect();
        this.createTable();
        this.addUser();
    }
}
