package ec.com.linkedinlearning.domina.java.c_01_01;

/**
 *
 * @author steve
 */
public class Formato {

    private static final String PREFIJO = "\033[";
    private static final String SUFIJO = "m";
    public static final String RESET = PREFIJO + "0" + SUFIJO;

    private Color color;
    private Decorado decorado;
    private Enfasis enfasis;

    public Formato(Color color, Decorado decorado, Enfasis enfasis) {
        super();
        this.color = color;
        this.decorado = decorado;
        this.enfasis = enfasis;
    }

    public String toString() {
        return PREFIJO + decorado + ";" + enfasis + color;
    }
}
