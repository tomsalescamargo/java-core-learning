package tom.sales.utils.strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        // String Pool cria somente um valor "Tom"
        // Quando o compilador vê "Tom" novamente em nome2, ele reutiliza o objeto existente
        String nome = "Tom";
        String nome2 = "Tom";
        System.out.println(nome == nome2); // Variáveis apontam para o mesmo endereço na memória

        // Agora é criado " Sales" e "Tom Sales" na String Pool -> imutabilidade
        nome = nome.concat(" Sales");
        System.out.println(nome == nome2); // Variáveis não apontam mais para o mesmo endereço na memória

        // Cria: 1. variável de referência | 2. Objeto do tipo String no heap | 3. String na pool (caso não exista)
        String nome3 = new String("Tom"); // Pouco utilizado
        System.out.println(nome2 == nome3);

        // Como String é imutável, toda modificação cria um novo objeto.
        // Por exemplo, se tivermos uma string de 5000 caracteres e alterarmos apenas um caractere,
        // uma nova String de 5000 caracteres será criada. Em operações repetidas isso pode gerar
        // muitos objetos na memória e se tornar ineficiente.
    }
}
