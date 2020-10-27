import java.util.HashSet;

public class Alumno{
    static int numeroAlumnos = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    HashSet<String> grupos = new HashSet<>();
    
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
    public void addGrup(String materia){
        grupos.add(materia);
    }
    public void removeGrup(String materia){
        this.grupos.remove(materia);
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
        Grupo temp;
        for(String clave:this.grupos){
            temp = Administracion.grupMap.get(clave);
            temp.removeAlumno(this);
        }
    }

    public void print(){
        System.out.printf("Nombre: %s %s.   Numero de cuenta: %d %n", this.nombre,this.apellidoP,this.numeroCuenta);
    }

    public void printT(){
        System.out.printf("Nombre: %s %s.   Numero de cuenta: %d. Edad: %d %n", this.nombre,this.apellidoP,
        this.numeroCuenta,this.edad);
        this.direccion.print(); //imprime la direccion
        System.out.println("Clave de asignaturas inscritas:");
        Grupo temp;
        for(String iterador:this.grupos){
            temp = Administracion.grupMap.get(iterador);
            temp.print();
        }

    }
}