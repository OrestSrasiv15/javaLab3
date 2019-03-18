package ua.lviv.iot.Attraction;

import java.util.EnumSet;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.Child;
import ua.lviv.iot.Attraction.Disneyland;
import ua.lviv.iot.Attraction.Karting;
import ua.lviv.iot.DisneylandDisneylandManager.*;

import java.util.ArrayList;
import ua.lviv.iot.Attraction.*;


public class Main {

	public static void main(String[] args) {
		Attraction Aayr = new Attraction(30d,40);
		AttractionManagerImpl CAttractionManager = new AttractionManagerImpl();
		
		Attraction Far = new Attraction(45,50);
		Attraction Child = new Child(60, 50);
		
		
	    CAttractionManager.addAttraction(Far);
		CAttractionManager.addAttraction(Child);
		CAttractionManager.addAttraction(Aayr);
		
		CAttractionManager.sortAttractionByPrice(false);
		
		
//	   AttractionManagerImpl manager = new AttractionManagerImpl();
//	  List<Attraction> attraction = manager.findAttraction(dangerLevel).
//       attraction.forEach((Attractions attraction) -> {
//           System.out.println(attraction);
//       });
		
		
		
	}
}
