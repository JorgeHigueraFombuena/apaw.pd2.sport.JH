package es.upm.miw.apiArchitectureTheme.entities;

import es.upm.miw.apiArchitectureTheme.wrappers.SportWrapper;

public class Sport {
	
	private int id;
	
	private String name;

	public Sport(String name){
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{\"name\":\"" + name + "}";
	}	
	
	@Override
	public boolean equals(Object o){
		return o instanceof SportWrapper
				&& ((SportWrapper)o).getName().equals(name);
	}
	
}
