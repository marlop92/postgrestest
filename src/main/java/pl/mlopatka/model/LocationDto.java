package pl.mlopatka.model;

import java.time.ZoneId;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by marcin.lopatka on 12-07-2019
 */
@XmlRootElement
public class LocationDto {
	
	private Integer locationId;
	private ZoneId timezoneId;
	
	public LocationDto() {
	}
	
	public LocationDto(final Integer locationId, final ZoneId timezoneId) {
		this.locationId = locationId;
		this.timezoneId = timezoneId;
	}
	
	public Integer getLocationId() {
		return locationId;
	}
	
	public void setLocationId(final Integer locationId) {
		this.locationId = locationId;
	}
	
	public ZoneId getTimezoneId() {
		return timezoneId;
	}
	
	public void setTimezoneId(final ZoneId timezoneId) {
		this.timezoneId = timezoneId;
	}
}
