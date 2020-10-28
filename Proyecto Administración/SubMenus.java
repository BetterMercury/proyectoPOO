import java.util.*;

public class SubMenus{

	static Scanner sc = new Scanner(System.in);

	static void admiAlumnos(List<Alumno> listaDeAlumnos, Hashtable<String,Grupo> mapDeGrupos){		//agrego los parametros de lista de alumnos y lista de asignaturas
        int op;
        boolean ban = true;
        
        do{
            System.out.println();
            System.out.println("Submen\u00fa de alumnos");
            System.out.println("1) Crear alumno: ");
            System.out.println("2) Inscribir materia a un alumno: ");
            System.out.println("3) Ver alumnos existentes: ");
            System.out.println("4) Eliminar alumno: ");
            System.out.println("5) Salir : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");    //agregue un espaciado
            switch (op) {
                case 1:
                    Crear.crearAlumno(listaDeAlumnos);  //agrego el parametro
                    break;
                case 2:
                    if(listaDeAlumnos.isEmpty()){  //si no hay alumnos
                        System.out.println("No hay alumnos, primero crea uno");
                        break;
                    }else{
                        int num;
                        Imprimir.printAlum(listaDeAlumnos);   //agrego parametros, toda la coleccion
                        System.out.println();   //agrego espaciado
                        System.out.print("Ingresa el n\u00famero del alumno al que quieres agregar manterias: ");
                        num = sc.nextInt();
                        System.out.println();   //agrego espaciado
                        Asignar.inscMateria(listaDeAlumnos.get(num-1), mapDeGrupos);    //manda al alumno junto con su indice // ya tiene parametro solo falta el asigList
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
                    Eliminar.eliminarAlum(listaDeAlumnos); //agrego el parametro
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
    
    static void admiGrup(Hashtable <String,Grupo> mapGrups, List<Profesor> listaDeProfesores,
    List<Asignatura> listaDeAsignaturas){	//agrego los parametros lista de asignaturasde y lista de profesores 
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de Grupos");
            System.out.println("1) Crear grupo: ");
            System.out.println("2) Ver grupos existentes: ");
            System.out.println("3) Eliminar grupo: ");
            System.out.println("4) Salir : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");    //agregue un espaciado
            switch (op) {
                case 1:
                    Crear.crearGrup(mapGrups, listaDeProfesores,listaDeAsignaturas);    //agrego los dos parametros
                    break;
                case 2:
                	if(mapGrups.isEmpty()){
                         System.out.println("No hay grupos");  //agrego un if para que se imprima esto si no hay alumnos
                        break;
                    }else{
                        Imprimir.printGrupT(mapGrups);  //se imprimiran las asignaturas. agrego parametros
                        break;
                    }
                case 3:
                	Eliminar.eliminarGrup( mapGrups ); //agrego el parametro
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

    static void admiProf(List<Profesor> listaDeProfesores, Hashtable<String,Grupo> mapGrups){		//agrego los parametros lista de profesores y lista de asignaturas
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de profesores");
            System.out.println("1) Crear Profesor: ");
            System.out.println("2) Asignar materia a profesor: ");
            System.out.println("3) Ver profesores existentes: ");
            System.out.println("4) Eliminar profesor: ");
            System.out.println("5) Salir : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");    //agregue un espaciado
            switch (op) {
                case 1:
                    Crear.crearProf(listaDeProfesores);    //agrego el parametro
                    break;
                case 2:
                    if(listaDeProfesores.isEmpty()){
                        System.out.println("No hay profesores, primero crea uno");
                        break;
                    }else{
                        int num;
                        Imprimir.printProf(listaDeProfesores);   //agrego parametro
                        System.out.println(" ");    //agregue un espaciado
                        System.out.print("Ingresa el n\u00famero del profesor al que quieres asignar una materia: ");
                        num = sc.nextInt();
                        System.out.println(" "); //espaciado
                        Asignar.asigMateria(listaDeProfesores.get(num-1), mapGrups);   //ya tiene el parametro, solo le coloco la clase al principio Asignar.asigMateria() y el otro parametro asigList
                        break;
                    }
                case 3:
                	if(listaDeProfesores.isEmpty()){
                         System.out.println("No hay profesores");  //agrego un if para que se imprima esto si no hay alumnos
                        break;
                    }else{
                        Imprimir.printProfT(listaDeProfesores);  //agrego parametro
                        break;
                    }
                case 4:
                    Eliminar.eliminarProf(listaDeProfesores); //agrego el parametro
                    break;
                case 5:
                    ban = false;
                    break;
            
                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");	//correccion del acento
                    break;
            }
        }while(ban);
    }

    static void admiAsig(Hashtable<String,Grupo> mapGrus,List<Asignatura> listAsig){
        int op;
        boolean ban = true;
        do{
        	System.out.println();
        	System.out.println("Submen\u00fa de asignaturas");
            System.out.println("1) Crear Asignatura: ");
            System.out.println("2) Ver asignaturas existentes: ");
            System.out.println("3) Eliminar Asignatura: ");
            System.out.println("4) Salir : ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            System.out.println(" ");    //agregue un espaciado
            switch (op) {
                case 1:
                    Crear.crearAsignatura(listAsig);   
                    break;
                case 2:
                	if(listAsig.isEmpty()){
                         System.out.println("No hay asignaturas");  //agrego un if para que se imprima esto si no hay asignaturas
                        break;
                    }else{
                        Imprimir.printAsig(listAsig);  //agrego parametro
                        break;
                    }
                case 3:
                    Eliminar.eliminarAsignatura(listAsig); //agrego el parametro
                    break;
                case 4:
                    ban = false;
                    break;
            
                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");	//correccion del acento
                    break;
            }
        }while(ban);
    }


}