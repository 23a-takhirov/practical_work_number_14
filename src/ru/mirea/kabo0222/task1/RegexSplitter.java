package ru.mirea.kabo0222.task1;
import java.util.Arrays;

public class RegexSplitter {
    public static void main(String[] args) {
        String inputString = "Привет, как у вас дела?";
        String regex = "[ ,]+";
        String[] elements = inputString.split(regex);
        System.out.println("Разделенные элементы:");
        Arrays.stream(elements).forEach(System.out::println);
    }
}