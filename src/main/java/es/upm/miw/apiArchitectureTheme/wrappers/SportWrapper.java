package es.upm.miw.apiArchitectureTheme.wrappers;

public class SportWrapper {

	private String name;
	
	public SportWrapper(String name){
		this.name = name;
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
