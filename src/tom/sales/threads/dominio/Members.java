package tom.sales.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " verificando se existem emails");

        synchronized (this.emails)  {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(threadName + " - Não tem emails disponível na lista, entrando no modo de espera");

                // wait(): Faz thread ficar esperando
                // obs: Só pode chamar wait se tivermos o lock do objeto
                this.emails.wait();
            }

            return this.emails.poll();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email na lista");
            this.emails.add(email);

            // Se adicionamos na lista, precisamos acordar as threads que estão esperando:
            this.emails.notifyAll();
        }
    }

    public void close() {
        this.open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notificando outras");
        }
    }
}
