package com.olympus.hora.mvcbase;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.hora.common.web.util.RequestUtil;

public class SimpleInterceptor implements HandlerInterceptor {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.debug("preHandle");
		setupLogs(request);
		logger.info("RequestURI : {}", request.getRequestURI());
		if (AccessContext.isExistAccessContextOnThread()) {
			// 既に設定されていたら何もしないで次へ
			// (二度呼び出しされたときのために念のため)
		} else {
			AccessContext accessContext = new AccessContext();
			// [アクセス日時]
			accessContext.setAccessLocalDateTime(LocalDateTime.now());
			// [アクセスユーザ]
			accessContext.setAccessUser("SYSTEM");
			accessContext.setAccessProcess("app");
			AccessContext.setAccessContextOnThread(accessContext);
		}

		return true;
	}

	private void setupLogs(HttpServletRequest request) {
		// SESSION ID
		HttpSession session = request.getSession(false);
		if (session == null) {
			MDC.put("sessionId", "no-session");
		} else {
			MDC.put("sessionId", session.getId());
		}
		// リモートIPアドレス
		MDC.put("remoteAddr", RequestUtil.getRemoteAddr(request));
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		logger.debug("postHandle");
		if (modelAndView != null) {
			response.setHeader("X-Frame-Options", "DENY");
			response.setHeader("X-XSS-Protection", "1");
			response.setHeader("X-Content-Type-Options", "nosniff");
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Expires", "-1");
			if (!modelAndView.getViewName().startsWith("redirect:")) {
				// TODO MessageのFlashAttribute
			}
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		AccessContext.clearAccessContextOnThread();
		MDC.clear();
	}

}