package com.reversecoder.javamail.library.mailer;

//import org.simplejavamail.MailException;

import com.reversecoder.javamail.library.exceptions.MailException;

/**
 * This exception is used to communicate errors during the validation of email.
 *
 * @author Benny Bottema
 */
@SuppressWarnings("serial")
class MailerException extends MailException {

	static final String INVALID_RECIPIENT = "Invalid TO address: %s";
	static final String INVALID_REPLYTO = "Invalid REPLY TO address: %s";
	static final String INVALID_SENDER = "Invalid FROM address: %s";
	static final String MISSING_SENDER = "Email is not valid: missing sender";
	static final String MISSING_RECIPIENT = "Email is not valid: missing recipients";
	static final String MISSING_SUBJECT = "Email is not valid: missing subject";
	static final String MISSING_CONTENT = "Email is not valid: missing content body";

	MailerException(final String message) {
		super(message);
	}
}