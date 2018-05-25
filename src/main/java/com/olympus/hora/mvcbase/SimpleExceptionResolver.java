package com.olympus.hora.mvcbase;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.hora.common.error.ApplicationException;
import com.olympus.hora.common.result.Message;

@Component
public class SimpleExceptionResolver implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "messageSource")
	MessageSource messageSource;

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.error("例外をキャッチしました。", ex);
		ModelAndView mav = new ModelAndView();
		if (ex instanceof ApplicationException) {
			logger.error("アプリケーションエラーが発生しました。", ex);
			ApplicationException systemEx = (ApplicationException) ex;
			Message message = systemEx.getMessageInfo();
			String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), request.getLocale());
			mav.addObject("message", textMessage);
		} else {
			logger.error("不明なシステムエラーが発生しました。", ex);
			// JSPに表示するメッセージをセットします。
			mav.addObject("message", "システムエラーが発生しました。管理者にお問い合わせください。");
		}
		// 遷移先のJSPを指定します。(error.jspに遷移します。)
		mav.setViewName("error");
		return mav;
	}
}