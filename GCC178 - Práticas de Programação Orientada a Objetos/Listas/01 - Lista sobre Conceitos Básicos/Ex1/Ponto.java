import java.lang.Math;

public class Ponto {
    private double mX;
    private double mY;

    //Construtor;
    public Ponto(double x, double y) {
        mX = x;
        mY = y;
    }

    //Retorna coordenadas em frase formatada;
    public String getPonto() {
        return "As coordenadas (x,y) do ponto são: (" + Double.toString(mX) + "; " + Double.toString(mY) + ")\n";
    }

    public double calcularDistancia(Ponto umPonto) {
        return Math.sqrt((Math.pow(this.mX - umPonto.mX, 2)) + (Math.pow(this.mY - umPonto.mY, 2)));
    }
}
