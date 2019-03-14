package ua.lviv.iot.DisneylandDisneylandManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.DangerLevel;
import ua.lviv.iot.Attraction.Disneyland;


public class AttractionManager {
	List<Attraction> AttractionList = new ArrayList<>();
	private List<Attraction> level;

	//public void toAdd(DangerLevel dangerlevel) {
		//DangerLevel.add(dangerlevel);
	//}

	public static void sortAttractionByPrice(List<Attraction> attractions, boolean UpToLowToUP) {
		if (UpToLowToUP) {
			Collections.sort(attractions, Comparator.comparing(Attraction::getPriceOfTicket));
		}
		else {
			Collections.sort(attractions, Comparator.comparing(Attraction::getPriceOfTicket).reversed());
		}
	}
	
	Attraction date = new Attraction();
	date.getDangerLevel();
	
	public List<Attraction> 
	findAttraction(DangerLevel dangerLevel) {
	    List<Attraction> AttractionList = level;
	    List<Attraction> findAttraction = AttractionList.stream().filter(level -> ((Object) level).getDangerLevel == dangerLevel).collect(Collectors.toList());
	  
	    return AttractionList;
		

	}

	public void toAdd(Attraction aayr) {
		// TODO Auto-generated method stub
		
	}
} 