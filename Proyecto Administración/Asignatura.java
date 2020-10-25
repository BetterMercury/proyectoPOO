import java.util.List;
import java.util.ArrayList;

public class Asignatura {
    String nombre;
    List<Alumno> inscritos = new ArrayList<>();
    Profesor encargado;
    long clave;
   
    public Asignatura(String nombre,Profesor prof,long clave ){
        this.nombre = nombre;  
        this.encargado = prof;
        this.clave = clave;
    }

   
    public void addAlumno(Alumno alumno){
        this.inscritos.add(alumno);

    }

    public void removeAlumno(Alumno alumno){
        this.inscritos.remove(alumno);
    }

    public void removeProf(){
        this.encargado = null;
    }

    public void addProf(Profesor prof){
        this.encargado = prof;
    }
   
    public void printAll(){
        System.out.printf("Nombre: %s. Clave: %s %n",this.nombre, this.clave);
        System.out.print("Profesor: ");
        this.encargado.print();
        System.out.println("Alumnos inscritos");
        for(int i = 0; i < inscritos.size(); i++){
            Alumno p = inscritos.get(i);
            p.print();
        }
    }
    public void print(){
        System.out.printf("Nombre: %s. Clave: %s %n",this.nombre, this.clave);
        System.out.print("Profesor: ");
        if(this.encargado!=null)
        {
            this.encargado.print();
        }
    }
    
    public void printT(){
        System.out.printf("Nombre: %s. Clave: %s %n",this.nombre, this.clave);
        System.out.print("Profesor: ");
        this.encargado.print();
        System.out.println("Alumnos inscritos");
        for(int i=0; i<this.inscritos.size();i++){
            Alumno p = this.inscritos.get(i);
            p.print();
        }
    }

    int buscar (){
        for(int i = 0; i < Administracion.asigList.size(); i++){
            Asignatura p = Administracion.asigList.get(i);
            if (p.clave == this.clave){
                return i;
            }
        }
        return -1;
    }

    public void eliminar(){
        Administracion.asigList.remove(this);
        for(int i=0; i<this.inscritos.size();i++){
            Alumno p = this.inscritos.get(i);
            p.removeAsig(this);
        }
        
    }
            
}

