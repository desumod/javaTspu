package lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Zadanie {

    public static void main(String[] args){
        System.out.println("Введите номер задания:");
        Scanner waitFor = new Scanner(System.in);
        int taskNumber = waitFor.nextInt();
        switch (taskNumber) {
            case 1 -> Zamena();
            case 2 -> Sortirovka();
            case 3 -> Srednee();
            case 4 -> Summa();
            case 5 -> Randmatrix();
            case 6 -> Zamena2();
            case 7 -> Stroki();
        }
    }
    public static void Zamena() {

        int[] A = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("Изначальный массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;
        System.out.println();
        System.out.println("Измененный массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
    public static void Sortirovka() {
        int[] B = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("Изначальный массив:");
        for (int num : B) {
            System.out.print(num + " ");
        }
        Arrays.sort(B);
        System.out.println();
        System.out.println("Упорядоченный массив:");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
    public static void Srednee() {
        int[] C = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("Изначальный массив:");
        for (int num : C) {
            System.out.print(num + " ");
        }
        int sum = 0;
        for (int num : C) {
            sum += num;
        }
        double average = (double) sum / C.length;
        System.out.println();
        System.out.println("Среднее значение: " + average);
    }
    public static void Summa() {
        int[] D = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("Изначальный массив:");
        for (int num : D) {
            System.out.print(num + " ");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int num : D) {
            if(num % 2 == 0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        System.out.println();
        System.out.println("Сумма четных: " + sum1);
        System.out.println("Сумма нечетных: " + sum2);
    }
    public static void Randmatrix() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int num = random.nextInt(10);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void Zamena2() {
        int[] A = {5, 10, 2, 8, 3, 15, 1, 7, 9, 6, 12, 4, 11, 25, 18, 20, 16, 22, 19, 14, 23, 21, 24, 17, 13};
        System.out.println("Изначальный массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;
        System.out.println();
        System.out.println("Измененный массив:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Наибольшее число:" + maxX(A));
    }
    public static int maxX(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void Stroki() {
        String s1 = "ILove";
        String s2 = "Programming";
        String s3 = "Farukh";
        String s4 = "LetMeOut";
        String s5 = "LetMeOut";
        String result;
        if (s4.equals(s5)) {
            result = s1 + s2;
        } else {
            result = s1 + s3;
        }
        System.out.println("Результат: " + result);
    }
}

