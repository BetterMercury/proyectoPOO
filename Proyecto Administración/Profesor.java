import java.util.HashSet;

public class Profesor {
    static int numeroProf = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    String grupo;
    HashSet<String> grupos = new HashSet<>();   //agregue un set de grupos para el profesor

    
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

    public void addGrup(String asig){
        grupos.add(asig);
    }

    public void removeGrup(String asig){
        this.grupos.remove(asig);
    }

    public int buscar (){
        for(int i = 0; i < Administracion.profList.size(); i++){
            Profesor p = Administracion.profList.get(i);
            if (p.numeroCuenta == this.numeroCuenta){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        System.out.printf("Nombre: %s  %s. Numero de cuenta: %d %n", this.nombre,this.apellidoP,this.numeroCuenta);
        Grupo temp;
        for(String iterador:this.grupos){
            temp = Administracion.grupMap.get(iterador);
            temp.printT();
        }

    }

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

    public void eliminar(){
        if(grupo != null){
            Grupo temp;
            temp = Administracion.grupMap.get(this.grupo);
            temp.removeProf();
        }
        Administracion.profList.remove(this);
    }
  
}