package sank.singleton_pattern;

/**
 * 类描述: 饿汉式单例模式
 * 作者: by Sank
 * 时间: 2019-01-07 14:16
 */
public class HungrySingleton {
    //final声明的变量必须在类加载完成的时候就赋值
    private final static HungrySingleton instance;
    static {
        instance = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return instance;
    }
}
