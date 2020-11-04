import java.util.*;

//Clase para asignar grupos a profesor y alumnos. Los métodos imprimen el mapa de grupos
//para saber que grupo inscribir
public class Asignar{

	static Scanner sc = new Scanner(System.in);

    //Asigna grupo a un alumno
    public void inscMateria(Alumno alumno, Hashtable<String,Grupo> mapDeGrupos){	//estos metodos reciben colecciones para poder trabajar y un objeto de tipo alumno o profesor
        if(mapDeGrupos.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Grupo p; 
            String clave;
            Imprimir.printGrup(mapDeGrupos);   
            System.out.println("");	
            System.out.print("Ingresa la clave del grupo a inscribir: ");       //se crea una variable auxiliar grupo para poder 
            clave = sc.nextLine();                                              //guardar la info del map y editar ese grupo existente 
            p = mapDeGrupos.get(clave);                                         //con el alumno inscrito y actualizar el grupo en el map
            alumno.addGrup(clave);
            p.addAlumno(alumno);
            mapDeGrupos.replace(clave,p);   //de esta manera se actualiza, en el mapa de grupos, el grupo con el nuevo alumno
        }
    }

    //Asigna grupo a un profesor
    public void asigMateria(Profesor prof, Hashtable<String,Grupo> mapGrups){	//estos metodos reciben colecciones para poder trabajar y un objeto de tipo alumno o profesor
        if(mapGrups.isEmpty()){
            System.out.println("No hay grupos disponibles, crea una primero");
        }else{
            Grupo p; 
            String clave;
            Imprimir.printGrup(mapGrups);   
            System.out.println("");	
            System.out.print("Ingresa la clave del grupo en donde impartir\u00e1 clase este profesor: ");
            clave = sc.nextLine();
            System.out.println(" ");            //se crea una variable auxiliar grupo para poder 
            p = mapGrups.get(clave);            //guardar la info del map y editar ese grupo existente 
            prof.addGrup(clave);                //con el profesor asociado y después actualizar el grupo en el map
            p.addProf(prof);    
            mapGrups.replace(clave,p);   //de esta manera se actualiza, en el mapa de grupos, el grupo con el nuevo profesor
        
        }
    }


}