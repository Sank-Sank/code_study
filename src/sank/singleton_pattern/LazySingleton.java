package sank.singleton_pattern;

/**
 * 类描述: 懒汉式单例模式
 * 作者: by Sank
 * 时间: 2019-01-07 13:43
 */
public class LazySingleton {
    //加上volatile关键字，使的所有线程都能看到内存状态，保证内存的可见性。
    private volatile static LazySingleton instance= null;
    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if (instance==null){
            synchronized (LazySingleton.class){
                if (instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
