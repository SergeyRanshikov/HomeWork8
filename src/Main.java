import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] weight = new int [3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
        }

        double [] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {

        }
        int [] fruits = {10, 9, 8, 7, 6, 11, 12, 13, 14, 15};
        for (int i = 0; i < fruits.length; i++) {

        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] weight = new int [3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            if(i<weight.length - 1) {
                System.out.print(weight[i] +",");
            } else {
                System.out.println(weight[i]);
            }
        }

        double [] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }

        }
        int [] fruits = {10, 9, 8, 7, 6, 11, 12, 13, 14, 15};
        for (int i = 0; i < fruits.length; i++) {
            if ( i < fruits.length -1) {
                System.out.print(fruits[i] + ", ");
            } else {
                System.out.print(fruits[i]);
            }
        }
            System.out.println(" ");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] weight = new int [3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            if(i<weight.length - 1) {
                System.out.print(weight[i] +",");
            } else {
                System.out.println(weight[i]);
            }
        }
        System.out.println("В обратном порядке");
        for (int i = weight.length - 1; i >= 0 ; i--) {
            if(i > 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }
        System.out.println(" ");


        double [] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("В обратном порядке");
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            if(i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }

        }
        System.out.println(" ");

        int [] fruits = {10, 9, 8, 7, 6, 11, 12, 13, 14, 15};
        for (int i = 0; i < fruits.length; i++) {
            if ( i < fruits.length -1) {
                System.out.print(fruits[i] + ", ");
            } else {
                System.out.println(fruits[i]);
            }
        }
        System.out.println("В обратном порядке");
        for (int i = fruits.length - 1; i >= 0 ; i--) {
            if(i > 0) {
                System.out.print(fruits[i] + ", ");
            } else {
                System.out.print(fruits[i]);
            }

        }
        System.out.println(" ");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] a = {1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = a[i] + 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}