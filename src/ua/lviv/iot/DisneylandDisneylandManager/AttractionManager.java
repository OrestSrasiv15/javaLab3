package ua.lviv.iot.DisneylandDisneylandManager;

import ua.lviv.iot.Attraction.*;
import java.util.List;

public interface AttractionManager {
	public List<Attraction> findAttraction(List<Attraction> attractionsToSort, boolean ascending);

	public void sortAttractionByPrice(boolean price);

	public void sortAttractinByMaxChildrenCount(boolean sortOrder);

}
