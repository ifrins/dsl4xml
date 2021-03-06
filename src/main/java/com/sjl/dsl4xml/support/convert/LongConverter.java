package com.sjl.dsl4xml.support.convert;

import com.sjl.dsl4xml.support.*;

public class LongConverter implements Converter<Long> {

	@Override
	public boolean canConvertTo(Class<?> aClass) {
		return aClass.isAssignableFrom(Long.class);
	}

	@Override
	public Long convert(String aValue) {
		return ((aValue == null) || ("".equals(aValue))) ? null : new Long(aValue);
	}
	
}

