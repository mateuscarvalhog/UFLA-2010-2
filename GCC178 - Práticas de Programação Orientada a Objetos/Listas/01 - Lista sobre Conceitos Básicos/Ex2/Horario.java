public class Horario {
    private int mHora;
    private int mMin;
    private int mSeg;

    public Horario(int hora, int min, int seg) {
        mHora = hora;
        mMin = min;
        mSeg = seg;
    }

    public void exibir() {
        System.out.println(mHora + "h:" + mMin + "m:" + mSeg + "s");
    }

    public void formatarTempo(int seg) {
        int hora = seg / 3600;
        seg -= (hora * 3600);
        int min = seg / 60;
        seg -= (min * 60);

        Horario aux = new Horario(hora, min, seg);
        aux.exibir();
    }
}
