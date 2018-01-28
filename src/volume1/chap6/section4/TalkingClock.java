package chap6.section4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClock {
//    private class TimePrinter implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            Date now = new Date();
//            System.out.println(now);
//            if (beep) {
//                System.out.println("beep! ");
//            }
//        }
//    }

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }
//    public void start() {
//        TimePrinter listener = new TimePrinter();
//        Timer timer = new Timer(interval, listener);
//        timer.start();
//    }
    // Java 8中不再强制局部变量为final
//    public void start(String sound) {
//        class TimePrinter implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date now = new Date();
//                System.out.println(now);
//                if (TalkingClock.this.beep) {
//                    System.out.println(sound);
//                }
//            }
//        }
//
//        ActionListener listener = new TimePrinter();
//        Timer timer = new Timer(interval, listener);
//        timer.start();
//    }
    public void start() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(new Date());
                if (beep) {
                    System.out.println("beep! ");
                }
            }
        };
        Timer timer = new Timer(interval, listener);
        timer.start();
    }

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(2000, true);
//        clock.start();
//        clock.start("!");
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit program? ");
        System.exit(0);
    }
}
