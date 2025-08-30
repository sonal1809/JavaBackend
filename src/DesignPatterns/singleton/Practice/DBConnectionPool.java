package DesignPatterns.singleton.Practice;

public class DBConnectionPool {
    private static DBConnectionPool dbInstance = null;

    private DBConnectionPool(){}

    public static synchronized DBConnectionPool getInstance(){
        if(dbInstance == null){
            dbInstance = new DBConnectionPool();
        }
        return dbInstance;
    }

    public static DBConnectionPool getInstance1(){
        if(dbInstance == null){
            synchronized (DBConnectionPool.class){
                if(dbInstance == null){
                    dbInstance = new DBConnectionPool();
                }
            }
        }
        return dbInstance;
    }

    // Works well, not for multithreaded environment
    private static DBConnectionPool getInstance2(){
        if(dbInstance == null){
            return new DBConnectionPool();
        }
        return dbInstance;
    }

}
