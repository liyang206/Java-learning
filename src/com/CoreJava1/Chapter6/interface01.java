package com.CoreJava1.Chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import javax.swing.Timer;

public class interface01 {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        Timer t = new Timer(1000,  listener);
        t.start();
    }

    static class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
