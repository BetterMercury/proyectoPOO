import java.util.*;

public class Eliminar{

    static Scanner sc = new Scanner(System.in); //variable para ingresar datos

    static void eliminarAlum(List<Alumno> listaDeAlumnos){ //agrego parametro list
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
    
    static void eliminarProf(List<Profesor> listaDeProfesores){ //agrego el parametro
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


    static void eliminarGrup(List<Grupo> listaDeGrupos){ //agrego el parametro
        if(listaDeGrupos.isEmpty()){
            System.out.println("No hay grupos");
        }else{
            Grupo eliminar;
            int indice;
            Imprimir.printGrup(listaDeGrupos);   //agrego el parametro
            System.out.println("Ingresa el n\u00famero del grupo a eliminar");
            indice = sc.nextInt();
            eliminar = listaDeGrupos.get(indice-1);
            eliminar.eliminar();
        }
    }


}