import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map; 
import java.util.TreeMap;

public class Administracion {
    static Scanner sc = new Scanner(System.in);

    static List<Alumno> alumnosList = new ArrayList<>();
    static List<Profesor> profList = new ArrayList<>();
    static List<Asignatura> asigList = new ArrayList<>();
    //static map<int,Asignatura> asigList = new TreeMap<>(); //Nuevo 
    //staitc List<Grupo> = new TreeMap<>(); //Esto es lo que solian ser las asignaturas
    
    public static void main (String[] args){
        int op; //opcion para el menu
        boolean b=true;
        System.out.println(" ");    //agregue un espaciado
        System.out.println("Bienvenido al programa de administraci\u00f3n");    //puse correctamente el acento
        System.out.println(" ");    //agregue un espaciado
        do{
            System.out.println("Menu principal");   //solo puse menu principal
            System.out.println("1) Administrar alumnos: ");
            System.out.println("2) Administrar profesores: ");
            System.out.println("3) Administrar asignaturas:  ");
            System.out.println("4) Salir: ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            switch(op){
                case 1:
                    SubMenus.admiAlumnos(alumnosList, asigList);  //le coloco la clase antes del metodo, y le paso la lista de alumnos y de asignaturas
                    break;
                case 2:
                    SubMenus.admiProf(profList, asigList); //le coloco la clase antes del metodo, y le paso la lista de profesores y de asignaturas 
                    break;
                case 3:
                    SubMenus.admiAsig(asigList, profList); //le coloco la clase antes del metodo, y le paso la lista de asignaturas y de profesores
                    break;
                case 4:
                    b=false;    //se cambia la bandera para salir del ciclo
                    break;  

                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");
            }
        }while(b);

    }
    
    
}

    