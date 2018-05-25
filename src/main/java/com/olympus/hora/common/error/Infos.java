package com.olympus.hora.common.error;

import com.olympus.hora.common.result.Message;

public class Infos {
	private Infos() {
	}

	//=======================================================
	// 元画面エラー表示
	//=======================================================
	public static Message infoFree(String text) {
		return new Message(Message.Level.INFO, "info.free", text);
	}

}
