package com.mycompany.minprocatering;

import java.util.Scanner;

public class InputValidator {
    private Scanner scanner = new Scanner(System.in);

    public int inputInt(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-> Input harus berupa angka bulat!");
            }
        }
    }

    public double inputDouble(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("-> Input harus berupa angka!");
            }
        }
    }

    public String inputString(String pesan) {
        System.out.print(pesan);
        return scanner.nextLine();
    }
}
