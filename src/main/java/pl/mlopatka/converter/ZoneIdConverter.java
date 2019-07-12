package pl.mlopatka.converter;

import java.time.ZoneId;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.springframework.stereotype.Component;

/**
 * Created by marcin.lopatka on 12-07-2019
 */
@Converter
@Component
public class ZoneIdConverter implements AttributeConverter<ZoneId, String> {
	
	@Override
	public String convertToDatabaseColumn(ZoneId attribute) {
		return attribute.getId();
	}
	
	@Override
	public ZoneId convertToEntityAttribute(String dbData) {
		return ZoneId.of( dbData );
	}
}
