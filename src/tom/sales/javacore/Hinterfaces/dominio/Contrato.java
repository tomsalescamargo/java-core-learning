package tom.sales.javacore.Hinterfaces.dominio;

public class Contrato implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("----Imprimindo dados do contrato----");
    }
}
