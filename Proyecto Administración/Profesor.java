public class Profesor {
    static int numeroProf = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    Asignatura asignatura;

    
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

    public void addAsig(Asignatura asig){
        this.asignatura = asig;
    }

    public void removeAsig(){
        this.asignatura=null;
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
        if(this.asignatura != null){
            this.asignatura.print();
        }
    }

    public void eliminar(){
        if(asignatura != null){
            this.asignatura.removeProf();
        }
        Administracion.profList.remove(this);
    }
  
}