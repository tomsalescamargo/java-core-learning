package tom.sales.javacore.Fenumeracao.dominio;

public enum TipoNivel {

    JUNIOR(1, "Júnior") {
        @Override
        public double calcularValeRefeicao(double salario) {
            return salario / 4;
        }
    },

    PLENO(2, "Pleno") {
        @Override
        public double calcularValeRefeicao(double salario) {
            return salario / 8;
        }
    },

    SENIOR(3, "Sênior") {
        @Override
        public double calcularValeRefeicao(double salario) {
            return 1000;
        }
    };

    private final int grau;
    private final String NIVEL_RELATORIO;

    TipoNivel(int grau, String nivelRelatorio) {
        this.grau = grau;
        this.NIVEL_RELATORIO = nivelRelatorio;
    }

    public double calcularValeRefeicao(double salario) {
        return 0.0;
    }

    public TipoNivel buscarTipoPorRelatorio(String tipo) {

        for (TipoNivel tipoNivel : values()) {
            if (tipoNivel.NIVEL_RELATORIO.equalsIgnoreCase(tipo)) {
                return tipoNivel;
            }
        }
        return null;
    }

    public int getGrau() {
        return this.grau;
    }

    public String getNivelRelatorio() {
        return this.NIVEL_RELATORIO;
    }
}
