package tom.sales.lambdas.service;

import tom.sales.lambdas.dominio.Filme;

public class FilmeComparators {
    public static int compareByTitle (Filme f1, Filme f2) {
        return f1.getTitulo().compareTo(f2.getTitulo());
    }

    public int compareByQuantity(Filme f1, Filme f2) {
        return Integer.compare(f1.getQuantity(), f2.getQuantity());
    }
}
