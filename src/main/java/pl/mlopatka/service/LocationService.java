package pl.mlopatka.service;

import org.springframework.stereotype.Service;

import pl.mlopatka.model.LocationDto;
import pl.mlopatka.model.enitity.Location;
import pl.mlopatka.repo.LocationRepo;

/**
 * Created by marcin.lopatka on 12-07-2019
 */

@Service
public class LocationService {
	
	private LocationRepo repo;
	
	public LocationService(final LocationRepo repo) {
		this.repo = repo;
	}
	
	public LocationDto getLocation(Integer id) {
		Location location = repo.getOne(id);
		return convert(location);
	}
	
	private LocationDto convert(Location location) {
		return new LocationDto(location.getLocationId(), location.getTimezoneId());
	}
}
