package tom.sales.javacore.Hinterfaces.dominio;

public class Relatorio implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("----Imprimindo relatório do banco de dados----");
    }
}
