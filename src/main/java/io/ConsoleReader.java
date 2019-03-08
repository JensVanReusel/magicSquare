package io;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scanner = new Scanner(System.in);

    public String read() {
        return this.scanner.next();
    }

    public String readLine() {
        return this.scanner.nextLine();
    }
}
