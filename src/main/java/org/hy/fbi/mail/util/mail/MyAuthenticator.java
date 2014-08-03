package org.hy.fbi.mail.util.mail;

import javax.mail.*;

public class MyAuthenticator extends Authenticator {

	private static final MyAuthenticator DEFAULT_AUTHENTICATOR;

	static {
		DEFAULT_AUTHENTICATOR =
				new MyAuthenticator(
						MailSenderInfo.MAIL_SERVER_HOST,
						MailSenderInfo.MAIL_SERVER_PASSWORD);
	}

	private String userName = null;
	private String password = null;

	public MyAuthenticator() {
	}

	public MyAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}

	protected static MyAuthenticator getDefaultInstnce() {
		return DEFAULT_AUTHENTICATOR;
	}
}