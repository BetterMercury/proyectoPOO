import java.util.*;

public class Asignar{

	static Scanner sc = new Scanner(System.in);


	 static void inscMateria(Alumno alumno, List<Grupo> listaDeAsignaturas){	//asignar materia a almuno, le agregue el parametro de la lista
        if(listaDeAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Grupo p; 
            int indice;
            Imprimir.printGrup(listaDeAsignaturas);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero de la materia a inscribir: ");
            indice = sc.nextInt();
            p = listaDeAsignaturas.get(indice-1);
            alumno.addGrup(p);
            p.addAlumno(alumno);
        }
    }

    static void asigMateria(Profesor prof, List<Grupo> listaDeAsignaturas){	//asignar materia a profesor, le agregue el parametro de la lista
        if(listaDeAsignaturas.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Grupo p; 
            int indice;
            Imprimir.printGrup(listaDeAsignaturas);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero de la asignatura que impartir\u00e1 este profesor: ");
            indice = sc.nextInt();
            System.out.println(" ");
            p = listaDeAsignaturas.get(indice);
            p.addProf(prof);
            prof.addGrup(p);
        }
    }


}