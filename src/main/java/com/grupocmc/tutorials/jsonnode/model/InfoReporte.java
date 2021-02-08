package com.grupocmc.tutorials.jsonnode.model;

public class InfoReporte {
	private Integer codMedioVenta;

	public Integer getCodMedioVenta() {
		return codMedioVenta;
	}

	public void setCodMedioVenta(Integer codMedioVenta) {
		this.codMedioVenta = codMedioVenta;
	}

	@Override
	public String toString() {
		return "InfoReporte [codMedioVenta=" + codMedioVenta + "]";
	}
}
