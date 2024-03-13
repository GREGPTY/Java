
/*
*                          Author's:  Genesis Rodríguez
*                                     Ernesto Sánchez
*                                     Anthony Avila
*                                     Enrique Gonzalez
*                                     Greg Torres
*                                     Bryan de Gracia
*/
import java.io.*;

class Arreglo5_7 {
    private final int elm = 6;//<--modificar para el tamaño
    private float arr[] = new float[elm];

    public boolean asignar(float dato, int p) {
        arr[p] = dato;
        for (int i = 0; i < p; i++) {
            if (arr[i] == dato) {
                return true;
            }
        }
        return false;
    }

    public float[] par_ord() {
        float a = 0, b = 0, par[] = new float[elm * elm];
        int k = 0;
        for (int i = 0; i < elm; i++) {
            a = arr[i];
            for (int j = 0; j < elm; j++) {
                b = arr[j];
                if ((a + b) == 75) {
                    par[k++] = a;
                    par[k++] = b;

                }
            }
        }
        return par;
    }

}

/**
 * Act_5_6
 */
public class Act_5_7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arreglo5_7 obj = new Arreglo5_7();
        final int elm = 6;//<--modificar para el tamaño
        float par[];
        float dato = 0;

        System.out.println(
                "Escriba una aplicación que lea 25 números diferentes\nn1, n2, ..., n25 e imprimir en líneas separadas cada\npar de números cuya suma sea 75.");
        for (int i = 0; i < elm; i++) {
            try {
                System.out.print("\nINGRESE EL ARR[" + i + "]:: ");
                dato = Float.parseFloat(br.readLine());
                if (obj.asignar(dato, i)) {
                    System.out.println("\nINGRESE NUMEROS \"DIFERENTES\"");
                    i--;
                }
            } catch (IOException e) {
                i--;
                System.out.println("ERROR!!! AL INGESO DE DATOS" + e);
            } catch (NumberFormatException e) {
                i--;
                System.out.println("ERROR!!! AL CONVERTIR EL DATO" + e);
            }
        }
        System.out.println("\nCADA PAR");
        par = obj.par_ord();
        for (int i = 0; (par[i] + par[i + 1]) != 0; i += 2) {
            System.out.format("(%.0f + %.0f) = 75\n", par[i], par[i + 1]);
        }
    }

    /**
     * @return float return the arr[]
     */
    public float getArr[]() {
        return arr[];
    }

    /**
     * @param arr[] the arr[] to set
     */
    public void setArr[](float arr[]) {
        this.arr[] = arr[];
    }

}
