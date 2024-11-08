package ec.com.linkedinlearning.domina.java.c_01_05;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author steve
 */
public class PersonaTest {

    private Persona yo = new Persona("Mariona", "Nadal Farre",
            LocalDate.of(1980, Month.JULY, 1));
    private Persona tu = new Persona("Mariona", "Nadal Farre",
            LocalDate.of(1980, Month.JULY, 1));

    private Persona pedro = new Persona("Pedro", "Gomez Lopez",
            LocalDate.of(2000, Month.JULY, 23));
    private Persona juan = new Persona("Juan", "Garcia Lopez",
            LocalDate.of(2010, Month.MAY, 4));
    private Persona luz = new Persona("Luz", "Blazquez Lopez",
            LocalDate.of(1963, Month.OCTOBER, 14));

    private Persona pepe = new Persona("Jose", "Ruiz Zaray",
            LocalDate.of(1994, Month.JUNE, 30));
    private Persona pepa = new Persona("Jose", "Ruiz Zaray",
            LocalDate.of(1994, Month.JUNE, 30));

    @Test
    public void coherenciaEqualsTest() {
        assertEquals(yo, tu);
        assertEquals(0, yo.compareTo(pedro));

        assertNotEquals(yo, pedro);
        assertNotEquals(0, yo.compareTo(pedro));
    }

    @Test
    public void coherenciaCadenaTest() {
        assertTrue(pedro.compareTo(juan) > 0);
        assertTrue(juan.compareTo(luz) > 0);
        assertTrue(pedro.compareTo(luz) > 0);
    }
}
