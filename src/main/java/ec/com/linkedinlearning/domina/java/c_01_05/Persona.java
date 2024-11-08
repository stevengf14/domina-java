package ec.com.linkedinlearning.domina.java.c_01_05;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Steve
 */
public class Persona implements Comparable<Persona> {

    private static final int IGUALES = 0;
    private static final int ES_MAYOR = 1;
    private static final int ES_MENOR = -1;

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int compareTo(Persona o) {
        if (o == null || !(o instanceof Persona)) {
            return ES_MAYOR;
        }
        Persona otra = (Persona) o;
        int compAp = apellidos.compareTo(otra.apellidos);
        if (compAp != IGUALES) {
            return compAp;
        }

        int compNom = nombre.compareTo(otra.nombre);
        if (compNom != IGUALES) {
            return compNom;
        }

        int compEdad = fechaNacimiento.compareTo(otra.fechaNacimiento);
        return -compEdad; // consideramos menor al de mayor fecha de nacimiento
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, fechaNacimiento, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

}
