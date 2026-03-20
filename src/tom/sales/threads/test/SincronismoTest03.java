package tom.sales.threads.test;

import tom.sales.threads.dominio.Account;

public class SincronismoTest03 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        SincronismoTest03 sincronismoTest01 = new SincronismoTest03();
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

    // Agora com synchronized fora da assinatura do metodo permite que duas threads entrem no metodo ao mesmo tempo.
    // O tempo de t0 entrar no metodo withdrawal novamente, e imprimir a mensagem antes do synchronized, permite
    //  que t1 pegue o processador e execute o código do synchronized
    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " ##### fora do synchronized");

        synchronized (account) {
            System.out.println(getThreadName() + " ****** dentro do synchronized");

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
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}
