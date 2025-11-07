package tom.sales.exceptions.Aintroducao;

import java.io.FileNotFoundException;

public class Test02 {
    public static void main(String[] args) {
        try {
            String resultado = executar(9);
            System.out.println(resultado);
        } catch (FileNotFoundException | RuntimeException e) {
            System.out.println("Exceção capturada: " + e);
        } finally {
            System.out.println("Atualizado status no banco de dados");
        }
    }

    public static String executar(int numero) throws FileNotFoundException {
        if (numero % 2 == 0) {
            return "Número aceito";
        }
        throw new ArithmeticException();
    }
}
