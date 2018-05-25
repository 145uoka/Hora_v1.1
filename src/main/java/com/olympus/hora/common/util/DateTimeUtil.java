package com.olympus.hora.common.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.apache.commons.lang3.StringUtils;

public class DateTimeUtil {

	public static final String DEFAULT_DATE_FORMAT = "uuuu/M/d";
	public static final String DEFAULT_TIME_FORMAT = "HH:mm";

	public static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMAT);
	public static final DateTimeFormatter DEFAULT_TIME_FORMATTER = DateTimeFormatter.ofPattern(DEFAULT_TIME_FORMAT);

	public static LocalDate toLocalDate(String yyyyMMdd, DateTimeFormatter formatter) {
		if (StringUtils.isEmpty(yyyyMMdd)) {
			return null;
		}
		return LocalDate.parse(yyyyMMdd, formatter);
	}

	public static LocalDate toLocalDate(String yyyyMMdd, String format) {
		return toLocalDate(yyyyMMdd, DateTimeFormatter.ofPattern(format));
	}

	public static LocalDate toLocalDate(String yyyyMMdd) {
		return toLocalDate(yyyyMMdd, DEFAULT_DATE_FORMATTER);
	}

	public static LocalTime toLocalTime(String hhmm, DateTimeFormatter formatter) {
		if (StringUtils.isEmpty(hhmm)) {
			return null;
		}
		return LocalTime.parse(hhmm, formatter);
	}

	public static LocalTime toLocalTime(String hhmm, String format) {
		return toLocalTime(hhmm, DateTimeFormatter.ofPattern(format));
	}

	public static LocalTime toLocalTime(String hhmm) {
		return toLocalTime(hhmm, DEFAULT_TIME_FORMATTER);
	}

	public static boolean isLocalDate(String text, DateTimeFormatter formatter) {
		try {
			toLocalDate(text, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	public static boolean isLocalDate(String text, String format) {
		return isLocalDate(text, DateTimeFormatter.ofPattern(format));
	}

	public static boolean isLocalDate(String text) {
		return isLocalDate(text, DEFAULT_DATE_FORMATTER);
	}

	public static boolean isLocalTime(String text, DateTimeFormatter formatter) {
		try {
			toLocalTime(text, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	public static boolean isLocalTime(String text, String format) {
		return isLocalTime(text, DateTimeFormatter.ofPattern(format));
	}

	public static boolean isLocalTime(String text) {
		return isLocalTime(text, DEFAULT_TIME_FORMATTER);
	}

}
