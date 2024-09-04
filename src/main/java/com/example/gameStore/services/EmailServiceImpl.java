package com.example.gameStore.services;

import com.example.gameStore.services.interfaces.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private TemplateEngine templateEngine;

    private final String GET_KEYS_TEXT = """
            There are your keys for the game you have purchased: \n""";
    private final String GET_KEYS_SUBJECT = "Game keys";

    public void sendMessagePurchasedKeys(String email, Map<String, List<String>> keys) {
        Map<String, Object> templateModel = new HashMap<>();

        templateModel.put("itemsMap", keys);

        sendMessage(email, GET_KEYS_SUBJECT, templateModel, "MessagePurchasedKeys");
    }

    public void sendMessageAccountVerification(String email, String token, String hostUrl) {
        Map<String, Object> templateModel = new HashMap<>();
        String url = hostUrl + "/auth/verify/" + token;

        templateModel.put("verificationLink", url);

        sendMessage(email, "Account Verification", templateModel, "MessageAccountVerification");
    }

    public void sendMessagePasswordReset(String email, String token, String hostUrl) {

        Map<String, Object> templateModel = new HashMap<>();
        String url = hostUrl + "/auth/reset-password/" + token;

        templateModel.put("resetLink", url);

        sendMessage(email, "Password Reset Request", templateModel, "MessagePasswordReset");
    }

    private void sendMessage(String email, String subject, Map<String, Object> templateModel, String templateName) {
        Context context = new Context();
        context.setVariables(templateModel);

        String htmlContent = templateEngine.process(templateName, context);
        MimeMessage message = emailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom("fake.game.store.app@gmail.com");
            helper.setTo(email);
            helper.setSubject(subject);
            helper.setText(htmlContent, true);
            emailSender.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
