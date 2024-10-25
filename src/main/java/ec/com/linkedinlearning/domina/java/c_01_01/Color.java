package ec.com.linkedinlearning.domina.java.c_01_01;

/**
 *
 * @author steve
 */
public enum Color {

    NEGRO("0"),
    ROJO("1"),
    VERDE("2"),
    AMARILLO("3"),
    AZUL("4"),
    MAGENTA("5"),
    CIAN("6"),
    BLANCO("7");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
