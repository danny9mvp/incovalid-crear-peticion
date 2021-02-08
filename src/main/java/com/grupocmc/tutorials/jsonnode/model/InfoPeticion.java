package com.grupocmc.tutorials.jsonnode.model;

public class InfoPeticion {
	private InfoTitular infoTitular;
	private InfoTransaccion infoTransaccion;
	private InfoReporte infoReporte;
	public InfoPeticion() {/*Default constructor*/}
	
	public InfoPeticion(InfoTitular infoTitular, InfoTransaccion infoTransaccion, InfoReporte infoReporte) {
		this.infoTitular = infoTitular;
		this.infoTransaccion = infoTransaccion;
		this.infoReporte = infoReporte;
	}
	public InfoTitular getInfoTitular() {
		return infoTitular;
	}
	public void setInfoTitular(InfoTitular infoTitular) {
		this.infoTitular = infoTitular;
	}
	public InfoTransaccion getInfoTransaccion() {
		return infoTransaccion;
	}
	public void setInfoTransaccion(InfoTransaccion infoTransaccion) {
		this.infoTransaccion = infoTransaccion;
	}
	public InfoReporte getInfoReporte() {
		return infoReporte;
	}
	public void setInfoReporte(InfoReporte infoReporte) {
		this.infoReporte = infoReporte;
	}
	@Override
	public String toString() {
		return "InfoPeticion [infoTitular=" + infoTitular + ", infoTransaccion=" + infoTransaccion + ", infoReporte="
				+ infoReporte + "]";
	}
	
}
