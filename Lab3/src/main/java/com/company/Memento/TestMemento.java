package com.company.Memento;

public class TestMemento {
    public static void main(String[] args) {
        User user = new User("Ababii", "Dragos", 25, "065834517");
        History history = new History();
        System.out.println(user);
        history.add(user.createMemento());
        user.setPhone("074237812");
        System.out.println(user);
        user.restore(history.get(0));
        System.out.println(user);
    }
}
