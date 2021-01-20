public class Depto{
    private String nome;
    private String[] docente;
    private int numeroCursos;
    private int numeroAlunos;
    private int contador;

    public Depto(String nome, int qtdadeDocentes){
        this.nome = nome;
        docente = new String[qtdadeDocentes];
        contador = 0;
    }
    public Depto(String nome, int numeroCursos, int numeroAlunos, int qtdadeDocentes){
        this.nome = nome;
        this.numeroCursos = numeroCursos;
        this.numeroAlunos = numeroAlunos;
        docente = new String[qtdadeDocentes];
        contador = 0;
    }
    public void cadastrarDocente(String nomeDocente){
        docente[contador] = nomeDocente;
        contador++;
    }
    public void setNumeroCursos(int numeroCursos){
        this.numeroCursos = numeroCursos;
    }
    public void setNumeroAlunos(int numeroAlunos){
        this.numeroAlunos = numeroAlunos;
    }
    public void mostrarDetalhes() {
        System.out.println("Nome do departamento: " + nome);
        System.out.println("Professores:");
        for(String doc : docente) {
            System.out.println("\t\t" + doc);
        }
        System.out.println("Numero de Cursos: " + numeroCursos);
        System.out.println("Numero de Alunos: " + numeroAlunos);
    }
}
