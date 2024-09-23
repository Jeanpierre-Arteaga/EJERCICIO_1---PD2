package PRACTICA_DOMICILIARIA_02.EJERCICIO_1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo();
        do{
            System.out.println("\nEscoja la opción que desee:");
            System.out.println("1) Cambiar/Introducir número");
            System.out.println("2) Mostrar número actual");
            System.out.println("3) Sumar");
            System.out.println("4) Restar");
            System.out.println("5) Producto");
            System.out.println("6) División");
            System.out.println("7) Comparación");
            System.out.println("8) Salir");
            System.out.print("Ingrese una opción: ");
            try{
                opc = entrada.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Debe ingresar un número entero.");
                entrada.next();
                continue;
            }
            switch(opc){
                case 1: c1 = IngresarDatos(entrada);break;
                case 2: System.out.println("El número actual es: "+c1); 
                        break;
                case 3: System.out.println("Número complejo con el que se sumará:");
                        c2 = IngresarDatos(entrada);
                        System.out.println("La suma es: ("+c1+") + ("+c2+") = "+c1.suma(c2)); 
                        break;
                case 4: System.out.println("Número complejo con el que se restará:");
                        c2 = IngresarDatos(entrada);
                        System.out.println("La resta es: ("+c1+") - ("+c2+") = "+c1.resta(c2)); 
                        break;
                case 5: System.out.println("Número complejo con el que se multiplicará:");
                        c2 = IngresarDatos(entrada);
                        System.out.println("El producto es: ("+c1+") * ("+c2+") = "+c1.producto(c2)); 
                        break;
                case 6: System.out.println("Número complejo con el que se dividirá:");
                        c2 = IngresarDatos(entrada);
                        System.out.println("La division es: ("+c1+") / ("+c2+") = "+c1.division(c2)); 
                        break;
                case 7: System.out.println("Número complejo con el que se comparará:");
                        c2 = IngresarDatos(entrada);
                        if(c1.equals(c2)){System.out.println("Los números complejos son iguales.");}
                        else{System.out.println("Los números complejos son diferentes.");} 
                        break;
                case 8: break;
                default: System.out.println("Ingrese una opción correcta."); break;
            }
        }while(opc!=8);
        entrada.close();
    }
    public static Complejo IngresarDatos(Scanner entrada){
        double r,i;
        System.out.print("Ingrese la parte real: "); r = entrada.nextDouble();
        System.out.print("Ingrese la parte imaginaria: "); i = entrada.nextDouble();
        return new Complejo(r,i);
    }
}