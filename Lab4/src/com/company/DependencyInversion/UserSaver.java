package com.company.DependencyInversion;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class UserSaver {
    protected User user = new User();
    public abstract void save() throws IOException, SQLException;

    public void getUserInputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        user.setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        user.setLastName(scanner.nextLine());
        System.out.println("Enter age:");
        user.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter phone number:");
        user.setPhone(scanner.nextLine());
    }
}
