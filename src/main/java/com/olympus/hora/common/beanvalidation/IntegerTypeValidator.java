/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olympus.hora.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author chinpei
 */
public class IntegerTypeValidator implements ConstraintValidator<IntegerType, CharSequence> {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void initialize(IntegerType annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}
		try {
			Integer.parseInt(charSequence.toString());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
