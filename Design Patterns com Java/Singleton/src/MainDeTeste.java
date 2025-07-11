public class MainDeTeste {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstancia();
        System.out.println("LazySingleton: " + lazy);
        lazy = LazySingleton.getInstancia();
        System.out.println("LazySingleton: " + lazy);

        EagerSingleton eager = EagerSingleton.getInstancia();
        System.out.println("Eager: " + eager);
        eager = EagerSingleton.getInstancia();
        System.out.println("Eager: " + eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println("LazyHolder: " + lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println("LazyHolder: " + lazyHolder);
    }

}
