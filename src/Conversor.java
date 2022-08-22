
import javax.swing.JOptionPane;

public class Conversor{

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos Al Conversor De Monedas");
        run();
    }
    public static String input(String str){
        return JOptionPane.showInputDialog(null, str);
    }

    public static void run(){
        String monedaLocal = input("¿Cual es su moneda Local?");
        String monedaInternacional =  input("¿A que moneda quiere cambiar?");
        try {
             String ValorMonedaInternacional = input("¿cuantos " + monedaLocal + " cuesta 1 " + monedaInternacional + "?" );
             String cantidadMonedaLocal = input("¿Cuantos " + monedaLocal + " quiere convertir a "+ monedaInternacional + "?");
             float conversion = Float.parseFloat(cantidadMonedaLocal)/Float.parseFloat(ValorMonedaInternacional);
             JOptionPane.showMessageDialog(null, "usted tiene " + Math.floor(conversion) + " " + monedaInternacional);
             confirmDialog();
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "error: debe introducir valores numericos");
            confirmDialog();
        }
    }

    public static void confirmDialog(){
        if (JOptionPane.showConfirmDialog(null,"¿Desea Continuar?") == 0){
            run();
        }else{
            JOptionPane.showMessageDialog(null, "Programa Terminado");
            System.exit(0);
        }
    }
}
