package com.olympus.hora.common.error;

import com.olympus.hora.common.result.Message;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	final Message messageInfo;

	public ApplicationException(Message messageInfo) {
		super(messageInfo.toString());
		this.messageInfo = messageInfo;
	}

	public ApplicationException(Message messageInfo, Throwable cause) {
		super(messageInfo.toString(), cause);
		this.messageInfo = messageInfo;
	}

	public ApplicationException(Throwable cause) {
		this("error.system", cause);
	}

	public ApplicationException(String key) {
		super();
		this.messageInfo = new Message(Message.Level.ERROR, key);
	}

	public ApplicationException(String key, Object... parameters) {
		super();
		this.messageInfo = new Message(Message.Level.ERROR, key, parameters);
	}

	public ApplicationException() {
		this("error.system");
	}

	public Message getMessageInfo() {
		return messageInfo;
	}
}
