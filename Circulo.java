package x;

/**
 *
 * @author Alexis
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        double area = Math.PI * radio;
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
