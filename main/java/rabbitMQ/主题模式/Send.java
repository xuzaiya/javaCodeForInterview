package rabbitMQ.主题模式;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import rabbitMQ.简单队列模式.ConnectionUtil;

import java.io.IOException;

/**
 * @author xuzaiya
 * @2020/7/16 15:28
 * 文件说明:
 */
public class Send {
    private final static String EXCHANGE_NAME = "test_exchange_topic";

    public static void main(String[] args) throws IOException {
        //获取连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        //声明exchange
        channel.exchangeDeclare(EXCHANGE_NAME,"topic");
        //消息内容
        String message = "Hello World!";
        channel.basicPublish(EXCHANGE_NAME,"key.1",null,message.getBytes());
        System.out.println("后台系统： "+message);
        channel.close();
        connection.close();
    }
}
