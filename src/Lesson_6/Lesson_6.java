package Lesson_6;

import java.util.*;

/**
 * Lesson_6
 */
public class Lesson_6 {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.firstName = "Nikoglai";
        w1.lastName = "Noskov";
        w1.salary = 100;
        w1.id = 1;

        Worker w4 = new Worker();
        w4.firstName = "Nikoglai";
        w4.lastName = "Noskov";
        w4.salary = 100;
        w4.id = 1;

        Worker w2 = new Worker();
        w2.firstName = "John";
        w2.lastName = "Johnson";
        w2.salary = 300;
        w2.id = 3;

        Worker w3 = new Worker();
        w3.firstName = "Misha";
        w3.lastName = "Sergeev";
        w3.salary = 200;
        w3.id = 2;

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
    }
}
