package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        float result = 0;

        System.out.println("Podaj rozmiar tablicy:");
        arrayLength = scanner.nextInt();

        float[] array = new float[arrayLength];
        System.out.printf("Wprowadz %d liczb:\n", arrayLength);

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextFloat();
        }

        for (float i : array) {
            result = result + (i * i);
        }
        System.out.printf("Suma kwadratów wprowadzonych liczb to %.0f", result);
    }
}
