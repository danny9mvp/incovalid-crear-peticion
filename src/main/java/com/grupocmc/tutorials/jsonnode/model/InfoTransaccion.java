package com.grupocmc.tutorials.jsonnode.model;

public class InfoTransaccion {
	private double codTipoMoneda;
	private double monto;
	public double getCodTipoMoneda() {
		return codTipoMoneda;
	}
	public void setCodTipoMoneda(double codTipoMoneda) {
		this.codTipoMoneda = codTipoMoneda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "InfoTransaccion [codTipoMoneda=" + codTipoMoneda + ", monto=" + monto + "]";
	}
}
