import javax.swing.JOptionPane;

public class Ex4{
    public static void main(String[] args){
        int num = Integer.parseInt(
            JOptionPane.showInputDialog("Declare um numero entre 1 e 7:")
        );
 
        if (num == 1){
            System.out.println("segunda");
        }
        else if (num == 2){
            System.out.println("terca");
        }
        else if (num == 3){
            System.out.println("quarta");
        }
        else if (num == 4){
            System.out.println("quinta");
        }
        else if (num == 5){
            System.out.println("sexta");
        }
        else if (num == 6){
            System.out.println("sabado");
        }
        else if (num == 7){
            System.out.println("domingo");
        }
        else{
            System.out.println("numero invalido");
        }
    }
}