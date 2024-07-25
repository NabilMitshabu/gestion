package com.example.demo;

import javafx.scene.control.TextArea;

import java.io.PrintStream;

public class Console extends PrintStream {
    private TextArea textArea;

    public Console(TextArea textArea) {
        super(System.out);
        this.textArea = textArea;
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        if (textArea != null) {
            final String message = new String(buf, off, len);
            textArea.appendText(message);
        } else {
            System.out.println("TextArea is null, cannot append message.");
        }
    }

    @Override
    public void write(int b) {
        super.write(b);
        textArea.appendText(String.valueOf((char) b));
    }

    @Override
    public void close() {
        flush();
        textArea = null; // Clear reference to TextArea
        super.close();
    }
}
