import java.util.InputMismatchException;
import java.util.Scanner;
import package.Triangulo;




public class Main {
    public static void main(String[] args) {

                Scanner sn = new Scanner(System.in);
                boolean salir = false;
                int opcion;


                while (!salir) {

                    System.out.println("Menu principal");
                    System.out.println("1. Cuadrado ");
                    System.out.println("2. Triangulo");
                    System.out.println("3. Circulo");
                    System.out.println("4. Salir");

                    try {

                        System.out.println("Escribe una de las opciones");
                        opcion = sn.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opcion 1");
                                Triangulo = new Triangulo();
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opcion 2");
                                Cuadrado = new Cuadrado();
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opcion 3");
                                Circulo = new Circulo;
                                break;
                            case 4:
                                salir = true;
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 4");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debes insertar un número");
                        sn.next();
                    }
                }
              }

            private void submenu(){
               Scanner sn = new Scanner(System.in) ;
               boolean salir = false;
               int secopcion;
               while (!salir){
                   System.out.println("Ingrese el numero puntos que va a ingresar");
                   secopcion = sn.nextInt();

                   switch (secopcion){
                       case 3:
                           System.out.println("Perimetro");

                       case 4:
                           System.out.println("Area");
                                                    

                   }

               }




            }





    }