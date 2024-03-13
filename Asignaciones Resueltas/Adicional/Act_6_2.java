import java.text.DecimalFormat;
import java.io.*;

class Padre {
    private float dinero;

    public void asignar(float din) {
        this.dinero = din;
    }

    public float get_dinero() {
        return (dinero);
    }

    public void actualizar_dinero_interes() {
        dinero = dinero * .05f + dinero;
    }
}

class Hija extends Padre {
    private float dinero;

    public void asignar(float din, float dinh) {
        asignar(din);
        this.dinero = dinh;
    }

    public float get_dinero() {
        return (dinero);
    }

    public void actualizar_dinero_interes() {
        super.actualizar_dinero_interes();
        dinero = super.get_dinero() + dinero * .05f + dinero;
    }
}

/**
 * Act_6_2
 */
public class Act_6_2 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("'B/. '###,###.## ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hija obj = new Hija();
        float montop = 0;
        float montoh = 0;
        boolean error = false;
        do {
            try {
                System.out.print("Ingrese el monto del PADRE a ahorrar en el banco\n-->:");
                montop = Integer.parseInt(br.readLine());
                if (montop <= 0) {
                    System.err.println("Ingrese un numero positivo");
                    error = true;
                }
            } catch (IOException e) {
                error = true;
            } catch (NumberFormatException e) {
                error = true;
            }
        } while (error);

        do {
            try {
                System.out.print("Ingrese el monto del HIJO a ahorrar en el banco\n-->:");
                montoh = Integer.parseInt(br.readLine());
                if (montoh <= 0) {
                    System.err.println("Ingrese un numero positivo");
                    error = true;
                }
            } catch (IOException e) {
                error = true;
            } catch (NumberFormatException e) {
                error = true;
            }
        } while (error);

        obj.asignar(montop, montoh);
        obj.actualizar_dinero_interes();
        System.out.println("\nEl monto original del padre en el banco es de " + formato.format(montop));
        System.out.println("El monto original del hijo en el banco es de " + formato.format(montoh) + "\n");
        System.out.println("El monto total en el banco es de " + formato.format(obj.get_dinero()));

    }
}