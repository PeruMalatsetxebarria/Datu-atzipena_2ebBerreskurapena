package mugikortalde.mugikorrak.model;

import java.util.List;

import org.bson.types.ObjectId;

public class Mugikorra {
    private ObjectId id;
	private String marka;
    private String modeloa;
    private int urtea;
	private int ram;
	private String sistema_eragilea;
	private int memoria;
    private List<String> pantaila;


    public ObjectId getId() {
		return id; 
		
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

    public String getModeloa() {
		return modeloa;
	}

	public void setModeloa(String modeloa) {
		this.modeloa = modeloa;
	}

	public int getUrtea() {
		return urtea;
	}

	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getSistema_eragilea() {
		return sistema_eragilea;
	}

	public void setSistema_eragilea(String sistema_eragilea) {
		this.sistema_eragilea = sistema_eragilea;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}





	public List<String> getPantaila() {
		return pantaila;
	}

	public void setPantaila(List<String> pantaila) {
		this.pantaila = pantaila;
	}





	@Override
	public String toString() {
        return "Mugikorra [marka=" + marka + ", modeloa=" + modeloa + ", urtea=" + urtea + ", ram=" + ram + ", sistema eragilea=" + sistema_eragilea + ", pantaila=" + pantaila + "]";
	}
}
