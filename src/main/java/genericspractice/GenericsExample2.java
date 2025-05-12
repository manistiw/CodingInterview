package genericspractice;

import java.util.Scanner;

public class GenericsExample2 {
    static class Box<T> {
        // your code here
        private T value;

        public T get(){
            return  value;
        }
        Box (T value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            // your code here
            Box<Integer> box = new Box<>(num);
            System.out.print(box.get());

        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            // your code here
            Box<Float> box = new Box<>(num);
            System.out.print(box.get());
        } else {
            String str = sc.next();
            // your code here
            Box<String> box = new Box<>(str);
            System.out.print(box.get());
        }
    }
}
