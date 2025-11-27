package eu.chrost.day4.s3exceptions.lectures.p3finally;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tworzenie scannera");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj liczbę całkowitą:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Wczytana liczba: " + number);
//        } catch (NumberFormatException e) {
//            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
//        } catch (Exception e) {
//            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            System.out.println("Zamykanie scannera");
            scanner.close();
        }

    }
}
