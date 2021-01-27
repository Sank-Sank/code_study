package sank.prototype_pattern;


/**
 * 类描述: 测试类
 * 作者: by Sank
 * 时间: 2019-01-23 17:45
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Message message = new Message();
        message.setContent("开年会了");
        for (int i = 0;i < 10;i++){
            Message temp = (Message) message.clone();
            temp.setTitle("标题"+i);
            temp.setContent("年会");
            temp.setIcon("sank");
            MessageUtils.sendMessage(temp);
        }
        MessageUtils.saveOriginMessageRecord(message);
    }
}
