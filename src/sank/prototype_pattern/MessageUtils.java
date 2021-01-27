package sank.prototype_pattern;

import java.text.MessageFormat;

/**
 * 类描述:
 * 作者: by Sank
 * 时间: 2019-01-23 17:48
 */
public class MessageUtils {
    public static void sendMessage(Message message){
        String outputMessage = "发送消息,title={0},content={1},icon={2}";
        System.out.println(MessageFormat.format(outputMessage,
                message.getTitle(),
                message.getContent(),
                message.getIcon()));
    }
    public static void saveOriginMessageRecord(Message message){
        System.out.println("存储origin记录,originMessage:"+message.getContent());
    }
}
