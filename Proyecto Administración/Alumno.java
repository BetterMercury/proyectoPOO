import java.util.List;
import java.util.ArrayList;

public class Alumno{
    static int numeroAlumnos = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    List<Asignatura> asignaturas = new ArrayList<>();
    
    public Alumno(String nombre, String apellidoP, String apellidoM, int edad, long numeroCuenta,
        Direccion direccion){
        
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
        numeroAlumnos++;
    }
    public void addAsig(Asignatura materia){
        asignaturas.add(materia);
    }
    public void removeAsig(Asignatura materia){
        this.asignaturas.remove(materia);
    }
    public int buscar (){
        for(int i = 0; i < Administracion.alumnosList.size(); i++){
            Alumno p = Administracion.alumnosList.get(i);
            if (p.numeroCuenta == this.numeroCuenta){
                return i;
            }
        }
        return -1;
    }
    public void eliminar(){
        Administracion.alumnosList.remove(this);
        for(int i=0; i<this.asignaturas.size();i++){
            Asignatura p = this.asignaturas.get(i);
            p.removeAlumno(this);
        }
    }

    public void print(){
        System.out.printf("Nombre: %s %s.   Numero de cuenta: %d %n", this.nombre,this.apellidoP,this.numeroCuenta);
    }

    public void printT(){
        System.out.printf("Nombre: %s %s.   Numero de cuenta: %d. Edad: %d %n", this.nombre,this.apellidoP,
        this.numeroCuenta,this.edad);
        this.direccion.print(); //imprime la direccion
        System.out.println("Asignaturas inscritas:");
        for(int i=0; i<this.asignaturas.size();i++){
            Asignatura p = this.asignaturas.get(i);
            p.print();
        }

    }
}