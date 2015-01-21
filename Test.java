
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public Test() 
    {
    }
    
    public void test1() 
    {
        Profesor profesor = new Profesor();

        profesor.registrarEvaluador("Miguel");
        profesor.registrarEvaluador("Juan");
        profesor.registrarEvaluador("Maria");
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        profesor.registrarPropuesta("8");
        profesor.registrarPropuesta("9"); 
        
        profesor.repartir();
        profesor.mostrarReparto();        
    }
    
    public void test2() 
    {
        Profesor profesor = new Profesor();

        profesor.registrarEvaluador("Miguel");
        profesor.registrarEvaluador("Juan");
        profesor.registrarEvaluador("Maria");
        profesor.registrarEvaluador("Rosa");
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        profesor.registrarPropuesta("8");
        profesor.registrarPropuesta("9"); 
        
        profesor.repartir();
        profesor.mostrarReparto();        
    }
    
    
    public void test3() 
    {
        Profesor profesor = new Profesor();

        profesor.registrarEvaluador("Miguel");
        profesor.registrarEvaluador("Juan");
        profesor.registrarEvaluador("Maria");        
        
        profesor.registrarPropuesta("1");
        profesor.registrarPropuesta("2");
        profesor.registrarPropuesta("3");
        profesor.registrarPropuesta("4");
        profesor.registrarPropuesta("5");
        profesor.registrarPropuesta("6");
        profesor.registrarPropuesta("7");
        profesor.registrarPropuesta("8");
        profesor.registrarPropuesta("9"); 
        profesor.registrarPropuesta("10");
        profesor.registrarPropuesta("11");         
        
        profesor.repartir();
        profesor.mostrarReparto();        
    }    
    
}
