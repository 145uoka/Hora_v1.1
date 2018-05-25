package com.olympus.hora.common.error;

import com.olympus.hora.common.result.Message;

public class Warns {
	private Warns() {
	}

	//=======================================================
	// 元画面エラー表示
	//=======================================================

	public static Message warnFree(String text) {
		return new Message(Message.Level.WARN, "warn.free", text);
	}

}
