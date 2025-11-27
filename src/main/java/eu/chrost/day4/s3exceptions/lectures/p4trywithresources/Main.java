package eu.chrost.day4.s3exceptions.lectures.p4trywithresources;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczbę całkowitą:");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Wczytana liczba: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podana wartość nie jest liczbą całkowitą.");
        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        }
    }
}
