package DesignPatterns;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton createInstance(){
        if(instance == null){
            synchronized (Singleton.class){
            if(instance == null){//This ensures that no other thread has
                // created the instance while the current thread was waiting to acquire the lock.
            instance = new Singleton();
            }
        }
        }
        return instance;
    }
}
