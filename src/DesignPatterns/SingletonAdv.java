package DesignPatterns;

public class SingletonAdv {

    private static SingletonAdv instance = null;

    private SingletonAdv(){

    }

    public static SingletonAdv createInstance(){
        if(instance == null){
            synchronized (SingletonAdv.class){
                if(instance == null){
                    instance = new SingletonAdv();
                }
            }
        }
        return instance;
    }
}
