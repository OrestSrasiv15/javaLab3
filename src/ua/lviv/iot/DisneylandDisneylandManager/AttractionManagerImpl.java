package ua.lviv.iot.DisneylandDisneylandManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.DangerLevel;

public class AttractionManagerImpl implements AttractionManager {
	private List<Attraction> attractions = new LinkedList<>();


		public void sortAttractionByPrice(List<Attraction> attractionsToSort, boolean ascending) {
		if (ascending) {
			Collections.sort(attractionsToSort, Comparator.comparing(Attraction::getPriceOfTicket));
		} else {
			Collections.sort(attractionsToSort, Comparator.comparing(Attraction::getPriceOfTicket).reversed());
		}
	}
	
	public void sortAttractionByPrice(boolean ascending) {
		if (ascending) {
			Collections.sort(attractions, Comparator.comparing(Attraction::getPriceOfTicket));
		} else {
			Collections.sort(attractions, Comparator.comparing(Attraction::getPriceOfTicket).reversed());
		}
	}

	public List<Attraction> findAttraction(final DangerLevel dangerLevel) {
		return attractions.stream()
				.filter(attraction -> (attraction.getDangerLevel() == dangerLevel)).collect(Collectors.toList());


	}
	
	public void addAttraction(Attraction attraction) {
		this.attractions.add(attraction);

	}
	public void sortAttractinByMaxChildrenCount(boolean sortOrder) {
		if (sortOrder) {
			Collections.sort(attractions, Comparator.comparing(Attraction::getMaxNumberOfVisitors));
			
		} else {
			Collections.sort(attractions, Comparator.comparing(Attraction::getMaxNumberOfVisitors).reversed());
		}
	}

	@Override
	public List<Attraction> findAttraction(List<Attraction> attractionsToSort, boolean ascending) {
		// TODO Auto-generated method stub
		return null;
	}

}