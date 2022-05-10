package com.company.DependencyInversion;

import java.io.IOException;
import java.sql.SQLException;

public class TestDependencyInversion {
    public static void main(String[] args) throws SQLException, IOException {
        Client client1 = new Client(new FileSystemSaver());
        client1.executeSomeCode();
        Client client2 = new Client(new MySQLSaver());
        client2.executeSomeCode();
    }
}
