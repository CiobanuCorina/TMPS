package com.company.CommandTemplateMethod;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class TestTemplateMethod {
    public static void main(String[] args) throws SQLException, ParseException, IOException {
        Command command = new MySQL();
        command.execute();
        command = new FileSystem();
        command.execute();
    }
}
