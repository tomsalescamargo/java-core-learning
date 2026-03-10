package tom.sales.utils.strings.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "tatum";
        System.out.println(nome);

        System.out.println("Segundo caractere: " +  nome.charAt(1));
        System.out.println("Tamanho: " + nome.length());
        System.out.println("Replace: " + nome.replace("t", "p")); // Case sensitive
        System.out.println("Minúsculo: " + nome.toLowerCase());
        System.out.println("Maiúsculo: " + nome.toUpperCase());

        String numeros = "012345";
        System.out.println("Substring: " + nome.substring(0, 3)); // Fim não é inclusivo (pega 0 até 2)

        String telefone = " 991230123   ";
        System.out.println("Trim: " + telefone.trim()); // Útil para tratar erros de usuário
    }
}
