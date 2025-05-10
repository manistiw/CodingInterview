package ArraysPractice;

import java.util.Scanner;

public class WrapperExample {
    public static void main(String[] args) {
        String[] words = {"hello", "world"};
        Scanner scanner = new Scanner(System.in);
        System.out.println(words[scanner.nextInt()]);
    }
}
