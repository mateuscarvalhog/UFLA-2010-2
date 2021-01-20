public class Aluno {
    private String mNome;
    private String mCategoria;
    private int[] mNotas;
    private int posInsercao;

    public Aluno(String nome, String categoria, int num) {
        mNome = nome;
        mCategoria = categoria;
        mNotas = new int[num];
        posInsercao = 0;
    }

    public String getNome() {
        return mNome;
    }

    public int getNota(int num) {
        return mNotas[num];
    }

    public float cr() {
        float media = 0;
        for(float nota : mNotas) {
            media += nota;
        }
        return media / posInsercao;
    }

    public String situacao() {
        float cr = this.cr();
        if(mCategoria.equals("bolsista") && cr < 75) {
            return "Desligado";
        } else if(mCategoria.equals("nao bolsista") && cr < 70) {
            return "Desligado";
        } else {
            return "Regular";
        }
    }

    public void inserirNota(int nota) {
        mNotas[posInsercao] = nota;
        posInsercao++;
    }
}
