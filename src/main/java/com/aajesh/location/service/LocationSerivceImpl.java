package com.aajesh.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aajesh.location.entities.Location;
import com.aajesh.location.repos.LocationRepository;

@Service
public class LocationSerivceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;
	

	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return locationRepository.save(location);
	}

	
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub

	   locationRepository.delete(location);
	}


	public Optional<Location> getLocationById(int id) {
		// TODO Auto-generated method stub
		
		 return locationRepository.findById(id);
	}

	
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	public LocationRepository getLocationRepository() {
		return locationRepository;
	}


	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}


}
