import java.util.HashSet;

//Clase que define a los objetos profesor
public class Profesor {
    static int numeroProf = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    HashSet<String> grupos = new HashSet<>();   //agregue un set de grupos para el profesor

    //Crea un profesor con todos sus atributos menos los grupos que imparte
    public Profesor(String nombre, String apellidoP, String apellidoM, int edad, long numeroCuenta,
        Direccion direccion){
        
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
        numeroProf++;
    }

    //Agrega un grupo al conjunto de grupos que imparte el profesor 
    public void addGrup(String asig){
        grupos.add(asig);
    }

    //Remueve un grupo del conjunto de grupos que importe un profesor
    public void removeGrup(String asig){
        this.grupos.remove(asig);
    }

    //Busca un profesor en la lista principal de profesores y devuelve su posición. Si no está,
    //devuelve -1
    public int buscar (){
        for(int i = 0; i < Administracion.profList.size(); i++){
            Profesor p = Administracion.profList.get(i);
            if (p.numeroCuenta == this.numeroCuenta){
                return i;
            }
        }
        return -1;
    }
    //Imprime una versión resumida de los datos del profesor 
    public void print(){
        System.out.printf("Nombre: %s  %s. Numero de cuenta: %d %n", this.nombre,this.apellidoP,this.numeroCuenta);
        Grupo temp;
        

    }
    //Imprime toda la información del profesor 
    public void printT(){
        System.out.printf("Nombre: %s  %s. Numero de cuenta: %d. Edad: %d %n", this.nombre,this.apellidoP,
            this.numeroCuenta,this.edad);
        this.direccion.print();
        
        Grupo temp;
        for(String iterador:this.grupos){
            temp = Administracion.grupMap.get(iterador);    
            temp.printT();
        }
    }

    //Elimina al profesor de la lista principal de grupos y de todos los grupos que tenha
    //asignado
    public void eliminar(){
    for (String grupo : grupos)
        if(grupo != null){
            Grupo temp;
            temp = Administracion.grupMap.get(grupo);
            temp.removeProf();
        }
        Administracion.profList.remove(this);
    }
  
}