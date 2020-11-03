import java.util.*;

//Clase para asignar grupos a profesor y alumnos. Los métodos imprimen el mapa de grupos
//para saber que grupo inscribir
public class Asignar{

	static Scanner sc = new Scanner(System.in);

    //Asigna grupo a un alumno
    public void inscMateria(Alumno alumno, Hashtable<String,Grupo> mapDeGrupos){	//asignar materia a almuno, le agregue el parametro de la lista
        if(mapDeGrupos.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Grupo p; 
            String clave;
            Imprimir.printGrup(mapDeGrupos);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa la clave de la materia a inscribir: ");
            clave = sc.nextLine();
            p = mapDeGrupos.get(clave);
            alumno.addGrup(clave);
            p.addAlumno(alumno);
        }
    }

    //Asigna grupo a profesor
    public void asigMateria(Profesor prof, Hashtable<String,Grupo> mapGrups){	//asignar materia a profesor, le agregue el parametro de la lista
        if(mapGrups.isEmpty()){
            System.out.println("No hay grupos disponibles, crea una primero");
        }else{
            Grupo p; 
            String clave;
            Imprimir.printGrup(mapGrups);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa la clave de la asignatura que impartir\u00e1 este profesor: ");
            clave = sc.nextLine();
            System.out.println(" ");
            p = mapGrups.get(clave);
            prof.addGrup(clave);
            p.addProf(prof);    //
        }
    }


}