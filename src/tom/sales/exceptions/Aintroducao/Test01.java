package tom.sales.exceptions.Aintroducao;

public class Test01 {
    public static void main(String[] args) {

        // Exceções Checked -> Filhas diretas de Exception,
        // O compilador exige que sejam tratadas (try/catch ou throws), senão o código não compila.
        // Representam erros que podem acontecer fora do controle do programador.
        // Exemplos comuns: FileNotFoundException, IOException, SQLException, ParseException.

        // Exceções Unchecked -> Filhas de RuntimeException, neta de Exception.
        // Não precisam obrigatoriamente ser tratadas,
        // Representam erros de desenvolvimento, que podem ser evitados com código correto
        // Exemplos: divisão por 0, indíce inexistente, etc.


        try {
            double resultado = divisao(10, 0);
            System.out.println(resultado);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Continuo sendo executado");
    }

    public static double divisao (int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divisão por 0 não é permitida");
        }
        return a / b;
    }
}
