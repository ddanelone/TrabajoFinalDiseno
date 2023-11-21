package com.trabajofinal.dto;


import java.sql.Date;

import com.trabajofinal.models.TipoCobertura;
import com.trabajofinal.models.TipoPago;

public class PolizaDTO {
	
	private String localidad;
	private String marca;
	private String modelo;
	private int anio;
	private String motor;
	private String chasis;
	private String patente;
	private int kilometros;
	private boolean conAlarma;
	private boolean conRastreo;
	private boolean conTuercaAntirrobo;
	private Date fechaInicioVigencia;
	private TipoPago tipoPago;
	private TipoCobertura tipoCobertura;
	
	
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public boolean isConAlarma() {
		return conAlarma;
	}
	public void setConAlarma(boolean conAlarma) {
		this.conAlarma = conAlarma;
	}
	public boolean isConRastreo() {
		return conRastreo;
	}
	public void setConRastreo(boolean conRastreo) {
		this.conRastreo = conRastreo;
	}
	public boolean isConTuercaAntirrobo() {
		return conTuercaAntirrobo;
	}
	public void setConTuercaAntirrobo(boolean conTuercaAntirrobo) {
		this.conTuercaAntirrobo = conTuercaAntirrobo;
	}
	public Date getFechaInicioVigencia() {
		return fechaInicioVigencia;
	}
	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}
	public TipoPago getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	public TipoCobertura getTipoCobertura() {
		return tipoCobertura;
	}
	public void setTipoCobertura(TipoCobertura tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	

}
