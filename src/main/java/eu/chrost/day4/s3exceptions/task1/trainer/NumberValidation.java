package eu.chrost.day4.s3exceptions.task1.trainer;

import java.util.Scanner;

class NumberValidation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj liczbe calkowita: ");
            String input = scanner.nextLine();
            int liczba = Integer.parseInt(input);
            System.out.println("Wprowadzona liczba to: " + liczba);
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest liczbą!");
        } finally {
            System.out.println("Dziękujemy za skorzystanie z programu!");
        }
    }
}
