package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        InputStream inputStream = System.in;
        int prev = inputStream.read();
        int current = inputStream.read();
        while (prev != -1) {
            if ((prev != 13 || current != 10)) {
                System.out.write(prev);
            }
            prev = current;
            current = inputStream.read();
        }
        System.out.flush();
    }
}
