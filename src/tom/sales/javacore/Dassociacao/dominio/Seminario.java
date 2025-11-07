package tom.sales.javacore.Dassociacao.dominio;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Local local;
    private Estudante[] estudantes;


    public Seminario(String titulo, Professor professor, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
        this.estudantes = estudantes;
    }

    public void imprime() {
        System.out.println("--- DADOS SEMINÁRIO ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Local: " + this.local.getEndereco());
        System.out.println("Estudantes: ");
        for (Estudante estudante : this.estudantes) {
            System.out.println("-" + estudante.getNome());
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
