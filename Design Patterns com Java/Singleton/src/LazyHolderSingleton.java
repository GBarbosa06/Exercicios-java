public class LazyHolderSingleton {

    private static class InstanceHolder{
        public static LazyHolderSingleton instancia =  new LazyHolderSingleton();
    }

    private LazyHolderSingleton(){

    }

    public static LazyHolderSingleton getInstancia(){
        return InstanceHolder.instancia;
    }


}
