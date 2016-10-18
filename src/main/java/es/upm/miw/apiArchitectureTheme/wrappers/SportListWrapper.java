package es.upm.miw.apiArchitectureTheme.wrappers;

import java.util.ArrayList;
import java.util.List;

public class SportListWrapper {

	private List<SportWrapper> sportList = new ArrayList<>();
	
	public SportListWrapper(){
	}

	public List<SportWrapper> getSportList() {
		return sportList;
	}

	public void add(SportWrapper sport){
		sportList.add(sport);
	}
	
	public boolean contains(SportWrapper sport){
		return sportList.contains(sport);
	}
	
	@Override
	public String toString(){
		String result = "{\"sportList\":[";
		for(SportWrapper sportWrapper : sportList){
			result += sportWrapper.toString() + ",";
		}
		return result.substring(0, result.length() - 1) + "]";
	}
}
