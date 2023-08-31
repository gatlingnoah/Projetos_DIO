package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "Apressado"
 * @author Lucas Natan
 */
public class SingletonLazyHolder{

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}