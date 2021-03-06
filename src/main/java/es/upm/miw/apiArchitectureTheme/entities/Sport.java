package es.upm.miw.apiArchitectureTheme.entities;

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
		return o instanceof Sport
				&& ((Sport)o).getName().equals(name);
	}
	
}
