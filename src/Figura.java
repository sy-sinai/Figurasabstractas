import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {
    List <Punto> listaPuntos= new ArrayList<>();
    public double calcularPerimetro;
    public  double calcularArea;

    public void ingresarPuntos(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la componente x del punto");
        double x =sc.nextDouble();
        System.out.println("Ingrese la componente x del punto");
        double y = sc.nextDouble();
        System.out.println("Ingrese la componente x del punto");
        double z = sc.nextDouble();
        listaPuntos.add(new Punto(x,y,z));
    }

    public double calcularDistancia(int i, int j){
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double d = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2))
                +Math.sqrt(Math.pow(punto1.getY()-punto2.getY(),2))
                +Math.sqrt(Math.pow(punto1.getY()-punto2.getY(),2));
                return d;
    }

}
