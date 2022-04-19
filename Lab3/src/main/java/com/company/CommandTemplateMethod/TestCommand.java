package com.company.CommandTemplateMethod;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class TestCommand {
    public static void main(String[] args) throws ParseException, IOException, SQLException {
        Command command = new FileSystem();
        command.execute();
        command = new ListFileSystemCommand();
        command.execute();
        command = new DeleteFileSystemCommand();
        command.execute();
        command = new UpdateFileSystemCommand();
        command.execute();
        command = new ListFileSystemCommand();
        command.execute();
    }
}
