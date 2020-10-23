
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
        int op;
        boolean b=true;
        System.out.println("Bienvenido al programa de administración");
        do{
            System.out.println("menu");
            System.out.println("Administrar alumnos: 1");
            System.out.println("Administrar profesores: 2");
            System.out.println("Administrar asignaturas: 3 ");
            System.out.println("Salir: 4");
            op = sc.nextInt();
            switch(op){
                case 1:
                    admiAlumnos();
                    break;
                case 2:
                    admiProf();
                    break;
                case 3:
                    admiAsig();
                    break;
                case 4:
                    b=false;
                    break;

                default:
                    System.out.println("Opcion no válida");
            }
        }while(b);

    }
    
    static void admiAlumnos(){
        int op;
        boolean ban = true;
        System.out.println();
        do{
            System.out.println("Crear alumno: 1");
            System.out.println("Inscribir materia a un alumno: 2");
            System.out.println("Ver alumnos existentes: 3");
            System.out.println("Eliminar alumno: 4");
            System.out.println("Salir : 5");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    if(alumnosList.isEmpty()){
                        System.out.println("No hay alumnos, primero crea uno");
                        break;
                    }else{
                        int num;
                        printAlum();
                        System.out.println("Ingresa el número del alumno al que quieres agregar manterias");
                        num = sc.nextInt();
                        inscMateria(alumnosList.get(num-1));
                        break;
                    }
                case 3:
                    printAlumT();
                    break;
                case 4:
                    eliminarAlum();
                    break;
                case 5:
                    ban = false;
                    break;
            
                default:
                    System.out.println("opción no válida");
                    break;
            }
        }while(ban);
    }
    
    static void admiAsig(){
        int op;
        boolean ban = true;
        System.out.println();
        do{
            System.out.println("Crear Asignatura: 1");
            System.out.println("Ver asignaturas existentes: 2");
            System.out.println("Eliminar asignatura: 3");
            System.out.println("Salir : 4");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    crearAsig();
                    break;
                case 2:
                    printAsigT();
                    break;
                case 3:
                    eliminarAsig();
                    break;
                case 4:
                    ban = false;
                    break;
            
                default:
                    System.out.println("opción no válida");
                    break;
            }
        }while(ban);
    }

    static void admiProf(){
        int op;
        boolean ban = true;
        System.out.println();
        do{
            System.out.println("Crear Profesor: 1");
            System.out.println("Asignar materia a profesor: 2");
            System.out.println("Ver profesores existentes: 3");
            System.out.println("Eliminar profesor: 4");
            System.out.println("Salir : 5");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    crearProf();
                    break;
                case 2:
                    if(profList.isEmpty()){
                        System.out.println("No hay profesores, primero crea uno");
                        break;
                    }else{
                        int num;
                        printProf();
                        System.out.println("Ingresa el número del profesor al que quieres asignar una materia");
                        num = sc.nextInt();
                        asigMateria(profList.get(num-1));
                        break;
                    }
                case 3:
                    printProfT();
                    break;
                case 4:
                    eliminarProf();
                    break;
                case 5:
                    ban = false;
                    break;
            
                default:
                    System.out.println("opción no válida");
                    break;
            }
        }while(ban);
    }

    static void crearProf(){
        sc.nextLine();
        String nombre,apellidoP,apellidoM;
        int edad;
        long numeroCuenta;
        Direccion direccion;
        String calle;
        int numero;
        String colonia,municipio,estado;
        System.out.print("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa el apellido paterno: ");
        apellidoP = sc.nextLine();
        System.out.print("Ingresa el apellido materno: ");
        apellidoM = sc.nextLine();
        System.out.print("Ingresa la edad: ");
        edad = sc.nextInt();
        System.out.print("Ingresa el numero de cuenta: ");
        numeroCuenta = sc.nextLong();
        sc.nextLine();
        System.out.print("Ingresa el nombre de la calle: ");
        calle = sc.nextLine();
        System.out.print("Ingresa el numero de la casa: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el nombre de la colonia: ");
        colonia = sc.nextLine();
        System.out.print("Ingresa el nombre del municipio: ");
        municipio = sc.nextLine();
        System.out.print("Ingresa el nombre del estado: ");
        estado = sc.nextLine();
        direccion = new Direccion(calle,numero,colonia,municipio,estado);
        Profesor nuevoProf = new Profesor(nombre, apellidoP, apellidoM, edad, numeroCuenta, direccion);
        if(nuevoProf.buscar()!=-1)
        {
            System.out.println("Este profesor ya existe");
        }else{
            profList.add(nuevoProf);
        }
    }

    static void crearAlumno(){
        sc.nextLine();
        String nombre,apellidoP,apellidoM;
        int edad;
        long numeroCuenta;
        Direccion direccion;
        String calle;
        int numero;
        String colonia,municipio,estado;
        System.out.print("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa el apellido paterno: ");
        apellidoP = sc.nextLine();
        System.out.print("Ingresa el apellido materno: ");
        apellidoM = sc.nextLine();
        System.out.print("Ingresa la edad: ");
        edad = sc.nextInt();
        System.out.print("Ingresa el numero de cuenta: ");
        numeroCuenta = sc.nextLong();
        sc.nextLine();
        System.out.print("Ingresa el nombre de la calle: ");
        calle = sc.nextLine();
        System.out.print("Ingresa el numero de la casa: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa el nombre de la colonia: ");
        colonia = sc.nextLine();
        System.out.print("Ingresa el nombre del municipio: ");
        municipio = sc.nextLine();
        System.out.print("Ingresa el nombre del estado: ");
        estado = sc.nextLine();
        direccion = new Direccion(calle,numero,colonia,municipio,estado);
        Alumno nuevoAlumno = new Alumno(nombre, apellidoP, apellidoM, edad, numeroCuenta, direccion);
        if(nuevoAlumno.buscar()!=-1)
        {
            System.out.println("Este alumno ya existe");
        }else{
            alumnosList.add(nuevoAlumno);
        }
    }

    static void crearAsig(){
        if(profList.isEmpty()){
            System.out.println("Antes de crear una asignatura debes crear un profesor");
        }else{        
            sc.nextLine();
            int num;
            String nombre;
            long clave;
            Profesor temp;
            System.out.print("Ingresa el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa la clave de la asignatura: ");
            clave = sc.nextLong();
            sc.nextLine();
            printProf();
            System.out.println("Ingresa el número del profesor que se encargará de esta materia");
            num = sc.nextInt();
            temp = profList.get(num-1);
            Asignatura nuevaAsig = new Asignatura(nombre,temp,clave);
            if(nuevaAsig.buscar()!=-1)
            {
                System.out.println("Esta asignatura ya existe");
            }else{
                asigList.add(nuevaAsig);
                temp.addAsig(nuevaAsig);
            }
        }
    }

    static void inscMateria(Alumno alumno){
        if(asigList.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Asignatura p; 
            int indice;
            printAsig();
            System.out.println("Ingresa el numero de la materia a inscribir");
            indice = sc.nextInt();
            p = asigList.get(indice-1);
            alumno.addAsig(p);
            p.addAlumno(alumno);
        }
    }

    static void asigMateria(Profesor prof){
        if(asigList.isEmpty()){
            System.out.println("No hay asignaturas disponibles, crea una primero");
        }else{
            Asignatura p; 
            int indice;
            printAsig();
            System.out.println("Ingresa el numero de la asignatura que impartirá este profesor");
            indice = sc.nextInt();
            p = asigList.get(indice);
            p.addProf(prof);
            prof.addAsig(p);
        }
    }

    static void printAlum(){
        for(int i = 0; i < alumnosList.size(); i++){
            Alumno p = alumnosList.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }
    
    static void printAlumT(){
        for(int i = 0; i < alumnosList.size(); i++){
            Alumno p = alumnosList.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
    }

    static void printAsig(){
        for(int i = 0; i < asigList.size(); i++){
            Asignatura p = asigList.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }

    }
    static void printAsigT(){
        for(int i = 0; i < asigList.size(); i++){
            Asignatura p = asigList.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }

    }

    static void printProf(){
        for(int i = 0; i < profList.size(); i++){
        Profesor p =    profList.get(i);
            System.out.print((i+1)+".- ");
            p.print();
        }
    }

    static void printProfT(){
        for(int i = 0; i < profList.size(); i++){
        Profesor p =    profList.get(i);
            System.out.print((i+1)+".- ");
            p.printT();
        }
    }

    static void eliminarAlum(){
        if(alumnosList.isEmpty()){
            System.out.println("No hay alumnos");
        }else{
            Alumno eliminar;
            int indice;
            printAlum();
            System.out.println("Ingresa el numero del alumno a eliminar");
            indice = sc.nextInt();
            eliminar = alumnosList.get(indice-1);
            eliminar.eliminar();
        }
    }
    
    static void eliminarProf(){
        if(profList.isEmpty()){
            System.out.println("No hay profesores");
        }else{
            Profesor eliminar;
            int indice;
            printProf();
            System.out.println("Ingresa el numero del profesor a eliminar");
            indice = sc.nextInt();
            eliminar = profList.get(indice-1);
            eliminar.eliminar();
        }
    }


    static void eliminarAsig(){
        if(asigList.isEmpty()){
            System.out.println("No hay asignaturas");
        }else{
            Asignatura eliminar;
            int indice;
            printAsig();
            System.out.println("Ingresa el numero de la asignatura a eliminar");
            indice = sc.nextInt();
            eliminar = asigList.get(indice-1);
            eliminar.eliminar();
        }
    }
}