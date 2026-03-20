package tom.sales.threads.test;

import tom.sales.threads.dominio.Members;
import tom.sales.threads.service.EmailDeliveryService;

import javax.swing.*;

public class WaitNotifyTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread t0 = new Thread(new EmailDeliveryService(members), "Rafael");
        Thread t1 = new Thread(new EmailDeliveryService(members), "Tom");

        t0.start();
        t1.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }
    }
}
