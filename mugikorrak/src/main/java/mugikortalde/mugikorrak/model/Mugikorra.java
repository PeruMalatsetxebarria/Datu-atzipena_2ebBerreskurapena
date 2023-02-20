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



	private String tamaina;
    private String resoluzioa;
	private String mota;



	private List<String> ezaugarri_berezi;


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





	/*public List<String> getPantaila() {
		return pantaila;
	}

	public void setPantaila(List<String> pantaila) {
		this.pantaila = pantaila;
	}*/

	public String getTamaina() {
		//tamaina = pantaila.get(0);
		return tamaina;
	}

	public void setTamaina(String tamaina) {
		this.tamaina = tamaina;
	}

	public String getResoluzioa() {
		return resoluzioa;
	}

	public void setResoluzioa(String resoluzioa) {
		this.resoluzioa = resoluzioa;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}





	public List<String> getEzaugarri_berezi() {
		return ezaugarri_berezi;
	}

	public void setEzaugarri_berezi(List<String> ezaugarri_berezi) {
		this.ezaugarri_berezi = ezaugarri_berezi;
	}




	@Override
	public String toString() {
        return "Mugikorra [marka=" + marka + ", modeloa=" + modeloa + ", urtea=" + urtea + ", ram=" + ram + ", sistema eragilea=" + sistema_eragilea + ", pantaila-tamaina=" + tamaina + ", pantaila-resoluzioa=" + resoluzioa + ", pantaila-mota=" + mota + ", ezaugarri berezi aipagarriak=" + ezaugarri_berezi + "]";
	}
}
