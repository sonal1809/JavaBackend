package LLD2.singleton.Practice;

public class Practice1 {
    private static Practice1 practice1 = null;

    private Practice1(){}


    // With Synchronized block
    public static Practice1 getInsance(){
        if(practice1 == null){
            synchronized (Practice1.class){
                if(practice1 == null){
                    return new Practice1();
                }
            }
        }
        return practice1;
    }

    // with Synchronized method
    public static synchronized Practice1 getInstance1(){
        if(practice1 == null){
            return new Practice1();
        }
        return practice1;
    }
}
