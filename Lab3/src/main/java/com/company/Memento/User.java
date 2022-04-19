package com.company.Memento;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;

    public User(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    public Memento createMemento() {
        return new Memento( this.phone);
    }

    public void restore(Memento memento) {
        this.phone = memento.getPhone();
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
