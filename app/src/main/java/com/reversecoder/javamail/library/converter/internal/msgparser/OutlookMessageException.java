package com.reversecoder.javamail.library.converter.internal.msgparser;

//import org.simplejavamail.MailException;

import com.reversecoder.javamail.library.exceptions.MailException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.reversecoder.javamail.library.internal.util.Preconditions.checkNonEmptyArgument;

//import static org.simplejavamail.internal.util.Preconditions.checkNonEmptyArgument;

/**
 * This exception is used to communicate errors during parsing of a MsgParser {@link org.simplejavamail.outlookmessageparser.model.OutlookMessage} of Outlook
 * .msg data.
 *
 * @author Benny Bottema
 */
@SuppressWarnings("serial")
class OutlookMessageException extends MailException {

	static final String ERROR_PARSING_OUTLOOK_MSG = "Unable to parse Outlook message";

	OutlookMessageException(@SuppressWarnings("SameParameterValue") @Nonnull final String message, @Nullable final Exception cause) {
		super(checkNonEmptyArgument(message, "message"), cause);
	}
}