
package EjsB;

public class Profesor extends Persona{
    
    double Salario;
    String especialidad;

    public Profesor(String nom, String ape, String fnac, double sal, String esp) {
        super(nom, ape, fnac);
        Salario = sal;
        especialidad = esp;
    }

}
