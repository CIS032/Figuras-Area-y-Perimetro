package x;

/**
 *
 * @author Alexis
 */
public class Rectangulo extends Figura {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        System.out.println("creando rectangulo");
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        double area = altura * base;
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * (altura + base);
        return perimetro;
    }

}
