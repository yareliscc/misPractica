package com.vuelo.aerolinea.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	private static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id_vuelo;
	@Column(name="codigo_vuelo")
	private String codigoVuelo;
	private boolean estado_vuelo;
	private String origen;
	private String destino;

	@OneToMany(mappedBy="vuelo", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Tarifa> tarifa;
	
	public Vuelo(){
		
	}

	public long getId_vuelo() {
		return id_vuelo;
	}

	public void setId_vuelo(long id_vuelo) {
		this.id_vuelo = id_vuelo;
	}

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	public boolean isEstado_vuelo() {
		return estado_vuelo;
	}

	public void setEstado_vuelo(boolean estado_vuelo) {
		this.estado_vuelo = estado_vuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<Tarifa> getTarifa() {
		return tarifa;
	}

	public void setTarifa(List<Tarifa> tarifa) {
		this.tarifa = tarifa;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}


	
	
}
