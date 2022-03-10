import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        double delta;
        Scanner leitor =
            new Scanner (System.in);

        double a, b, c;
        System.out.println("Diga o primeiro coeficiente:");
        a = leitor.nextDouble();

        System.out.println("\nDiga o segundo coeficiente:");
        b = leitor.nextDouble();

        System.out.println("\nDiga o terceiro coeficiente:");
        c = leitor.nextDouble();

        delta = (b*b) - (4*a*c);

        if(delta < 0){
            System.out.println("Nao ha raizes");
        }
        else if(delta > 0){
            System.out.println("Ha duas raizes");
        }
        else{
            System.out.println("Ha uma raiz");
        }

        leitor.close();
    }
}
