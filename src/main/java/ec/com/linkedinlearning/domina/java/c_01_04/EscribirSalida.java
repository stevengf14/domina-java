package ec.com.linkedinlearning.domina.java.c_01_04;

import ec.com.linkedinlearning.domina.java.c_01_03.Dato;
import ec.com.linkedinlearning.domina.java.c_01_03.LeerEntrada;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class EscribirSalida {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(new File("entrada.txt"));
                FileWriter fw = new FileWriter("salida.txt")) {
            List<Dato> leidos = LeerEntrada.leerDatos(s);
            for (Dato dato : leidos) {
                String linea = dato.getFecha() + ";"
                        + dato.getNombre() + ";"
                        + dato.getSueldo() + "\n";
                fw.write(linea);
            }
            System.out.println("Ya está, mira el fichero de salida...");
        } catch (IOException e) {
            System.err.println("Fichero no encontrado");
        }
    }
}
