package creational.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){
        if(instance != null) {
            throw new RuntimeException("use getInstance method");
        }
    }


    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();

                }
            }
        }

        return instance;
    }


}
