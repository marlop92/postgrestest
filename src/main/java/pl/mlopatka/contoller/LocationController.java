package pl.mlopatka.contoller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.mlopatka.model.LocationDto;
import pl.mlopatka.service.LocationService;

/**
 * Created by marcin.lopatka on 12-07-2019
 */

@RestController
@RequestMapping("locations")
public class LocationController {
	
	private LocationService locationService;
	
	public LocationController(final LocationService locationService) {
		this.locationService = locationService;
	}
	
	@GetMapping(name = "/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public LocationDto getLocation(final @PathVariable("id") Integer id) {
		return locationService.getLocation(id);
	}
}
