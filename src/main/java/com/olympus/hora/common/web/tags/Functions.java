package com.olympus.hora.common.web.tags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import org.dbflute.optional.OptionalEntity;

public class Functions {

	public static boolean contains(Collection<?> collection, Object value) {
		if (collection == null) {
			return false;
		}
		return collection.contains(value);
	}
	public static <T> T optional(OptionalEntity<T> optionalEntity) {
		return optionalEntity.get();
	}
	
	public static String dateF(LocalDate date, String pattern) {
		if(date == null) {
			return "";
		}
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(date);
	}
	public static String timeF(LocalTime time, String pattern) {
		if(time == null) {
			return "";
		}
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(time);
	}
	public static String dateTimeF(LocalDateTime dateTime, String pattern) {
		if(dateTime == null) {
			return "";
		}
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(dateTime);
	}
	
//	public static String action(PageContext pageContext) {
//		RequestContext requestContext = (RequestContext) pageContext.getAttribute(RequestContextAwareTag.REQUEST_CONTEXT_PAGE_ATTRIBUTE);
//		if (requestContext == null) {
//			requestContext = new JspAwareRequestContext(pageContext);
//			pageContext.setAttribute(RequestContextAwareTag.REQUEST_CONTEXT_PAGE_ATTRIBUTE, requestContext);
//		}
//		
//		return requestContext.getRequestUri();
//	}
	
	
}
