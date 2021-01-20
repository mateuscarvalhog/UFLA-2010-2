public class Correcao {
    private int mNumQuestao;
    private String mSituacao;
    private int mTentativa;

    public Correcao(int numQuestao, String situacao, int tentativa) {
        mNumQuestao = numQuestao;
        mSituacao = situacao;
        mTentativa = tentativa;
    }

    public int getNumQuestao() {
        return mNumQuestao;
    }

    public String getSituacao() {
        return mSituacao;
    }

    public int getTentativa() {
        return mTentativa;
    }
}
