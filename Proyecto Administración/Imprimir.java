import java.util.*;

public class Imprimir{

    static void printAlum(List<Alumno> listaDeAlumnos){    //recibira parametros
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }
    
    static void printAlumT(List<Alumno> listaDeAlumnos){   //recibira parametros
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
        System.out.println(" ");    //agregue un espaciado
    }

    static void printGrup(List<Grupo> listaDeAsignaturas){    //agrego el parametro
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Grupo p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }

    }
    static void printAsigT(List<Grupo> listaDeAsignaturas){   //agrego parametro
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Grupo p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
        System.out.println(" ");    //agregue un espaciado
    }

    static void printProf(List<Profesor> listaDeProfesores){    //agrego parametro
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }

    static void printProfT(List<Profesor> listaDeProfesores){   //agrego parametro
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
        System.out.println(" ");    //agregue un espaciado
    }


}