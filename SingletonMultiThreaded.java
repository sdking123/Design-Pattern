public class SingletonMultiThreaded {
    private static SingletonMultiThreaded instance;

    public static SingletonMultiThreaded getInstance(){
        if(instance == null){
            synchronized (SingletonMultiThreaded.class){
                if(instance == null){
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;
    }
}
