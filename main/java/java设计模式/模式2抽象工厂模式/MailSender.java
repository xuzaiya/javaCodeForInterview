package java设计模式.模式2抽象工厂模式;

public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
