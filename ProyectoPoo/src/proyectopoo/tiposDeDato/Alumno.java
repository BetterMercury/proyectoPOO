
package proyectopoo.tiposDeDato;

import java.util.HashSet;

import proyectopoo.Administracion;
import proyectopoo.admin.*;
import proyectopoo.tiposDeDato.*;
import proyectopoo.utilidades.*;

public class Alumno{
    static int numeroAlumnos = 0;
    String nombre;
    String apellidoP;
    String apellidoM;
    int edad;
    long numeroCuenta;
    Direccion direccion;
    public HashSet<String> grupos = new HashSet<>();
    
    //Inicianliza todo menos los grupos 
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

    //Añadir grupo al conjunto de grupos
    public void addGrup(String materia){
        //if(materia.length()<3){
            grupos.add(materia);
        //}else{
            
        //}
    }     //si dejo esta instruccion, nunca se añaden los grupos al alumno
    
    //remueve un grupo del conjunto de grupos 
    public void removeGrup(String materia){
        this.grupos.remove(materia);
    }

    //Devuelve la posición de un alumno en la lista principal de alumnos
    public int buscar (){
        for(int i = 0; i < Administracion.alumnosList.size(); i++){
            Alumno p = Administracion.alumnosList.get(i);
            if (p.numeroCuenta == this.numeroCuenta){
                return i;
            }
        }
        return -1;
    }

    //Elimina a un alumno de la lista principal de alumnos y de los grupos a los que esté inscrito
    public void eliminar(){
        Administracion.alumnosList.remove(this);
        Grupo temp;
        for(String clave:this.grupos){
            temp = Administracion.grupMap.get(clave);
            temp.removeAlumno(this);
        }
    }

    //Imprime información resuminda del alumno
    public void print(){
        System.out.printf("Nombre: %s %s.   Numero de cuenta: %d %n", this.nombre,this.apellidoP,this.numeroCuenta);
    }

    //Imprime toda la información del alumno
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