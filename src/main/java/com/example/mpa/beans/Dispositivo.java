package com.example.mpa.beans;



public class Dispositivo {
	
	private String movil;
	
	private String laptop;

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getLaptop() {
		return laptop;
	}

	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	
	public Dispositivo(String movil, String laptop){
		this.movil = movil;
		this.laptop = laptop;
	}
	
	public Dispositivo(){
		
	}

//	@Override
//	public String toString() {		
//		return super.toString();
//	}
	
	

}
