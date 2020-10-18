package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(){
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	public Jugador(String name, int edad, String posi, short goles, byte dorsal){
		super(name, edad, posi);
		this.golesMarcados=goles;
		this.dorsal=dorsal;
	}
	public int compareTo(Object f) {
		int dif=0;
		
		if(this.getEdad()>=((Futbolista) f).getEdad()) {
			dif=this.getEdad()-((Futbolista) f).getEdad();
		}
		else {
			dif=((Futbolista) f).getEdad()-this.getEdad();
		}
		return dif;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+
				" con el dorsal " +this.dorsal+". Ha marcado "+this.golesMarcados;
	}

	
	
	
}
