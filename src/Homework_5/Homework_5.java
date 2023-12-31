package Homework_5;

import java.util.*;

public class Homework_5 {
    public static void main(String[] args) {
        Map<LinkedList<User>, LinkedList<Number>> phone_book = new HashMap<LinkedList<User>, LinkedList<Number>>();
        LinkedList<User> us = new LinkedList<User>();
        us.add(AddUsers());
        LinkedList<Number> num = new LinkedList<Number>();
        num.add(AddNumbers());
        phone_book.put(us, num);
        for (Map.Entry<LinkedList<User>, LinkedList<Number>> item : phone_book.entrySet()) {
            for (User userFor : item.getKey()) {
                for (Number numberFor : item.getValue()) {
                    System.out.printf("User: %s, Number: %s ", userFor.Name, numberFor.Number);
                }
            }
        }
    }

    public static User AddUsers() {
        var x = new Homework_5();
        Scanner name = new Scanner(System.in);
        System.out.print("Input user name: ");
        String nameUser = name.nextLine();
        User temp = x.new User(nameUser);
        return temp;
    }

    public static Number AddNumbers() {
        var c = new Homework_5();
        Scanner num = new Scanner(System.in);
        System.out.print("Input user number: ");
        String userNum = num.nextLine();
        Number temp = c.new Number(userNum);
        num.close();
        return temp;
    }

    class Number {
        String Number;

        Number(String number) {
            Number = number;
        }
    }

    class User {
        String Name;

        User(String name) {
            Name = name;
        }
    }
}
