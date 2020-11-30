package com.main;

import java.io.*;

public class ReadFileText {
    public void readFileTexTSum(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Total: " + sum);
        } catch (Exception e) {
            System.err.println("Fie does not exist or has an error!");
        }
    }

    public void readFileTextMul(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = " ";
            int mul = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                mul *= Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Mul " + mul);
        } catch (Exception exceptio) {
            System.err.println("File does not exist or has a error!");
        }
    }
}
