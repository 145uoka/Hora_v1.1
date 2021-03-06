/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olympus.hora.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.olympus.hora.common.util.DateTimeUtil;

/**
 * 時間フォーマット。（※単にDateFormatのメッセージ違い）
 * @author chinpei
 */
public class TimeFormatValidator implements ConstraintValidator<TimeFormat, CharSequence> {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	private TimeFormat timeFormat;

	@Override
	public void initialize(TimeFormat annotation) {
		this.timeFormat = annotation;
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if(charSequence == null) {
			// 未入力の場合は、チェックしない
			return true;
		}
		return DateTimeUtil.isLocalTime(charSequence.toString(), this.timeFormat.format());
	}
}
