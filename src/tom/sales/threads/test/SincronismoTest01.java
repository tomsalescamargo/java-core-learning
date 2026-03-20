package tom.sales.threads.test;

import tom.sales.threads.dominio.Account;

public class SincronismoTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        // Aqui temos problemas de sincronismo, duas threads acessando região
        //  crítica de um objeto ao mesmo tempo
        SincronismoTest01 sincronismoTest01 = new SincronismoTest01();
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

    private void withdrawal(int amount) {
        if (account.getBalance() >= amount) { // RACE CONDITION: Duas threads podem passar juntas aqui
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para: " + getThreadName() + " efetuar o saque: " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}
