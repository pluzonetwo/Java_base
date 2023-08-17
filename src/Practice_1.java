import java.util.Scanner;

public class Practice_1 {
    public void main() {
        // Ввод данных
        // Scanner in = new Scanner(System.in);
        // System.out.print("Input data: ");
        // String line = in.nextLine();
        // System.out.println(line);
        // in.close();
        // String str = "1";
        // Integer x = Integer.parseInt(str);
        // String n = x.toString();
        // System.out.println(n);
        // System.out.println("Hello, World!");
        // Integer a = 10;
        // String word = "hi";
        // Boolean flag = true;
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }
        // при таком варианте не сможем работать с каждым элементом массива
        // по-отдельности, применяется для просмотра данных.
        // Integer[] arr = { 1, 2, 3, 4, 5 };
        // for (Integer item : arr) {
        // System.out.println(item);
        // }
        // Integer[] arr = { 1, 2, 3, 4, 5 };
        // for (Integer item : arr) {
        // if (item % 2 == 0) {
        // System.out.println(item);
        // } else {
        // System.out.println("Не четное");
        // }
        // }
        // Проверка на тип
        // if (name instanceof String) {
        // System.out.println(name);
        // }
        // + getType()

        // Игра Угадай число
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = 5;
        int countNum = 3;
        for (int i = 1; i <= countNum; i++) {
            if (countNum == 0) {
                System.out.println("Вы не угадали число");
            }
            Integer number = in.nextInt();
            System.out.print("Введите число: ");
            if (number == num) {
                System.out.println("Вы угадали число, у вас осталось " + (countNum - i) + " попыток");
                break;
            } else {
                System.out.print("У вас осталось " + (countNum - i) + " попыток");
            }
        }
        in.close();
    }
}