package pl.mlopatka.model.enitity;

import java.time.ZoneId;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import pl.mlopatka.converter.ZoneIdConverter;

/**
 * Created by marcin.lopatka on 12-07-2019
 */
@Entity
@Table(name = "tab_tislot_location", schema = "tsm")
public class Location {
	
	@Id
	@Column(name = "location_id", nullable = false, unique = true, updatable = false)
	private Integer locationId;
	
	@Column(name = "timezone_id")
	@Convert(converter = ZoneIdConverter.class)
	private ZoneId timezoneId;
	
	public Location() {
	}
	
	public Location(final Integer locationId, final ZoneId timezoneId) {
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
