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
            System.out.println(" ");    //agregue un espaciado
        }
        
    }

    static void printGrup(Hashtable<String,Grupo> mapDeGrupos){   //agrego parametro
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); 
        
        while (claves.hasMoreElements()){
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave);
            System.out.print((clave)+".- ");
            valor.print();
        }
        
        System.out.println(" ");    //agregue un espaciado
    }
    static void printGrupT(Hashtable<String,Grupo> mapDeGrupos){   //agrego parametro
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); 
        
        while (claves.hasMoreElements()){
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave);
            System.out.print((clave)+".- ");
            valor.printT();
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
    static void printAsig(List<Asignatura> listaDeAsignaturas){
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }
    static void printAsigT(List<Asignatura> listaDeAsignaturas){
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
    }


}