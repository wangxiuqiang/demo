package service.Impl;

import org.springframework.stereotype.Service;
import service.SendService;

import javax.mail.*;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
@Service
public class SendServiceImpl implements SendService {

    public void sendMail() throws Exception {
        //1,创建连接对象,连接到服务器
        Properties props = new Properties();
        props.setProperty("mail.host","smtp.163.com");
        props.setProperty("mail.smtp.auth","true");
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("wangxiuqianga@163.com","251698wodewxqWXQ");
            }
        });

        //2.创建邮件对象
        Message message = new MimeMessage(session);
        //设置发件人
        message.setFrom(new InternetAddress("wangxiuqianga@163.com"));
        //设置收件人
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("1160139211@qq.com"));
        //设置主题
        message.setSubject("我发送给你的JavaMail");
        //设置邮件内容
        message.setContent("<h1>点击去百度</h1>: <a>http://www.baidu.com</a>","text/html;charset=UTF-8");
        //3.发送邮件
        Transport.send(message);
    }
}
