package tom.sales.threads.test;

import tom.sales.threads.dominio.Account;

public class SincronismoTest02 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        // Com o uso de `synchronized` resolvemos o problema do teste anterior
        SincronismoTest02 sincronismoTest01 = new SincronismoTest02();
        Thread t0 = new Thread(sincronismoTest01, "Thread 0 - TOM");
        Thread t1 = new Thread(sincronismoTest01, "Thread 1 - RODRIGO");

        t0.start();
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    // Synchronized torna o metodo atômico
    // faz Lock no objeto atual (this)
    private synchronized void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);

            try {
                Thread.sleep(2000); // Mesmo bloqueando a thread, escalonador não deixa outra entrar
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para: " + getThreadName() + " efetuar o saque: " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}
