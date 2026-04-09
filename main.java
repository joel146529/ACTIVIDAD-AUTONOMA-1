import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        String nombre;
        Double salario;
        nombre=JOptionPane.showInputDialog("ingresa nombre");
        salario=Double.parseDouble(JOptionPane.showInputDialog("ingresa salario"));
        JOptionPane.showMessageDialog(null,"el usuario"+nombre+"gana"+salario);

    }
}
