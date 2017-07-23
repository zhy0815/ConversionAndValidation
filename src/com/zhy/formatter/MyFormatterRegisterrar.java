package com.zhy.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

public class MyFormatterRegisterrar implements FormatterRegistrar {
	private DateFormatter dateFormatter;
	public DateFormatter getDateFormatter() {
		return dateFormatter;
	}
	public void setDateFormatter(DateFormatter dateFormatter) {
		this.dateFormatter = dateFormatter;
	}
	@Override
	public void registerFormatters(FormatterRegistry arg0) {
		arg0.addFormatter(dateFormatter);
	}

}
