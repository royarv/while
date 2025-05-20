import javax.swing.JOptionPane;
public class CicloWhilePane{
    public static int obtenerNumero(String mensaje){
        int numeroTemporal = 0;
        while(numeroTemporal <=0){
        numeroTemporal = Integer.parseInt(JOptionPane.showInputDialog(mensaje + ": "));   
        }
        return numeroTemporal; 

    }
    public static void main(String[] args){
        int numero = obtenerNumero("Ingrese numero");
    }
}