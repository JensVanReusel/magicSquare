package io;

public class ConsoleWriter implements Writer {

    public void write(String s) {
        System.out.print(s);
    }

    public void writeLine(String s) {
        System.out.println(s);
    }
}
