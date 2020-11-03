import java.util.*;

//Métodos para la impresión de la información de las colecciones principales del main.
//Son static ya que se requieren en varias partes del programa y es más fácil llamarlos 
//de esta manera.
public class Imprimir{

    //Imprime la lista de alumnos
    static void printAlum(List<Alumno> listaDeAlumnos){    //recibe coleccion lista
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);   //crea un alumno auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.print((i+1)+".- ");
            p.print();
        }
    }
    
    //Imprime la lista de alumnos con todos los detalles
    static void printAlumT(List<Alumno> listaDeAlumnos){   ////recibe coleccion lista
        for(int i = 0; i < listaDeAlumnos.size(); i++){
            Alumno p = listaDeAlumnos.get(i);
            System.out.print((i+1)+".- ");
            p.printT();     //crea un alumno auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.println(" ");    
        }
        
    }

    //Imprime el mapa de grupos
    static void printGrup(Hashtable<String,Grupo> mapDeGrupos){  ////recibe coleccion mapa
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); //se crea un objeto enumerarion para recorrer el mapa de grupos, pues no es iterable
        
        while (claves.hasMoreElements()){   //mientras aun haya claves por recorrer...
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave); //con la clave se obtiene a un grupo en una variable grupo auxiliar para poder imprimir su informacion desde 
            System.out.print((clave)+".- ");        //los metodos de este objeto
            valor.print();
            System.out.println(" ");    
        }
        
        System.out.println(" ");   
    }

    //Imprime el mapa de grupos con más detalles
    static void printGrupT(Hashtable<String,Grupo> mapDeGrupos){   ////recibe coleccion mapa
        String clave;
        Grupo valor;
        Enumeration <String> claves = mapDeGrupos.keys(); //se crea un objeto enumerarion para recorrer el mapa de grupos, pues no es iterable
        
        while (claves.hasMoreElements()){   //mientras aun haya claves por recorrer...
            clave = claves.nextElement();
            valor = mapDeGrupos.get(clave);     //con la clave se obtiene a un grupo en una variable grupo auxiliar para poder imprimir su informacion desde 
            System.out.print((clave)+".- ");         //los metodos de este objeto
            valor.printT();
            System.out.println(" ");   
        }

        System.out.println(" ");    
    }

    //Imprime la lista de profesores
    static void printProf(List<Profesor> listaDeProfesores){    ////recibe coleccion lista
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);   //crea un profesor auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.print((i+1)+".- ");
            p.print();
            System.out.println(" ");   
        }
    }

    //Imprime la lista de profesores con más detalles
    static void printProfT(List<Profesor> listaDeProfesores){ ////recibe coleccion lista
        for(int i = 0; i < listaDeProfesores.size(); i++){
            Profesor p =    listaDeProfesores.get(i);   //crea un profesor auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.print((i+1)+".- ");
            p.printT();
            System.out.println(" ");    
        }
    }

    //Imprime la lista de asignaturas
    static void printAsig(List<Asignatura> listaDeAsignaturas){     ////recibe coleccion lista
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);   //crea una asignatura auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.print((i+1)+".- ");
            p.print();
            System.out.println(" ");   
        }
    }

    //Imprime la lista de asignaturas con un poco más de detalles
    static void printAsigT(List<Asignatura> listaDeAsignaturas){    ////recibe coleccion lista
        for(int i = 0; i < listaDeAsignaturas.size(); i++){
            Asignatura p = listaDeAsignaturas.get(i);   //crea una asignatura auxiliar para poder usar los métodos de dicho objeto en la impresion de datos
            System.out.print((i+1)+".- ");
            p.printT();
            System.out.println(" ");   
        }
    }
}