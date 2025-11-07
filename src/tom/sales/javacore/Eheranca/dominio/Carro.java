package tom.sales.javacore.Eheranca.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de Portas: " + this.quantidadePortas);
        System.out.println("--------");
    }

    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
