package com.company.DependencyInversion;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
    UserSaver userSaver;

    public Client(UserSaver userSaver) {
        this.userSaver = userSaver;
    }

    public void executeSomeCode() throws SQLException, IOException {
        this.userSaver.save();
    }
}
