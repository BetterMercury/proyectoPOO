public class Profesor {
    static int numeroProf = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    Grupo grupo;

    
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

    public void addGrup(Grupo asig){
        this.grupo = asig;
    }

    public void removeGrup(){
        this.grupo=null;
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
    }

    public void printT(){
        System.out.printf("Nombre: %s  %s. Numero de cuenta: %d. Edad: %d %n", this.nombre,this.apellidoP,
            this.numeroCuenta,this.edad);
        this.direccion.print();
        if(this.grupo != null){
            this.grupo.print();
        }
    }

    public void eliminar(){
        if(grupo != null){
            this.grupo.removeProf();
        }
        Administracion.profList.remove(this);
    }
  
}