import java.util.Scanner;
public class Cuadrado extends Figura {
    double l;
    public double calcularPerimetro{
        double perimetro = l*4;
        return perimetro;
    }

    public double calcularArea(){
        return Math.pow(l,2);
    }
    public void ingresarLado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        l=sc.nextDouble();

    }
}
