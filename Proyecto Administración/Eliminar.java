import java.util.*;

public class Eliminar{

    static Scanner sc = new Scanner(System.in); //variable para ingresar datos

    public void eliminarAlum(List<Alumno> listaDeAlumnos){ //agrego parametro list -- metodo de instancia
        if(listaDeAlumnos.isEmpty()){
            System.out.println("No hay alumnos");
        }else{
            Alumno eliminar;
            int indice;
            Imprimir.printAlum(listaDeAlumnos);   //agrego el parametro
            System.out.println(" ");    //espaciado
            System.out.print("Ingresa el n\u00famero del alumno a eliminar: ");  //modifico como se ve
            indice = sc.nextInt();
            eliminar = listaDeAlumnos.get(indice-1);    //eliminar es un alumno
            eliminar.eliminar();
        }
    }
    
    public void eliminarProf(List<Profesor> listaDeProfesores){ //agrego el parametro -- metodo de instancia
        if(listaDeProfesores.isEmpty()){
            System.out.println("No hay profesores");
        }else{
            Profesor eliminar;
            int indice;
            Imprimir.printProf(listaDeProfesores);   //agrego el parametro
            System.out.println("Ingresa el n\u00famero del profesor a eliminar");
            indice = sc.nextInt();
            eliminar = listaDeProfesores.get(indice-1);
            eliminar.eliminar();
        }
    }


    public void eliminarGrup(Hashtable<String,Grupo> mapDeGrups){ //agrego el parametro -- metodo de instancia
        if(mapDeGrups.isEmpty()){
            System.out.println("No hay grupos");
        }else{
                //elimino una linea que pide datos sin usar
            Grupo eliminar;
            String clave;
            Imprimir.printGrup(mapDeGrups);   //agrego el parametro
            System.out.println("Ingresa el la clave del grupo a eliminar");
            clave = sc.nextLine();
            eliminar = mapDeGrups.get(clave);
            eliminar.eliminar();
        }
    }

    public void eliminarAsignatura(List<Asignatura> listAsig){ //agrego parametro list -- metodo de instancia
        if(listAsig.isEmpty()){
            System.out.println("No hay asignaturas");
        }else{
            Asignatura eliminar;
            int indice; 
            Imprimir.printAsig(listAsig);   //agrego el parametro
            System.out.println(" ");    //espaciado
            System.out.print("Ingresa el n\u00famero de la asignatura a eliminar: ");  //modifico como se ve
            indice = sc.nextInt();
            eliminar = listAsig.get(indice-1);    //eliminar es una asignatura
            eliminar.eliminar();
        }
    }




}