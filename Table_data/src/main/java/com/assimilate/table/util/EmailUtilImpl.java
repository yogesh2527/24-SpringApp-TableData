package com.assimilate.table.util;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.print.attribute.standard.PDLOverrideSupported;

import org.apache.catalina.webresources.FileResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.assimilate.table.model.SendMail;
import com.assimilate.table.repository.SendEmailRepository;

@Service
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender sender;
	
	@Autowired
	private SendEmailRepository sendEmailRepository;
	
	@Override
	public void sendEmail(String toAddres, String subject, String body) {
	
	MimeMessage createMessage = sender.createMimeMessage();
	
	MimeMessageHelper helper = new MimeMessageHelper(createMessage);
	
	try {
		helper.setTo(toAddres);
		helper.setSubject(subject);
		helper.setText(body);
		
		Multipart multipart = new MimeMultipart();
		MimeBodyPart imageAttchment = new MimeBodyPart();
		
		MimeBodyPart pdfattachment = new MimeBodyPart();
		try {
//			pdfattachment.attachFile("C:\\Users\\yogesh\\Desktop\\database.pdf");
			
			
			imageAttchment.attachFile("C:\\Users\\yogesh\\Desktop\\Wallpapers\\footballer.jpg");
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		multipart.addBodyPart(imageAttchment);
//		multipart.addBodyPart(pdfattachment);
		
		createMessage.setContent(multipart);
	   
//		ClassPathResource path = new ClassPathResource("footballer.jpg");
//	    helper.addAttachment("footballer.jpg", path);
		
		
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sender.send(createMessage);
		
	}

	@Override
	public void saveMail(SendMail sendMail) {
		
		sendEmailRepository.save(sendMail);
		
		MimeMessage message = sender.createMimeMessage();
		
		
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message);
			helper.setTo(sendMail.getToSend());
			helper.setSubject(sendMail.getSubject());
			helper.setText(sendMail.getContent());
			
			Multipart mailContent = new MimeMultipart();
			
		
			
			try {
				MimeBodyPart pdfAttachment = new MimeBodyPart();
				pdfAttachment.attachFile("C:\\Users\\yogesh\\Desktop\\database.pdf");
				
				MimeBodyPart imageAttchment = new MimeBodyPart();
				
				imageAttchment.attachFile("C:\\Users\\yogesh\\Desktop\\Wallpapers\\footballer.jpg");
				
				mailContent.addBodyPart(pdfAttachment);
				mailContent.addBodyPart(imageAttchment);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			message.setContent(mailContent);

		
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		sender.send(message);
	}

	@Override
	public void sendEmail(String string, String string2, String string3, String string4) {
		
		MimeMessage createMessage = sender.createMimeMessage();
		
		System.out.println("Util => "+string4);
		
		
		
		try {
			MimeMessageHelper helper = new MimeMessageHelper(createMessage,true);
			helper.setTo(string);
			helper.setSubject(string2);
			helper.setText(string3,true);
		
			ClassPathResource path = new ClassPathResource("footballer.jpg");
		    helper.addAttachment("footballer.jpg", path);
			
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sender.send(createMessage);
			
		
	}

}
