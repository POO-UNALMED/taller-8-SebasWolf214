package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	final private String posicion;
	
	public Futbolista(){
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String name, int edad, String posicion){
		this.setNombre(name);
		this.setEdad(edad);
		this.posicion=posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		boolean dif;
			if(this == f) {
				dif=true;
			}
			else {
				dif=false;
			}
		return dif;
	}
	
	public abstract boolean jugarConLasManos();

	
}
