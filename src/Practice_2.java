import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice_2 {
    public void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input start or end");
        while (true) {
            String action = in.nextLine();
            if (action == "start") {
                WriteFile();
            } else {
                System.out.println("End");
                break;
            }
            in.close();
        }
        // ArrayList<String> words = ReadFile();
        // System.out.println(words.get(1));
        // words.set(1, "Hello");
        // System.out.println(words.get(1));
        // words.remove(1);
        // System.out.println(words);
        // WriteFile(words);
        // System.out.println(words);

    }

    public void WriteFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Note_1.txt"))) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a number");
            String data = in.nextLine();
        }
    }

    // // Создаем файл без файла
    // public void WriteFile(ArrayList<String> words) {
    // try (BufferedWriter bw = new BufferedWriter(new FileWriter("Note_1.txt"))) {
    // // "Note_1.txt", false - будет просто добавлять значения, не будет
    // // перезаписывать файл, т.е. можно обойтись без append.
    // bw.write("Hello world");
    // for (String item : words) {
    // bw.append("\n");
    // bw.append(item);
    // }
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }
    // }

    // // Читаем файл
    // public ArrayList<String> ReadFile() {
    // ArrayList<String> words = new ArrayList<String>();
    // try (BufferedReader br = new BufferedReader(new FileReader("Note_1.txt"))) {
    // // // Посимвольно
    // // int c;
    // // while ((c = br.read()) != -1) {
    // // System.out.print((char) c);
    // // }
    // // Построчно
    // String c;
    // while ((c = br.readLine()) != null) {
    // // System.out.println(c);
    // words.add(c);
    // }
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }
    // return words;
    // }
}

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Objects;
// import java.util.Scanner;

// public class program2 {

// public static void WriteFile(String action){
// try(BufferedWriter bw = new BufferedWriter(new
// FileWriter("Client.txt",false))){
// bw.write(action);

// }
// catch(IOException ex){
// System.out.println("Error");
// }
// }

// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.println("Введите start если хотите что то записать");
// boolean flag = false;
// while (true){
// String action = in.nextLine();
// if (Objects.equals(action, "start") || flag){
// flag = true;
// WriteFile(action);
// continue;
// }
// }
// }
// }