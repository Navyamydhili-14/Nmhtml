package Threads;

public class Monday1 {
    class Hello {
        String message;

        Hello(String message) {
            this.message = message;
        }

        synchronized void sendmessage() {
            System.out.println("Information");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        synchronized void replymessage() {
            System.out.println("Replying Message");
            notify();
        }
    }

    class Person1 extends Thread {
        Hello h;

        Person1(Hello h) {
            this.h = h;
        }

        public void run() {
            System.out.println("Person1 thread");
            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Person2 extends Thread {
        Hello h;

        Person2(Hello h) {
            this.h = h;
        }

        public void run() {
            System.out.println("Person Thread");
            try {
                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class Samp {
        public static void main(String[] args) {
            Hello h = new Hello("hello process");
            Person1 p = new Person1(h);
            Person2 p1 = new Person2(h);
            p.start();
            p1.start();

        }

    }

}