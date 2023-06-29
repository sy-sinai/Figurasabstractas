import java.util.Scanner;

public abstract class Circulo {
    double r;
    public double calcularPerimetro{
        double perimetro = r* Math.pi * 2;
        return perimetro;
    }

    public double calcularArea(){
        return Math.pi * radio * radio;
    }
    public void ingresarLado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        l=sc.nextDouble();

    }
}
}
