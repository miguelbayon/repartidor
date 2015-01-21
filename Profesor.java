import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Clase Profesor
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class Profesor
{
    // Almacena los evaluadores registrados hasta el momento
    private ArrayList<Evaluador> evaluadores;
    // Almacena las propuestas registradas hasta el momento
    private ArrayList<String> propuestas;
    
    /**
     * Constructor de la clase Profesor
     */
    public Profesor()
    {
        evaluadores = new ArrayList<>();
        propuestas = new ArrayList<>();        
    }
    
    /**
     * Registra un nuevo evaluador
     */
    public void registrarEvaluador(String nombre)
    {
        Evaluador nuevoEvaluador = new Evaluador(nombre);
        evaluadores.add(nuevoEvaluador);
    }
    
    /**
     * Registra una nueva propuesta
     */
    public void registrarPropuesta(String nombre)
    {
        propuestas.add(nombre);
    }
    
    /**
     * Reparte las propuestas registradas entre los evaluadores existentes
     * Desordena aleatoriamente las propuestas y las asigna en orden una a una a cada evaluador.
     * Si cuando termina todos los evaluadores tienen el minimo especificado de
     * propuestas a evaluador, entonces termina. Si hay evaluadores sin el
     * minimo de propuestas elige propuestas aleatorias y se las asigna hasta
     * que estén completos. Si repartido el minimo de propuestas a los evaluadores
     * hay propuestas que nadie evalua se reparten en orden desde el primero al ultimo
     * en ronda.
     */
    public void repartir()
    {
        int numeroMinimoDePropuestasPorEvaluador = 3;
        int numeroEvaluadores = evaluadores.size();
        int numeroPropuestas = propuestas.size();
        int contador = 0;
        int indiceDelEvaluadorAUsar = 0;
        int indicePropuestaAAsignar = 0;
        Evaluador evaluadorAUsar = null;
        
        Collections.shuffle(propuestas);
        
        // Repartimos a cada evaluador tantas propuestas como el numero minimo de propuestas
        // a repartir
        while (contador < (numeroEvaluadores * numeroMinimoDePropuestasPorEvaluador)) {

            indiceDelEvaluadorAUsar = contador % numeroEvaluadores;
            evaluadorAUsar = evaluadores.get(indiceDelEvaluadorAUsar);
            Random aleatorio = new Random();
           
            if (contador <  numeroPropuestas) {
                indicePropuestaAAsignar = contador;
            }
            else {
                indicePropuestaAAsignar = aleatorio.nextInt(numeroPropuestas);    
            }
            
            evaluadorAUsar.asignarPropuesta(propuestas.get(indicePropuestaAAsignar));            
           
            contador++;
        }     
        
        // En caso de que hubiera propuestas que no se hayan repartido aun...
        if (contador < numeroPropuestas) {            
            
            // Repartimos las propuestas que queden una a cada evaluador
            indiceDelEvaluadorAUsar = 0;
            while (contador < numeroPropuestas) {
                
                indicePropuestaAAsignar = contador;
                evaluadorAUsar = evaluadores.get(indiceDelEvaluadorAUsar);
                evaluadorAUsar.asignarPropuesta(propuestas.get(indicePropuestaAAsignar));   
                
                indiceDelEvaluadorAUsar++;
                if (indiceDelEvaluadorAUsar == numeroEvaluadores) {
                    indiceDelEvaluadorAUsar = 0;
                }
           
                contador++;
            }
        }
        
    }
    
    /** 
     * Muestra por pantalla el reparto
     */
    public void mostrarReparto()
    {
        for (Evaluador evaluador : evaluadores) {
            evaluador.mostrarPropuestas();
        }
    }
 
}
























