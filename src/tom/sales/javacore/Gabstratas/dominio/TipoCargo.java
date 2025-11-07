package tom.sales.javacore.Gabstratas.dominio;

public enum TipoCargo {
    PROGRAMADOR("Programador"),
    GERENTE("Gerente "),
    DIRETOR("Diretor");

    public final String cargoRelatorio;

    TipoCargo(String cargoRelatorio) {
        this.cargoRelatorio = cargoRelatorio;
    }
}
