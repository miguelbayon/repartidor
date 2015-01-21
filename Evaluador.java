import java.util.ArrayList;

/**
 * Clase Evaluador
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class Evaluador
{
    // Almacena el nombre completo de un evaluador
    private String nombre;
    // Almacena las propuestas asignadas en este momento al evaluador
    private ArrayList<String> propuestasAsignadas;
    
    /**
     * Constructor de la clase Evaluador
     */
    public Evaluador(String nombre)
    {
        this.nombre = nombre;
        propuestasAsignadas = new ArrayList<>();
    }
    
    /**
     * Asigna al evaluador una propuesta
     */
    public void asignarPropuesta(String nombre)
    {
        propuestasAsignadas.add(nombre);
    }
    
    /**
     * Muestra por pantalla el nombre del evaluador con 
     * las propuestas que tiene asignadas
     */
    public void mostrarPropuestas()
    {
        System.out.println("Propuestas asignadas para que las evalue " + nombre);
        for (String propuesta : propuestasAsignadas) {
            System.out.println("- " + propuesta);
        }
    }
 
}
