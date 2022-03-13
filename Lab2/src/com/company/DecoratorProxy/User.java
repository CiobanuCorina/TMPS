package com.company.DecoratorProxy;

import java.util.*;
import java.util.stream.Collectors;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String[] role;

    public User(String firstName, String lastName, int age, String phone, String[] role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        if(!Collections.disjoint(List.of(role), List.of(Arrays.stream(UserRoles.values()).map(Enum::name)
                .collect(Collectors.toList()).toArray())))
            this.role = role;
    }

    public boolean isAdmin() {
        return Arrays.stream(role).anyMatch(elem -> Objects.equals(elem, UserRoles.ADMIN.toString()));
    }
}
