package tom.sales.logica;

public class Exercicio4Break {
    public static void main(String[] args) {
        int precoCarro = 480000;
        int valorParcela;

        for (int quantidadeParcelas = 1; quantidadeParcelas <= precoCarro ; quantidadeParcelas++) {
            valorParcela = precoCarro / quantidadeParcelas;

            if (valorParcela < 1000) {
                break;
            }

            System.out.println(quantidadeParcelas + " parcelas de R$" + valorParcela);
        }
    }
}
