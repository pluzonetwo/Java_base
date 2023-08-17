import java.util.*;

public class Practice_6 {
    public void main() {
        // Map<String, String> states = new HashMap<String, String>();
        // states.put("Rus", "Moscow");
        // states.put("Ger", "Berlin");
        // states.put("Eng", "London");
        // System.out.println(states.get("Rus"));
        // Получить весь набор ключей
        // Set<String> keys = states.keySet();
        // System.out.println(keys);
        // // Получить весь набор значений
        // Collection<String> values = states.values();
        // System.out.println(values);

        // Map<Integer, LinkedList<String>> bookshelf = new HashMap<Integer,
        // LinkedList<String>>();
        // LinkedList<String> books_one = new LinkedList<String>();
        // books_one.add("A");
        // books_one.add("B");
        // books_one.add("C");
        // LinkedList<String> books_two = new LinkedList<String>();
        // books_two.add("D");
        // books_two.add("E");
        // books_two.add("F");
        // bookshelf.put(1, books_one);
        // bookshelf.put(2, books_two);
        // System.out.println(bookshelf.get(2));
        // // Можно указать какой элемент по индексу я хочу получить
        // System.out.println(bookshelf.get(2).get(2));

        // Map<Integer, LinkedList<Book>> bookshelf = new HashMap<Integer,
        // LinkedList<Book>>();
        // LinkedList<Book> books_one = new LinkedList<Book>();
        // books_one.add(new Book("A", "Ivanov", 20));
        // books_one.add(new Book("B", "Ivanov", 50));
        // books_one.add(new Book("C", "Petrov", 100));
        // LinkedList<Book> books_two = new LinkedList<Book>();
        // books_two.add(new Book("D", "Sidorov", 20));
        // books_two.add(new Book("E", "Johnson", 50));
        // books_two.add(new Book("F", "Sidorov", 100));
        // bookshelf.put(1, books_one);
        // bookshelf.put(2, books_two);
        // вывод элементов
        // for (Map.Entry<Integer, LinkedList<Book>> item : bookshelf.entrySet()) {
        // for (Book bookFor : item.getValue()) {
        // System.out.printf("Shelf: %s, Book: %s; ", item.getKey(), bookFor.Name);
        // }
        // }
        // LinkedList<Book> shelf_one = bookshelf.get(1);
        // for (var item : shelf_one) {
        // System.out.println(item);
        // }
        // LinkedList<Book> shelf_two = bookshelf.get(2);
        // for (var item : shelf_two) {
        // System.out.println(item);
        // }
        // Практика
        Map<Teacher, LinkedList<Student>> university = new HashMap<Teacher, LinkedList<Student>>();
        // LinkedList<Teacher> teachers = new LinkedList<Teacher>();
        // teachers.add(new Teacher("Maria", "Petrova", 40));
        // teachers.add(new Teacher("Svetlana", "Denisova", 55));
        LinkedList<Student> students = new LinkedList<Student>();
        // students.add(new Student("Ivan", 1));
        // students.add(new Student("Ivan", 2));
        // students.add(new Student("Petr", 1));
        // students.add(new Student("Sergey", 1));
        students.add(AddStudent());
        university.put(new Teacher("Maria", "Petrova", 55), students);
        for (Map.Entry<Teacher, LinkedList<Student>> item : university.entrySet()) {
            for (Student studentFor : item.getValue()) {
                System.out.printf("Teacher: %s, Student: %s from group %s ", item.getKey().Name, studentFor.Name,
                        studentFor.Group);
            }
        }
    }

    public static Student AddStudent() {
        var x = new Practice_6();
        Scanner name = new Scanner(System.in);
        System.out.print("Input student name: ");
        String nameStudent = name.nextLine();
        Scanner gr = new Scanner(System.in);
        System.out.print("Input group number: ");
        Integer group = gr.nextInt();
        Student temp = x.new Student(nameStudent, group);
        name.close();
        gr.close();
        return temp;
    }

    class Teacher {
        String Name;
        String Surname;
        Integer Age;

        Teacher(String name, String surname, Integer age) {
            Name = name;
            Surname = surname;
            Age = age;
        }
    }

    class Student {
        String Name;
        Integer Group;

        Student(String name, Integer group) {
            Name = name;
            Group = group;
        }
    }

    // class Book {
    // String Name;
    // String Author;
    // Integer Size_book;

    // Book(String name, String author, Integer size) {
    // Name = name;
    // Author = author;
    // Size_book = size;
    // }
    // }
}