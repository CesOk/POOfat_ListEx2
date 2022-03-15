import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args){
        int ano = Integer.parseInt(
            JOptionPane.showInputDialog("Declare o ano:")
        );

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("ano bissexto");
        }
        else{
            System.out.println("ano nao bissexto");
        }
    }
}
