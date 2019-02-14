package cod_12_singleton;
//@author fsancheztemprano
public class COD_12_Singleton {
    public static void main(String[] args) {
        
            Singleton objetoA = Singleton.getInstance("F", 10);
            objetoA.printSingleton();
            Singleton objetoB = Singleton.getInstance("S", 11);
            objetoB.printSingleton();
            
            objetoB.setNombre("T");
            objetoB.setNumero(11);
            objetoA.printSingleton();
            objetoB.printSingleton();

    }
}