public class Ex3 {
    public static void main(String[] args){
        java.util.Scanner leitor =
            new java.util.Scanner(System.in);

        double n1, n2, n3, maior;
  
        System.out.println("Insira o primeiro numero:");
        n1 = leitor.nextDouble();
        maior = n1;

        System.out.println("\nInsira o segundo numero:");
        n2 = leitor.nextDouble();

        if(n2 > maior){
            maior = n2;
        }

        System.out.println("\nInsira o terceiro numero:");
        n3 = leitor.nextDouble();

        if(n3 > maior){
            maior = n3;
        }
        
        System.out.printf("\n%.2f", maior);
        leitor.close();
    }
}
