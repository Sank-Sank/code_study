package sank.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:
 * 作者: by Sank
 * 时间: 2019-01-23 17:46
 */
public class Message implements Cloneable{
    private String title;
    private String content;
    private String icon;

    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Message(){
        System.out.println("Message Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone");
        //浅克隆 对象中的(非基本数据类型的)属性不会克隆
        //return super.clone();
        //深克隆
        Message message = (Message) super.clone();
        message.list = (List<String>) message.clone();
        return message;
    }

}
