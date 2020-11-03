import java.util.*;

//Métodos para la impresión de la información de las colecciones principales del main.
//Son static ya que se requieren en varias partes del programa y es más fácil llamarlos 
//de esta manera.
public class Imprimir{

    //Imprime la lista de alumnos
    static void printAlum(List<Alumno> listaDeAlumnos){    //recibira parametros
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }
    
    //Imprime la lista de alumnos con todos los detalles
    static void printAlumT(List<Alumno> listaDeAlumnos){   //recibira parametros
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
            System.out.println(" ");    //agregue un espaciado
        }
        
    }

    //Imprime el mapa de grupos
    static void printGrup(Hashtable<String,Grupo> mapDeGrupos){   //agrego parametro
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); 
        
        while (claves.hasMoreElements()){
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave);
            System.out.print((clave)+".- ");
            valor.print();
            System.out.println(" ");    //agregue un espaciado
        }
        
        System.out.println(" ");    //agregue un espaciado
    }

    //Imprime el mapa de grupos con más detalles
    static void printGrupT(Hashtable<String,Grupo> mapDeGrupos){   //agrego parametro
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); 
        
        while (claves.hasMoreElements()){
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave);
            System.out.print((clave)+".- ");
            valor.printT();
            System.out.println(" ");    //agregue un espaciado
        }

        System.out.println(" ");    //agregue un espaciado
    }

    //Imprime la lista de profesores
    static void printProf(List<Profesor> listaDeProfesores){    //agrego parametro
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);
            System.out.print((i+1)+".- ");
            p.print();
            System.out.println(" ");    //agregue un espaciado
        }
    }

    //Imprime la lista de profesores con más detalles
    static void printProfT(List<Profesor> listaDeProfesores){   //agrego parametro
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
            System.out.println(" ");    //agregue un espaciado
        }
    }

    //Imprime la lista de asignaturas
    static void printAsig(List<Asignatura> listaDeAsignaturas){
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.print();
            System.out.println(" ");    //agregue un espaciado
        }
    }

    //Imprime la lista de asignaturas con un poco más de detalles
    static void printAsigT(List<Asignatura> listaDeAsignaturas){
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
            System.out.println(" ");    //agregue un espaciado
        }
    }
}