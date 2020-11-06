
package proyectopoo.tiposDeDato;

import java.util.List;
import java.util.ArrayList;

import proyectopoo.Administracion;
import proyectopoo.admin.*;
import proyectopoo.tiposDeDato.*;
import proyectopoo.utilidades.*;

//Clase que define a los objetos grupo
public class Grupo {    //eliminacion del atributo 'nombre'
    List<Alumno> inscritos = new ArrayList<>();
    Profesor encargado;
    String clave;
    Asignatura asignatura;
   
    //Crea un grupo con todos sus atrubutos menos los alumnos inscritos
    public Grupo(Profesor prof,String clave,Asignatura asignatura ){    //eliminacion del parametro 'nombre'
        this.encargado = prof;
        this.clave = clave;
        this.asignatura = asignatura;
    }

   //Agrega un alumno a la lista de inscritos 
    public void addAlumno(Alumno alumno){
        this.inscritos.add(alumno);

    }

    //Elimina un alumno de la lista de inscritos
    public void removeAlumno(Alumno alumno){
        this.inscritos.remove(alumno);
    }

    //Remueve al profesor del atributo profesor
    public void removeProf(){
        this.encargado = null;
    }

    //Agrega un profesor al atributo del profesor 
    public void addProf(Profesor prof){
        this.encargado = prof;
    }
    //Agrega una asignatura
    public void addAsig(Asignatura asig){
        this.asignatura = asig;
    }
    //Elimina una asignatura
    public void removeAsig(){
        this.asignatura = null;
    }

    //Eliminación del método printAll

    //Se imprime una versión resumida de los atrubutos
    public void print(){
        System.out.printf("Clave: %s %n", this.clave);
        System.out.printf("Asignatura: %s %n", this.asignatura.nombre);
        System.out.print("Profesor: ");
        if(this.encargado!=null)
        {
            this.encargado.print();
        }
    }
    
    //Se imprime toda la información de los grupos
    public void printT(){
        System.out.printf("Clave: %s %n", this.clave);
        System.out.print("Profesor: ");
        this.encargado.print();
        System.out.printf("Asignatura: %s %n", this.asignatura.nombre);
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

