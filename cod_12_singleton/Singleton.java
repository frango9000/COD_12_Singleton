package cod_12_singleton;
//@author fsancheztemprano
public final class Singleton {
    
    private String nombre;
    private int numero;
    
    private static Singleton singleton;

    private Singleton(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public static Singleton getInstance(String nombre, int numero){
        if(singleton == null)
            return singleton = new Singleton(nombre, numero);
        else return singleton;
    }
   public void printSingleton(){
       System.out.println(nombre + " " + numero);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
