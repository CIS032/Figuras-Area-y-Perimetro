package x;

/**
 *
 * @author Alexis
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        System.out.println("creando triangulo");
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        double area = (base * altura) / 2;
        return area;
    }

    public double perimetro() {
        double perimetro = base + altura;
        return perimetro;
    }
}
