package com.company.CommandTemplateMethod;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public abstract class Command {
    protected List<Todo> todos = new ArrayList<>();

    public abstract void execute() throws ParseException, IOException, SQLException;
}
