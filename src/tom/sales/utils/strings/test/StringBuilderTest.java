package tom.sales.utils.strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        // StringBuilder: Classe que trabalha com Strings, muito mais performática
        // Permite mudança da String, sem ficar alocando mais espaços a cada alteração

        String nome = "William Suane";
        nome.concat(" DevDojo");
        // "DevDojo" Não aparece porque não atribuimos "concat" à nenhuma variável, e String é imutável
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo"); // Altera o objeto
        System.out.println(sb); // Agora aparece "DevDojo"

        // OBS:
        sb.substring(0, 3); // Metodo retorna String, ou seja, não altera o objeto original
        System.out.println("Testando Substring: " + sb); // Não funcionou a substring

        // SE METODO RETORNA STRING NÃO ALTERA O OBJETO ORIGINAL, SE RETORNA STRINGBUILDER ALTERA

        // Temos também o StringBuffer, que funciona igual, porém é thread-safe
        StringBuffer sbuffer = new StringBuffer(16);
        sbuffer.append("Tom Sales");
        System.out.println("StringBuffer: " + sbuffer);
    }
}
