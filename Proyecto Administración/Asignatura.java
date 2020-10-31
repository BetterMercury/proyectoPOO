import java.util.HashSet;

public class Asignatura {
    String nombre;
    int creditos;
    String clave;
    HashSet<String> grupos = new HashSet<>();

    public Asignatura (String nombre,String clave,int creditos){
    this.nombre = nombre;
    this.creditos = creditos;
    this.clave = clave;    
    }

    public void addGrup(String claveGrup){
        this.grupos.add(claveGrup);
    }
    public void removeGrup(String claveGrup){
        this.grupos.remove(claveGrup);
    }
    public int buscar (){
        for(int i = 0; i < Administracion.asigList.size(); i++){
            Asignatura p = Administracion.asigList.get(i);
            if (p.clave == this.clave){
                return i;
            }
        }
        return -1;
    }
    public void eliminar(){
        Administracion.asigList.remove(this);
        Grupo temp;
        for(String clave:this.grupos){
            temp = Administracion.grupMap.get(clave);
            temp.removeAsig();
        }
    }

    void print(){
        System.out.println();
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Creditos: "+this.creditos);
        System.out.println("Clave "+this.clave);

    }
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
