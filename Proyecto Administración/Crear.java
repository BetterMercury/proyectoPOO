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

    static void crearGrup(Hashtable<String,Grupo> mapaDeGrupos, List<Profesor> listaDeProfesores,
        List<Asignatura> listaDeAsignaturas){	//dos parametros
        if(listaDeProfesores.isEmpty()){
            System.out.println("Antes de crear un grupo debes crear un profesor");
        }else if(listaDeAsignaturas.isEmpty()){
            System.out.println("Antes de crear un grupo debes crear una asignatura");
        }else{        
            int num;
            String nombre;
            String clave;
            Profesor temp;
            Asignatura asig;
            System.out.print("Ingresa el nombre: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa la clave del grupo //Los grupos llevarán número, no clave hay que cambiar esto: ");
            clave = sc.nextLine();
            sc.nextLine();
            System.out.println("");	//agrego espaciado
            //Pide profesor
            Imprimir.printProf(listaDeProfesores);   //agrego el parametro
            System.out.println("");	//agrego espaciado
            System.out.print("Ingresa el n\u00famero del profesor que se encargar\u00e1 de este grupo: ");
            num = sc.nextInt();
            System.out.println("");	//agrego espaciado
            temp = listaDeProfesores.get(num-1);
            //Pide asignatura
            Imprimir.printAsig(listaDeAsignaturas);
            System.out.println("");
            System.out.print("Ingresa el n\u00famero de la asignatura a inscribir: ");
            num = sc.nextInt();
            asig = listaDeAsignaturas.get(num-1);

            if(mapaDeGrupos.contains(clave))
            {
                System.out.println("Este grupo ya existe");
            }else{
                Grupo nuevoGrupo = new Grupo(nombre,temp,clave,asig);
                mapaDeGrupos.put(clave,nuevoGrupo);
                temp.addGrup(clave);
            }
        }
    }


}