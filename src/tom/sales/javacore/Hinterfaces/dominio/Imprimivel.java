package tom.sales.javacore.Hinterfaces.dominio;

public interface Imprimivel {
    void imprimir();

    default void mensagem_erro() {
        System.out.println("Mensagem de erro");
    }

}
