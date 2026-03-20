package tom.sales.threads.test;

// Não recomendado
class ThreadExample extends Thread {
    private char c;
    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // Formas de trabalhar com Threads:
        // 1.
//        ThreadExample t0 = new ThreadExample('A');
//        ThreadExample t1 = new ThreadExample('B');
//        ThreadExample t2 = new ThreadExample('C');
//        ThreadExample t3 = new ThreadExample('D');


        // 2.
        Thread t0 = new Thread(new ThreadExampleRunnable('A'));
        Thread t1 = new Thread(new ThreadExampleRunnable('B'));
        Thread t2 = new Thread(new ThreadExampleRunnable('C'));
        Thread t3 = new Thread(new ThreadExampleRunnable('D'));

        t3.setPriority(Thread.MAX_PRIORITY); // Não é garantido
        t0.start();
        t1.start();
        t2.start();
        t3.start();

        System.out.println("################# main");
    }
}
