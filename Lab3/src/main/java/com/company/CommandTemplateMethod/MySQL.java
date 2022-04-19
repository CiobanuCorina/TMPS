package com.company.CommandTemplateMethod;

import java.sql.*;

public class MySQL extends AddCommand{
    private String url = "jdbc:mysql://localhost:3306/todoapp";
    private String user = "root";
    private String password;
    private Connection connection;

    @Override
    public void save() throws SQLException {
        connect();
        createTable();
        addTodo();
    }

    public void connect() {
        password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection succeeded");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS todo(title VARCHAR(20) NOT NULL, content VARCHAR(255), created_at VARCHAR(50), target_date VARCHAR(50), status VARCHAR(10))");
        preparedStatement.executeUpdate();
    }

    public void addTodo() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO todoapp.todo VALUES(?, ?, ?, ?, ?)");
        preparedStatement.setObject(1, todo.getTitle());
        preparedStatement.setObject(2, todo.getContent());
        preparedStatement.setObject(3, todo.getCreatedAt());
        preparedStatement.setObject(4, todo.getTargetDate());
        preparedStatement.setObject(5, todo.getStatus().name());
        preparedStatement.execute();
    }
}
