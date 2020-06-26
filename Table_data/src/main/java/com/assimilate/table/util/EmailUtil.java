package com.assimilate.table.util;

import com.assimilate.table.model.SendMail;

public interface EmailUtil {

	
	void sendEmail(String toAddres , String subject , String body);

	void saveMail(SendMail sendMail);

	void sendEmail(String string, String string2, String string3, String string4);

	
	
}
