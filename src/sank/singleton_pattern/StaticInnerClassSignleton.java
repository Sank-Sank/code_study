package sank.singleton_pattern;

/**
 * 类描述: 静态内部类单例
 * 作者: by Sank
 * 时间: 2019-01-07 14:21
 */
public class StaticInnerClassSignleton {
    private static class InnerClass{
        private static StaticInnerClassSignleton staticInnerClassSignleton
                = new StaticInnerClassSignleton();
    }
    public static StaticInnerClassSignleton getInstance(){
        return InnerClass.staticInnerClassSignleton;
    }
}
