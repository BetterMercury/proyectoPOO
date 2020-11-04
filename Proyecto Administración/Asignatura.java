import java.util.HashSet;

//Clase que define a los objetos asignatura
public class Asignatura {
    String nombre;
    int creditos;
    String clave;
    HashSet<String> grupos = new HashSet<>();

    //Costructor que inicializa todo menos los grupos que imparten esta asignatura
    public Asignatura (String nombre,String clave,int creditos){
    this.nombre = nombre;
    this.creditos = creditos;
    this.clave = clave;    
    }

    //Añade un grupo a conjunto de grupos que imparten una asignatura
    public void addGrup(String claveGrup){
        this.grupos.add(claveGrup);
    }

    //Remueve una grupo del conjunto de de grupos que imparten una asignatura
    public void removeGrup(String claveGrup){
        this.grupos.remove(claveGrup);
    }

    //Busca a la asignatura en la lista principal de asignatruas y devuelve su posición
    public int buscar (){
        for(int i = 0; i < Administracion.asigList.size(); i++){
            Asignatura p = Administracion.asigList.get(i);
            if (p.clave == this.clave){
                return i;
            }
        }
        return -1;
    }

    //Elimina a la asignatura de la lista general de asignaturas y de cualquier grupo que la imparta
    public void eliminar(){
        Administracion.asigList.remove(this);
        Grupo temp;
        for(String clave:this.grupos){
            temp = Administracion.grupMap.get(clave);
            temp.removeAsig();
        }
    }

    //Imprime información resuminda de una signatura
    void print(){
        System.out.println();
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Creditos: "+this.creditos);
        System.out.println("Clave "+this.clave);

    }

    //Imprime toda la información de una asignatura.
    void printT(){
        System.out.println();
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Creditos: "+this.creditos);
        System.out.println("Clave "+this.clave);

        System.out.println("Lista de grupos:");
        Grupo temp;
        for(String clave:this.grupos){
            temp=Administracion.grupMap.get(clave);
            temp.print();
        }


    }
}
