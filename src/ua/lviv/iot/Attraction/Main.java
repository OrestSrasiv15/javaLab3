package ua.lviv.iot.Attraction;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.Attraction.Attraction;
import ua.lviv.iot.Attraction.Child;
import ua.lviv.iot.Attraction.Disneyland;
import ua.lviv.iot.Attraction.Karting;
import ua.lviv.iot.DisneylandDisneylandManager.*;


public class Main {

	public static void main(String[] args) {
		Attraction Aayr = new Attraction(30d,40);
		AttractionManager CAttractionManager = new AttractionManager();
		
		Attraction Frrrr = new Attraction(45,50);
		Attraction Child = new Child(60, 50);
		
		
		CAttractionManager.toAdd(Frrrr);
		CAttractionManager.toAdd(Aayr);
		CAttractionManager.toAdd(Child);
		
		
		
	}
}
