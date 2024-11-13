package ec.com.linkedinlearning.domina.java.c_01_07;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author steve
 */
public class PersonasNulas {

    public static void main(String[] args) {
        Persona pepete = new Persona("Pepe", LocalDate.of(2000, Month.JANUARY, 1));
        System.out.println(pepete.getNombre());
        System.out.println(pepete.getFechaNacimiento().getYear());

        Persona inutil = null;
        System.out.println(inutil.getNombre());
        System.out.println(inutil.getFechaNacimiento().getYear());
    }

}
