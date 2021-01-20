import java.util.ArrayList;

public class Carro {
    private String mModelo;
    private ArrayList<Integer> mAcessorios;

    public Carro(String modelo) {
        mModelo = modelo;
        mAcessorios = new ArrayList<Integer>();
    }

    public String getModelo() {
        return mModelo;
    }

    public int getQtd() {
        return mAcessorios.size();
    }

    public int getCodigo(int posicao) {
        return mAcessorios.get(posicao);
    }

    public void setAcessorio(int codigo) {
        mAcessorios.add(codigo);
    }


}
