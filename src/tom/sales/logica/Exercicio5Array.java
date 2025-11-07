package tom.sales.logica;
import java.sql.SQLOutput;

public class Exercicio5Array {
    public static void main(String[] args) {
        // -- Inicialização Padrão de cada tipo: --
        // byte short int long float double: 0
        // char: ''
        // String: null

        System.out.println("----CONCEITOS----");
        int[] idades = new int[3];
        idades[2] = 19;
        System.out.println("Pos0: " + idades[0] + " Pos2: " + idades[2]);

        int[] valores = {10, 20, 30, 40, 50};

        // for valor in valores
        for (int valor : valores) {
            System.out.println(valor);
        }

        System.out.println();
        System.out.println("----EXERCÍCIO 1 ----");
        System.out.println();

        String[] nomeProdutos = {"Televisão", "Teclado", "MacBook", "Mouse"};
        double[] valoresVendidos = {40000, 15000, 120000, 11000};
        double faturamentoTotal = 0;

        for (int i = 0; i < nomeProdutos.length; i++) {

            String nomeProduto = nomeProdutos[i];
            double faturamentoProduto = valoresVendidos[i];

            faturamentoTotal = faturamentoTotal + faturamentoProduto;

            System.out.println("Produto: " + nomeProduto + "; Faturamento: R$" + faturamentoProduto);
        }

        System.out.println("Faturamento Total: R$" + faturamentoTotal);


        System.out.println();
        System.out.println("----EXERCÍCIO 2 Mostrar todos os pares 1 a 100 ----");
        System.out.println();

        byte[] pares = new byte[50];
        int indicePares = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                pares[indicePares] = (byte) i;
                indicePares = indicePares + 1;
            }
        }

        for (byte numero : pares) {
            System.out.println(numero);
        }


        System.out.println();
        System.out.println("----EXERCÍCIO 3 Média das notas ----");
        System.out.println();

        double[] notas =  {10, 8.5, 8.5, 8.5, 9};
        double somaNotas = 0;

        for (double nota : notas) {
            somaNotas = somaNotas + nota;
        }

        double mediaNotas = somaNotas / notas.length;
        System.out.println("Média das notas Tom semestre 25.1: " + mediaNotas);
    }
}
