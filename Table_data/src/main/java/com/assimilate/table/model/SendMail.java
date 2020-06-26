package com.assimilate.table.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "mail")
public class SendMail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String toSend;
	private String subject;
	private String content;

	
	
	
	
	public SendMail()
	{
		
	}





	public SendMail(int id, String toSend, String subject, String content) {
		super();
		this.id = id;
		this.toSend = toSend;
		this.subject = subject;
		this.content = content;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getToSend() {
		return toSend;
	}





	public void setToSend(String toSend) {
		this.toSend = toSend;
	}





	public String getSubject() {
		return subject;
	}





	public void setSubject(String subject) {
		this.subject = subject;
	}





	public String getContent() {
		return content;
	}





	public void setContent(String content) {
		this.content = content;
	}





	@Override
	public String toString() {
		return "SendMail [id=" + id + ", toSend=" + toSend + ", subject=" + subject + ", content=" + content + "]";
	}



	

	
	
	
	

}
