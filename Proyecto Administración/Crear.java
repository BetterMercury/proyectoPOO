import java.util.*;

public class Crear{

	static Scanner sc = new Scanner(System.in);

	static void crearProf(List<Profesor> listaDeProfesores){
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
           	listaDeProfesores.add(nuevoProf);
        }
    }

    static void crearAlumno(List<Alumno> listaDeAlumnos){	//agrego el parametro
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
        	System.out.println(" ");
            System.out.println("Este alumno ya existe (criterio de numero de cuenta)");	//solo especifico que ya existe por ser el mismo numero de cuenta
        }else{
            listaDeAlumnos.add(nuevoAlumno);
        }
    }

    static void crearAsig(List<Asignatura> listaDeAsignaturas, List<Profesor> listaDeProfesores){	//dos parametros
        if(listaDeProfesores.isEmpty()){
            System.out.println("Antes de crear una asignatura debes crear un profesor");
        }else{        
            int num;
            String nombre;
            long clave;
            Profesor temp;
            System.out.print("Ingresa el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa la clave de la asignatura: ");
            clave = sc.nextLong();
            sc.nextLine();
            System.out.println("");	//agrego espaciado
            Imprimir.printProf(listaDeProfesores);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero del profesor que se encargar\u00e1 de esta materia: ");
            num = sc.nextInt();
            System.out.println("");	//agrego espaciado
            temp = listaDeProfesores.get(num-1);
            Asignatura nuevaAsig = new Asignatura(nombre,temp,clave);
            if(nuevaAsig.buscar()!=-1)
            {
                System.out.println("Esta asignatura ya existe");
            }else{
                listaDeAsignaturas.add(nuevaAsig);
                temp.addAsig(nuevaAsig);
            }
        }
    }


}