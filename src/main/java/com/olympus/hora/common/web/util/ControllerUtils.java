package com.olympus.hora.common.web.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.hora.common.result.Message;
import com.olympus.hora.common.result.Result;

/**
 * Controller関連のUtilクラスです。
 * @author kitabayashi_y
 */
public final class ControllerUtils {

	/** エラーレベル：Infoの際のメッセージキー */
	public static final String INFO_MESSAGE_ATTR_KEY = "infoMessages";
	/** エラーレベル：Warnの際のメッセージキー */
	public static final String WARN_MESSAGE_ATTR_KEY = "warnMessages";
	/** エラーレベル：Errorの際のメッセージキー */
	public static final String ERROR_MESSAGE_ATTR_KEY = "errorMessages";

	/**
	 * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
	 */
	private ControllerUtils() {
	}

	/**
	 * インフォメーションメッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param messageKey メッセージキー
	 * @param params メッセージパラメータ
	 */
	public static void setInfoMessage(MessageSource messageSource, Model model, Locale locale, String key,Object ... params) {
		String textMessage = messageSource.getMessage(key, params, locale);
		model.addAttribute(INFO_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
	}
	/**
	 * 警告メッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param messageKey メッセージキー
	 * @param params メッセージパラメータ
	 */
	public static void setWarnMessage(MessageSource messageSource, Model model, Locale locale, String key,Object ... params) {
		String textMessage = messageSource.getMessage(key, params, locale);
		model.addAttribute(WARN_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
	}
	/**
	 * エラーメッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param messageKey メッセージキー
	 * @param params メッセージパラメータ
	 */
	public static void setErrorMessage(MessageSource messageSource, Model model, Locale locale, String key,Object ... params) {
		String textMessage = messageSource.getMessage(key, params, locale);
		model.addAttribute(ERROR_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
	}

	/**
	 * メッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param message Controller側でエラーレベル、メッセージキー等をセットしたMessageオブジェクト
	 */
	public static void setMessage(MessageSource messageSource, Model model, Locale locale, Message message) {
		String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), locale);
		switch (message.getLevel()) {
		case INFO:
			model.addAttribute(INFO_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
			break;
		case WARN:
			model.addAttribute(WARN_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
			break;
		case ERROR:
			model.addAttribute(ERROR_MESSAGE_ATTR_KEY, Arrays.asList(textMessage));
			break;
		default:
			break;
		}
	}

	/**
	 * メッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param result Controller側でエラーレベル、メッセージキー等をセットしたResultオブジェクト
	 */
	public static void saveMessage(MessageSource messageSource, Model model, Locale locale, Result result) {
		List<String> infoMessages = new ArrayList<>();
		List<String> warnMessages = new ArrayList<>();
		List<String> errorMessages = new ArrayList<>();
		for (Message message : result.getMessages()) {
			String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), locale);
			switch (message.getLevel()) {
			case INFO:
				infoMessages.add(textMessage);
				break;
			case WARN:
				warnMessages.add(textMessage);
				break;
			case ERROR:
				errorMessages.add(textMessage);
				break;
			default:
				break;
			}
		}
		model.addAttribute(INFO_MESSAGE_ATTR_KEY, infoMessages);
		model.addAttribute(WARN_MESSAGE_ATTR_KEY, warnMessages);
		model.addAttribute(ERROR_MESSAGE_ATTR_KEY, errorMessages);
	}

	/**
	 * メッセージを保存する（Redirect用）
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model RedirectAttributesオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param result Controller側でエラーレベル、メッセージキー等をセットしたResultオブジェクト
	 */
	public static void saveMessage(MessageSource messageSource, RedirectAttributes model,
			Locale locale, Result result) {
		List<String> infoMessages = new ArrayList<>();
		List<String> warnMessages = new ArrayList<>();
		List<String> errorMessages = new ArrayList<>();
		for (Message message : result.getMessages()) {
			String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), locale);
			switch (message.getLevel()) {
			case INFO:
				infoMessages.add(textMessage);
				break;
			case WARN:
				warnMessages.add(textMessage);
				break;
			case ERROR:
				errorMessages.add(textMessage);
				break;
			default:
				break;
			}
		}
		model.addFlashAttribute(INFO_MESSAGE_ATTR_KEY, infoMessages);
		model.addFlashAttribute(WARN_MESSAGE_ATTR_KEY, warnMessages);
		model.addFlashAttribute(ERROR_MESSAGE_ATTR_KEY, errorMessages);
	}

	/**
	 * Spring用、RedirectのPrefixを付与するメソッド
	 * @param url Redirect先URL
	 * @return Spring書式の文字列
	 */
	public static String redirect(String url) {
		return "redirect:" + url;
	}

	/**
	 * Spring用、ForwardのPrefixを付与するメソッド
	 * @param methodName Forward先メソッド名
	 * @return Spring書式の文字列
	 */
	public static String forward(String methodName) {
		return "forward:" + methodName;
	}

//	/**
//	 * Overload
//	 * @see ControllerUtils#saveFieldError(BindingResult bindingResult,
//	 *      Object formBean, String[] errorItem, String key, String[]
//	 *      arguments)
//	 * @param bindingResult Springのvalidation結果保持オブジェクト
//	 * @param formBean 画面FormBeanオブジェクト
//	 * @param errorItem エラー項目名
//	 * @param key エラーメッセージキー
//	 */
//	public static void saveFieldError(BindingResult bindingResult,
//			Object formBean,
//			String errorItem,
//			String key) {
//		saveFieldError(bindingResult, formBean, errorItem, key, null);
//	}
//
//	/**
//	 * 項目エラー共通メソッド
//	 * @param bindingResult Springのvalidation結果保持オブジェクト
//	 * @param formBean 画面FormBeanオブジェクト
//	 * @param errorItem エラー項目名
//	 * @param key エラーメッセージキー
//	 * @param arguments エラーメッセージ引数
//	 */
//	public static void saveFieldError(
//			BindingResult bindingResult,
//			Object formBean,
//			String errorItem,
//			String key,
//			String[] arguments) {
//
//		// formBeanのフルパスClass名からClass名を切り出して、先頭を小文字化
//		String clazzName = formBean.getClass().getName();
//		String objectName = StringUtils.uncapitalize(
//				clazzName.substring(clazzName.lastIndexOf(".") + 1));
//
//		// reflectionを使用してFormBeanオブジェクトの値を取得
//		String rejectedValue = "";
//		Class<?> clazz = formBean.getClass();
//		try {
//			Field field = clazz.getDeclaredField(errorItem);
//			// private変数もアクセス可能とする
//			field.setAccessible(true);
//
//			rejectedValue = (String) field.get(formBean);
//		} catch (Exception e) {
//			// 項目名設定ミスを製造時に検知できるようにするため、例外は処理せずにthrowする
//			throw new IllegalArgumentException("not exists param：" + errorItem);
//		}
//
//		// MultiField用設定、Keyがnull以外の場合にString配列とする
//		String[] keys = null;
//		if (key != null) {
//			keys = new String[] { key };
//		}
//
//		// エラーを生成、セット
//		FieldError error = new FieldError(objectName,
//				errorItem,
//				rejectedValue,
//				false,
//				keys,
//				arguments,
//				"");
//		bindingResult.addError(error);
//	}
//
//	/**
//	 * Overload
//	 * @see ControllerUtils#saveMultiFieldError(BindingResult bindingResult,
//	 *      Object formBean, String[] errorItems, String key, String[]
//	 *      arguments)
//	 * @param bindingResult Springのvalidation結果保持オブジェクト
//	 * @param formBean 画面FormBeanオブジェクト
//	 * @param errorItems エラー項目名
//	 * @param key  エラーメッセージキー
//	 */
//	public static void saveMultiFieldError(BindingResult bindingResult,
//			Object formBean,
//			String[] errorItems,
//			String key) {
//		saveMultiFieldError(bindingResult, formBean, errorItems, key, null);
//	}
//
//	/**
//	 * 複数項目エラー共通メソッド
//	 * @param bindingResult Springのvalidation結果保持オブジェクト
//	 * @param formBean 画面FormBeanオブジェクト
//	 * @param errorItems エラー項目名
//	 * @param key エラーメッセージキー
//	 * @param arguments エラーメッセージ引数
//	 */
//	public static void saveMultiFieldError(BindingResult bindingResult,
//			Object formBean,
//			String[] errorItems,
//			String key,
//			String[] arguments) {
//		// 複数個同時に項目エラーとする場合、メッセージ表示は先頭1項目のみとする
//		for (int i = 0; i < errorItems.length; i++) {
//			String item = errorItems[i];
//			if (i == 0) {
//				saveFieldError(bindingResult, formBean, item, key, arguments);
//			} else {
//				saveFieldError(bindingResult, formBean, item, null, null);
//			}
//		}
//	}
}
