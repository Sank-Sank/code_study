package sank.singleton_pattern;

/**
 * 类描述: 枚举单例
 * 作者: by Sank
 * 时间: 2019-01-07 14:40
 */
public enum  EnumInstance {
    INSTANCE;
    //枚举类只有指定类的对象
    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
