package tom.sales.javacore.Cencapsulamento.dominio;

public class Carro {
    private String nomeDoDono;
    private String marca;
    private int ano;
    private double velocidadeMaxima;
    {
        System.out.println("Bloco de inicialização...");
        this.velocidadeMaxima = 1000.0 / 2 / 2;
    }


    // Constructors

    public Carro() {
        this.nomeDoDono = "Dono";
        this.marca = "Marca";
        this.ano = 2025;
        this.velocidadeMaxima = 200;
    }

    public Carro(String nomeDoDono, String marca, int ano) {
        this.nomeDoDono = nomeDoDono;
        this.marca = marca;
        this.setAno(ano);
    }

    public Carro(String nomeDoDono, String marca, int ano, double velocidadeMaxima) {
        this(nomeDoDono, marca, ano);
        this.setVelocidadeMaxima(velocidadeMaxima);
    }


    // Metods

    public void exibirInfo() {
        System.out.println("---- DADOS DO CARRO ----");
        System.out.println("Nome do dono: " + this.nomeDoDono);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("-------------");
    }

    public void exibirInfo(boolean exibirVelocidade) {
        if (exibirVelocidade) {
            this.exibirInfo();
            return;
        }

        System.out.println("---- DADOS DO CARRO ----");
        System.out.println("Nome do dono: " + this.nomeDoDono);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("-------------");
    }


    // Getters and Setters

    public String getNomeDoDono() {
        return this.nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        if (ano < 1886) {
            return;
        }
        this.ano = ano;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima < 0) {
            return;
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
