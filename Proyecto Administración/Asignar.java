import java.util.*;

public class Asignar{

	static Scanner sc = new Scanner(System.in);


	 static void inscMateria(Alumno alumno, List<Asignatura> listaDeAsignaturas){	//asignar materia a almuno, le agregue el parametro de la lista
        if(listaDeAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Asignatura p; 
            int indice;
            Imprimir.printAsig(listaDeAsignaturas);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero de la materia a inscribir: ");
            indice = sc.nextInt();
            p = listaDeAsignaturas.get(indice-1);
            alumno.addAsig(p);
            p.addAlumno(alumno);
        }
    }

    static void asigMateria(Profesor prof, List<Asignatura> listaDeAsignaturas){	//asignar materia a profesor, le agregue el parametro de la lista
        if(listaDeAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Asignatura p; 
            int indice;
            Imprimir.printAsig(listaDeAsignaturas);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero de la asignatura que impartir\u00e1 este profesor: ");
            indice = sc.nextInt();
            System.out.println(" ");
            p = listaDeAsignaturas.get(indice);
            p.addProf(prof);
            prof.addAsig(p);
        }
    }


}