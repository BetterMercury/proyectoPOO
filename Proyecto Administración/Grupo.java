import java.util.List;
import java.util.ArrayList;

public class Grupo {
    String nombre;
    List<Alumno> inscritos = new ArrayList<>();
    Profesor encargado;
    String clave;
    Asignatura asignatura;
   
    public Grupo(String nombre,Profesor prof,String clave,Asignatura asignatura ){
        this.nombre = nombre;  
        this.encargado = prof;
        this.clave = clave;
        this.asignatura = asignatura;
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
    public void addAsig(Asignatura asig){
        this.asignatura = asig;
    }
    public void removeAsig(){
        this.asignatura = null;
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


    public void eliminar(){
        Administracion.grupMap.remove(this.clave);
        for(int i=0; i<this.inscritos.size();i++){
            Alumno p = this.inscritos.get(i);
            p.removeGrup(this.clave);
        }
        
    }
            
}

