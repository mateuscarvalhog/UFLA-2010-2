import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> mFrota;

    public Frota() {
        mFrota = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo v) {
        mFrota.add(v);
    }

    public void exibirVeiculos() {
        for(Veiculo v : mFrota) {
            System.out.println(v);
        }
    }
}
