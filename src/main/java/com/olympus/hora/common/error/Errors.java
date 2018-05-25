package com.olympus.hora.common.error;

import com.olympus.hora.common.result.Message;

public class Errors {
	private Errors() {
	}

	//=======================================================
	// エラーページエラー表示
	//=======================================================
	public static ApplicationException system() {
		return new ApplicationException("error.system");
	}

	public static ApplicationException free(String text) {
		return new ApplicationException("error.free", text);
	}

	public static ApplicationException invalidURL() {
		return new ApplicationException("error.invalid.url");
	}

	public static ApplicationException illegalOperation() {
		return new ApplicationException("error.illegal.operation");
	}

	public static ApplicationException logicError() {
		return new ApplicationException("error.logic");
	}

	//=======================================================
	// 元画面エラー表示
	//=======================================================
	public static Message errorFree(String text) {
		return new Message(Message.Level.ERROR, "error.free", text);
	}

	public static Message dataConflict() {
		return new Message(Message.Level.ERROR, "error.data.conflict");
	}


	/**
	 * サンプル入力画面でサーバーサイドエラーを表示させるサンプル
	 * @return メッセージ
	 */
	public static Message sampleError1() {
		return new Message(Message.Level.ERROR, "error.sample.error1");
	}

}
