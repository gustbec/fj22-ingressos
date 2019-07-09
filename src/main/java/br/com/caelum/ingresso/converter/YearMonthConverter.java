package br.com.caelum.ingresso.converter;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

import br.com.caelum.ingresso.exceptions.DataInvalidaException;

public class YearMonthConverter implements Converter<String, YearMonth> {
	@Override
	public YearMonth convert(String text) {
		return YearMonth.parse(text, DateTimeFormatter.ofPattern("MM/yyyy"));

	}
}
