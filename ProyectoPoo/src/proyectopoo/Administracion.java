
package proyectopoo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

import proyectopoo.Administracion;
import proyectopoo.admin.*;
import proyectopoo.tiposDeDato.*;
import proyectopoo.utilidades.*;

//Clase principal del programa
public class Administracion {   
    static Scanner sc = new Scanner(System.in);

    public static List<Alumno> alumnosList = new ArrayList<>();        //uso de las colecciones lista y map para el almacenamiento y manejo de datos
    public static List<Profesor> profList = new ArrayList<>();
    public static Hashtable<String,Grupo> grupMap = new Hashtable<>();
    public static List<Asignatura> asigList = new ArrayList<>(); 
    
    //Despliega el menú principal del programa
    public static void main (String[] args){
        SubMenus sub = new SubMenus();        //se agrega la instancia de submenus
        int op; //opcion para el menu
        boolean b=true; //variable booleana que dictaminara el cierre o la repeticion del ciclo del menu
        System.out.println(" ");    
        System.out.println("Bienvenido al programa de administraci\u00f3n");    
        System.out.println(" ");    
        do{
            System.out.println("Menu principal");   
            System.out.println("1) Administrar alumnos: ");
            System.out.println("2) Administrar profesores: ");
            System.out.println("3) Administrar grupos:  ");
            System.out.println("4) Administrar asignaturas:  ");
            System.out.println("5) Salir: ");
            System.out.print("Su opci\u00f3n es: "); //agregue una indicacion en pantalla
            op = sc.nextInt();
            switch(op){
                case 1:
                    sub.admiAlumnos(alumnosList,grupMap);  //le paso la lista de alumnos y el mapa de grupos
                    break;
                case 2:
                    sub.admiProf(profList, grupMap); //le paso la lista de profesores y el mapa de grupos
                    break;
                case 3:
                    sub.admiGrup(grupMap, profList,asigList); //le paso el mapa de grupos, la lista de profesores y de asignaturas
                    break;
                case 4:
                    sub.admiAsig(grupMap,asigList);
                    break;
                case 5:
                    b=false;    //se cambia la bandera para salir del ciclo
                    break;  

                default:
                    System.out.println("Opci\u00f3n no v\u00e1lida");
            }
        }while(b);

    }
    
    
}

    