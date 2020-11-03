
package proyectopoo.admin;

import java.util.*;

import proyectopoo.Administracion;
import proyectopoo.admin.*;
import proyectopoo.tiposDeDato.*;
import proyectopoo.utilidades.*;
//Clase que muestra los submenus para cada tipo de objeto 
public class SubMenus{
    static Scanner sc = new Scanner(System.in);    
    //Se agregaron las instancias de las demas clases
    Crear crear = new Crear();
    Eliminar eliminar = new Eliminar();
    Asignar asignar = new Asignar();    

    //Muestra el menú para los alumnos 
	public void admiAlumnos(List<Alumno> listaDeAlumnos, Hashtable<String,Grupo> mapDeGrupos){		//agrego los parametros de lista de alumnos y el mapa de grupos - método de instancia
        int op;
        boolean ban = true;
        
        do{
            System.out.println();
            System.out.println("Submen\u00fa de alumnos");
            System.out.println("1) Crear alumno: ");
            System.out.println("2) Inscribir materia a un alumno: ");
            System.out.println("3) Ver alumnos existentes: ");
            System.out.println("4) Eliminar alumno: ");
            System.out.println("5) Regresar al Men\u00fa Principal : ");
            System.out.print("Su opci\u00f3n es: "); 
            op = sc.nextInt();
            System.out.println(" ");  
            switch (op) {
                case 1:
                    crear.crearAlumno(listaDeAlumnos);  //en cada caso, se manda a llamar el método de la clase correspondiente para una acción especifica
                    break;
                case 2:
                    if(listaDeAlumnos.isEmpty()){  //si no hay alumnos
                        System.out.println("No hay alumnos, primero crea uno");
                        break;
                    }else{
                        int num;
                        Imprimir.printAlum(listaDeAlumnos);   //agrego parametros, toda la coleccion
                        System.out.println();   
                        System.out.print("Ingresa el n\u00famero del alumno al que quieres agregar manterias: ");
                        num = sc.nextInt();
                        System.out.println();   
                        if(listaDeAlumnos.get(num-1).grupos.size() < 3){  //(restriccion) aquí el alumno solo podra tener tres grupos con ayuda del metodo size
                            asignar.inscMateria(listaDeAlumnos.get(num-1), mapDeGrupos);   //se manda a llamar al método que asigna un grupo al alumno
                        
                        }else{
                            System.out.println("Un alumno solo puede estar en tres grupos o menos");    //mensaje en el caso de que se ingresen mas grupos
                        }

                        break;
                    }
                case 3:
                    if(listaDeAlumnos.isEmpty()){
                         System.out.println("No hay alumnos");  //agrego un if para que se imprima esto si no hay alumnos
                        break;
                    }else{
                        Imprimir.printAlumT(listaDeAlumnos);  //agrago parametro, toda la coleccion
                        break;
                    }
                case 4:
                    eliminar.eliminarAlum(listaDeAlumnos); 
                    break;
                case 5:
                    ban = false;
                    break;
            
                default:
                    System.out.println("opci\u00f3n no v\u00e1lida");
                    break;
            }
        }while(ban);
    }
    //Muestra el menú de grupos     
    public void admiGrup(Hashtable <String,Grupo> mapGrups, List<Profesor> listaDeProfesores,
    List<Asignatura> listaDeAsignaturas){	///los parametros recibidos se tratatn de las colecciones principales
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de Grupos");
            System.out.println("1) Crear grupo: ");
            System.out.println("2) Ver grupos existentes: ");
            System.out.println("3) Eliminar grupo: ");
            System.out.println("4) Regresar al Men\u00fa Principal : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");   
            switch (op) {
                case 1:
                    crear.crearGrup(mapGrups, listaDeProfesores,listaDeAsignaturas);   
                    break;
                case 2:
                	if(mapGrups.isEmpty()){
                         System.out.println("No hay grupos");  //agrego un if para que se imprima esto si no hay grupos
                        break;
                    }else{
                        Imprimir.printGrupT(mapGrups);  //se imprimiran los grupos
                        break;
                    }
                case 3:
                	eliminar.eliminarGrup( mapGrups ); 
                    break;
                case 4:
                    ban = false;
                    break;
            
                default:
                    System.out.println("opci\u00f3n no v\u00e1lida");
                    break;
            }
        }while(ban);
    }

    //Muestra el menú de profesores
    public void admiProf(List<Profesor> listaDeProfesores, Hashtable<String,Grupo> mapGrups){		//agrego los parametros colecciones para trabajar con ellas -- método de instancia
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de profesores");
            System.out.println("1) Crear Profesor: ");
            System.out.println("2) Asignar materia a profesor: ");
            System.out.println("3) Ver profesores existentes: ");
            System.out.println("4) Eliminar profesor: ");
            System.out.println("5) Regresar al Men\u00fa Principal : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");    
            switch (op) {
                case 1:
                    crear.crearProf(listaDeProfesores);   
                    break;
                case 2:
                    if(listaDeProfesores.isEmpty()){
                        System.out.println("No hay profesores, primero crea uno");  //en el caso de que no haya profesores
                        break;
                    }else{
                        int num;
                        Imprimir.printProf(listaDeProfesores);  
                        System.out.println(" ");   
                        System.out.print("Ingresa el n\u00famero del profesor al que quieres asignar una materia: ");
                        num = sc.nextInt();
                        System.out.println(" "); 
                        asignar.asigMateria(listaDeProfesores.get(num-1), mapGrups);  
                        break;
                    }
                case 3:
                	if(listaDeProfesores.isEmpty()){
                         System.out.println("No hay profesores");  //agrego un if para que se imprima esto si no hay profesores
                        break;
                    }else{
                        Imprimir.printProfT(listaDeProfesores);  
                        break;
                    }
                case 4:
                    eliminar.eliminarProf(listaDeProfesores);
                    break;
                case 5:
                    ban = false;
                    break;
            
                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");
                    break;
            }
        }while(ban);
    }

    //Muestra el menú de asignaturas
    public void admiAsig(Hashtable<String,Grupo> mapGrus,List<Asignatura> listAsig){ //método de instancia
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de asignaturas");
            System.out.println("1) Crear Asignatura: ");
            System.out.println("2) Ver asignaturas existentes: ");
            System.out.println("3) Eliminar Asignatura: ");
            System.out.println("4) Regresar al Men\u00fa Principal: ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");  
            switch (op) {
                case 1:
                    crear.crearAsignatura(listAsig);   
                    break;
                case 2:
                	if(listAsig.isEmpty()){
                         System.out.println("No hay asignaturas");  //agrego un if para que se imprima esto si no hay asignaturas
                        break;
                    }else{
                        Imprimir.printAsig(listAsig); 
                        break;
                    }
                case 3:
                    eliminar.eliminarAsignatura(listAsig); 
                    break;
                case 4:
                    ban = false;
                    break;
            
                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");	
                    break;
            }
        }while(ban);
    }


}