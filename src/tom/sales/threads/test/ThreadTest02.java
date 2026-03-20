package tom.sales.threads.test;


class ThreadExampleRunnable2 implements Runnable {
    private String c;

    public ThreadExampleRunnable2(String c) {
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
            Thread.yield(); // Dica ao escalonador de que a thread atual está disposta a pausar sua execução
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t1 = new Thread(new ThreadExampleRunnable2("ME"));

        t0.start();
        t0.join(); // Bloqueia a thread main até finalizar a execução de t0
        t1.start();
    }
}
