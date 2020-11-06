
package proyectopoo.admin;

import java.util.*;

import proyectopoo.Administracion;
import proyectopoo.admin.*;
import proyectopoo.tiposDeDato.*;
import proyectopoo.utilidades.*;

//Métodos encargado de pedir información para crear objetos de diversos tipos
public class Crear{

	static Scanner sc = new Scanner(System.in);

    //Pide información y crea un profesor. Verifica que aún no exista segun el número de cuenta
	public void crearProf(List<Profesor> listaDeProfesores){  //Método de Instancia
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
           	listaDeProfesores.add(nuevoProf);   //los profesores se van añadiendo a la coleccion de profesores pertinente
        }
    }

    //Pide información y crea un alumno. Verifica que aún no exista segun el número de cuenta

    public void crearAlumno(List<Alumno> listaDeAlumnos){	//agrego el parametro  -- Método de Instancia
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
            listaDeAlumnos.add(nuevoAlumno);    //los alumnos se van añadiendo a la coleccion de alumnos pertinente
        }
    }

    //Pide información y crea un grupo. Verifica que aún no exista segun la clave del grupo

    public void crearGrup(Hashtable<String,Grupo> mapaDeGrupos, List<Profesor> listaDeProfesores,
        List<Asignatura> listaDeAsignaturas){	//dos parametros -- Metodo de Instancia
        if(listaDeProfesores.isEmpty()){
            System.out.println("Antes de crear un grupo debes crear un profesor");
        }else if(listaDeAsignaturas.isEmpty()){
            System.out.println("Antes de crear un grupo debes crear una asignatura");
        }else{        
            int num;    //se elimina el parametro 'nombre'
            int num2;
            String clave;
            Profesor temp;
            Asignatura asig;
            System.out.print("Ingresa la clave del grupo: ");
            clave = sc.nextLine();
            System.out.println("");	
            //Pide profesor
            Imprimir.printProf(listaDeProfesores);   
            System.out.println("");	
            System.out.print("Ingresa el n\u00famero del profesor que se encargar\u00e1 de este grupo: ");
            num = sc.nextInt();
            System.out.println("");	
            temp = listaDeProfesores.get(num-1);
            //Pide asignatura
            Imprimir.printAsig(listaDeAsignaturas);
            System.out.println("");
            System.out.print("Ingresa el n\u00famero de la asignatura que se impartira en este grupo: ");
            num2 = sc.nextInt();
            asig = listaDeAsignaturas.get(num2-1);
            sc.nextLine();
            if(mapaDeGrupos.contains(clave))
            {
                System.out.println("Este grupo ya existe");
            }else{
                Grupo nuevoGrupo = new Grupo(temp,clave,asig);  //se crea un grupo
                mapaDeGrupos.put(clave,nuevoGrupo); //se almacena en el mapa de grupos el grupo creado arriba
                temp.addGrup(clave);    //en la variable profesor auxiliar, se añade la copia del grupo creado en el map
                listaDeProfesores.set(num-1, temp); //de esta manera, el profesor previamente creado (el de la lista de profesores), tendrá asociado el grupo
                listaDeAsignaturas.set(num2-1,asig);    //de esta manera, la asignatura previamente creada, tendrá asociada el grupo
            }
        }
    }

/*    
Pide información y crea una asignatura. Valida que aún no exista buscando la clave de la asignatura
en la lista principal de asignaturas.
*/

    public void crearAsignatura(List<Asignatura> listAsig){	//agrego el parametro -- metodo de instancia
        String nombre;
        int creditos;
        String clave;
        System.out.print("Ingresa el nombre: ");
        nombre = sc.nextLine();
       
        System.out.print("Ingresa los creditos de la asignatura: ");
        creditos = sc.nextInt();

        sc.nextLine();
        System.out.print("Ingresa la clave de la asignatura: ");
        clave = sc.nextLine();
        Asignatura nuevaAsignatura = new Asignatura(nombre, clave, creditos);
        
        if(nuevaAsignatura.buscar()!=-1)
        {	
        	System.out.println(" ");
            System.out.println("Esta asignatura ya existe (criterio de clave de asignatura)");	//solo especifico que ya existe por ser la misma clave
        }else{
            listAsig.add(nuevaAsignatura);  //a  la lista de asignaturas se le agrega la nueva
        }
    }
}