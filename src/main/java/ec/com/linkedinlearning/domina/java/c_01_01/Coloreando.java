package ec.com.linkedinlearning.domina.java.c_01_01;

/**
 *
 * @author steve
 */
public class Coloreando {

    private static final Formato ROJO = new Formato(Color.ROJO, Decorado.NORMAL, Enfasis.NORMAL);

    public static void main(String[] args) {
        System.out.println("Coloreando...");
        System.out.println(ROJO + "en rojo" + Formato.RESET);
        System.out.println("");
    }
}
