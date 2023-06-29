public class Triangulo extends Figura{
    double l1;
    double l2;
    double l3;
    public double calcularPerimetro(){
        l1 = calcularDistancia();
        l2 = calcularDistancia();
        l3 = calcularDistancia();
        return l1+l2+l3;

    }

    public double calcularArea(){
        double s = calcularPerimetro()/2;
        double area = Math.sqrt(s*((s-l1)*(s-l2)*(s-l3)));

        return area;
    }
}
