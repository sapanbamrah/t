package com.australia.telize.repository;

import com.australia.telize.domain.GeoLocation;

public interface TelizeRepository {

	GeoLocation getGeoLocation();

	// Overloaded method
	GeoLocation getGeoLocation(String xForwardedIP);

}
