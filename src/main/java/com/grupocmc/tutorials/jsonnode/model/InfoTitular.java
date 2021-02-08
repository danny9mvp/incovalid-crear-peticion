package com.grupocmc.tutorials.jsonnode.model;

public class InfoTitular {
	private String primerNombre;
	private String codBin;
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getCodBin() {
		return codBin;
	}
	public void setCodBin(String codBin) {
		this.codBin = codBin;
	}
	@Override
	public String toString() {
		return "InfoTitular [primerNombre=" + primerNombre + ", codBin=" + codBin + "]";
	}
	
}
