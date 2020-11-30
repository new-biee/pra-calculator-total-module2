package com.main;

import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Enter link file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileText readFile = new ReadFileText();
        readFile.readFileTexTSum(path);
        readFile.readFileTextMul(path);
    }
}
