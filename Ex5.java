import javax.swing.JOptionPane;

public class Ex5{
    public static void main(String[] args){
        int num = Integer.parseInt(
            JOptionPane.showInputDialog("Declare um numero entre 1 e 12:")
        );

        if (num == 1){
            System.out.println("janeiro");
        }
        else if (num == 2){
            System.out.println("fevereiro");
        }
        else if (num == 3){
            System.out.println("marco");
        }
        else if (num == 4){
            System.out.println("abril");
        }
        else if (num == 5){
            System.out.println("maio");
        }
        else if (num == 6){
            System.out.println("junho");
        }
        else if (num == 7){
            System.out.println("julho");
        }
        else if (num == 8){
            System.out.println("agosto");
        }
        else if (num == 9){
            System.out.println("setembro");
        }
        else if (num == 10){
            System.out.println("outubro");
        }
        else if (num == 11){
            System.out.println("novembro");
        }
        else if (num == 12){
            System.out.println("dezembro");
        }
        else{
            System.out.println("numero invalido");
        }

        if (num == 2){
            System.out.println("\n28 dias");
        }
        else if (num % 2 != 0){
            System.out.println("\n30 dias");
        }
        else{
            System.out.println("\n31 dias");
        }
    }
}