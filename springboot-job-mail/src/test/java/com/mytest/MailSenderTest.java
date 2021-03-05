package com.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.UUID;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/23
 */
@SpringBootTest(classes = MailSpringbootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MailSenderTest {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads(){
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setSubject("你好，Alex");
        mailMessage.setText("Hello world");
        mailMessage.setTo("2057473561@qq.com");
        mailMessage.setFrom("2057473561@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    public void contextLoad2() throws MessagingException {
        //发送一个复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        //组装消息
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,"utf-8");
        //主题正文
        mimeMessageHelper.setSubject("hello world");
        mimeMessageHelper.setText("<p>kuangshen</p>",true);
        //附件
        mimeMessageHelper.addAttachment(UUID.randomUUID()+".jpg",new File("D:/1.jpg"));

        //设置收发件人
        mimeMessageHelper.setTo("2057473561@qq.com");
        mimeMessageHelper.setFrom("2057473561@qq.com");

        mailSender.send(mimeMessage);
    }

    /**
     * 发送邮件
     * @param subject
     * @param text
     * @param to
     * @param from
     * @throws MessagingException
     */
    public void sendMail(String subject,String text,String to,String from) throws MessagingException{

    }
}
