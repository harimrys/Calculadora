import java.util.Scanner;

public class Calculadora {
    
    int x;
    int y;
    int c;
    int d;
    int e;
    int f;
    double g;
    double h;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
    
        boolean salir = false;
        
        do{
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce los números que quieres sumar");
                    int x = num.nextInt();
                    int y = num.nextInt();
                    System.out.print("La suma de " + x + " + " + y + " es: ");
                    System.out.println(x + y);
                    break;
                    
                case 2:
                    System.out.println("Introduce los números que quieres restar");
                    int c = num.nextInt();
                    int d = num.nextInt();
                    System.out.print("La resta de " + c + " - " + d + " es: ");
                    System.out.println(c - d);
                    break;
                
                case 3:
                    System.out.println("Introduce los números que quieres multiplicar");
                    int e = num.nextInt();
                    int f = num.nextInt();
                    System.out.print("La multiplicación de " + e + " * " + f + " es: ");
                    System.out.println(e * f);
                    break;
                    
                case 4:
                    System.out.println("Introduce los números que quieres dividir");
                    double g = num.nextDouble();
                    double h = num.nextDouble();
                    System.out.print("La división de " + g + " / " + h + " es: ");
                    System.out.println(g / h);
                    break;
            }
        }
        while(!salir);
    }
} 
