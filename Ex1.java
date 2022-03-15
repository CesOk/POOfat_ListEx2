import javax.swing.JOptionPane;

public class Ex1{
    public static void main(String[] args){
        int num = Integer.parseInt(
            JOptionPane.showInputDialog("Declare o numero:")
        );
 
        if (num > 0){
            System.out.println("Positivo");
        }
        else if (num < 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Neutro");
        }
    }
}