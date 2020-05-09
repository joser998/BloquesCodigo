package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de Inicializacion de Codigo Estatico
    static{
        //Aqui mismo podemos inicializar atributos estaticos o mandar a llamar otros bloques de codigo estaticos
        contadorPersonas = 10;
        //idPersona = 2; //--No podemos utilizar variables no estaticas dentro del bloque static.
        System.out.println("\nEjecucion Bloque Estatico");
    }
    
    /*Bloque no estatico se copia a cada objeto que creemos, es como un constructor de clase pero se ejecuta antes del 
        constructor de la clase. */
    {
        System.out.println("\nEjecucion Bloque no Estatico");
        this.idPersona = ++contadorPersonas; //--Le asignamos la varible contador personas.
    }
    
    public Persona(){
        System.out.println("\nEjecucion del Constructor.");
    }
    
    //Getter idPersona
    public int getidPersona(){
        return idPersona;
    }   
}