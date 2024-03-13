
/*
*                           ___       ______ .___________.    _  _        _  _    
*                          /   \     /      ||           |   | || |      | || |   
*                         /  ^  \   |  ,----'`---|  |----`   | || |_     | || |_  
*                        /  /_\  \  |  |         |  |        |__   _|    |__   _| 
*                       /  _____  \ |  `----.    |  |           | |    __   | |   
*                      /__/     \__\ \______|    |__|           |_|   (__)  |_|   
*                                                                                 
* Created Date: Thursday, May 23rd 2019, 12:05:55 pm
* Author:  Genesis Rodríguez
*          Ernesto Sánchez
*          Anthony Avila
*          Enrique Gonzalez
*          Greg Torres
*          Bryan de Gracia
* 
* Copyright (c) 2019 Your Company
*/

import java.io.*;

class Salario {

    private String nombre = new String();
    private int hr_trab;
    private char turno;
    private boolean dia_fer;

    public void asignar(String a, int b, char c, boolean d) {
        nombre = a;
        hr_trab = b;
        turno = c;
        dia_fer = d;
    }

    public float salario_por_horas() {
        int pag_por_fer = 0;
        float tarifa = 0;

        if (turno == 'd' & dia_fer == true) {

            pag_por_fer = 1;
            tarifa = 15.00f;

        } else if (turno == 'n') {

            pag_por_fer = 1;
            if (dia_fer == true) {
                pag_por_fer = 2;
            }
            tarifa = 20.00f;

        }
        return hr_trab * pag_por_fer * tarifa;
    }
}

/**
 * Act_4_4
 */
public class Act_4_4 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Salario salario = new Salario();

        String nombre = new String(), tur;
        int hr_trab = 0;
        char dia_fer = '\0';
        char turno = '\0';

        boolean error;
        boolean x = false;

        do {
            error = false;
            try {

                System.out.print("Ingrese el nombre del empleado \n-->:");
                nombre = br.readLine();
            } catch (IOException e) {
                System.out.println("ERROR!!! E/S\n\n" + e);
                error = true;
            }
        } while (error);

        do {
            error = false;
            try {

                System.out.print("Ingrese las horas trabajadas \n-->:");
                hr_trab = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("ERROR!!! E/S\n\n" + e);
                error = true;
            } catch (NumberFormatException e) {
                System.out.println("ERROR!!! E/S\n\n" + e);
                error = true;
            }
        } while (error);

        do {
            error = false;
            try {

                System.out.print("¿QUE TURNO REALIZO? [d/n] [(d) diurno] [(n) nocturno] ");
                turno = (char) br.read();

                if (turno != 'd' & turno != 'n') {
                    System.out.println("introdujo un valor equivocado");
                    error = true;
                }

                br.skip(2);
            } catch (IOException e) {
                System.out.println("ERROR!!! E/S\n\n" + e);
                error = true;
            }
        } while (error);

        do {
            error = false;
            try {

                System.out.print("¿TRABAJO EN DIA FERIADO?[s/n]: ");
                dia_fer = (char) br.read();
                br.skip(2);
                if (dia_fer != 's' & dia_fer != 'n'){
                    System.out.println("introdujo un valor equivocado");
                    error = true;
                }
                if (dia_fer == 's')
                    x = true;
                else if (dia_fer == 'n')
                    x = false;

            } catch (IOException e) {
                System.out.println("ERROR!!! E/S\n\n" + e);
                error = true;
            }
        } while (error);

        salario.asignar(nombre, hr_trab, turno, x);
        if (turno == 'd')
            tur = "diurno";
        else
            tur = "nocturno";

        System.out.format("EL SALARIO DE EL TRABAJADOR \"%s\" ES DE: %.2f\n", nombre.toUpperCase(), salario.salario_por_horas());
        System.out.println("Trabajo: " + hr_trab + " horas en el turno: " + tur.toUpperCase() + "\n");
    }
}