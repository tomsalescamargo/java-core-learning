package tom.sales.logica;

public class Exercicio2 {
    public static void main(String[] args) {
        double salario = 68507;
        double taxa;

        if (salario <= 34712) {
            taxa = salario * 0.097;
        } else if (salario > 34712 && salario <= 68507) {
            taxa = salario * 0.3735;
        } else {
            taxa = salario * 0.4950;
        }

        System.out.println("A taxa é: " + taxa);
    }
}
