package com.comunicacaoserialarduino.ComunicacaoSerialArduino.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Informacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idinfo;
	private String valorinfo;
	private String equipamento;
	private String datainfo;
	
	public String getDatainfo() {
		return datainfo;
	}
	public void setDatainfo(String datainfo) {
		this.datainfo = datainfo;
	}
		
	public Long getIdinfo() {
		return idinfo;
	}
	public void setIdinfo(int idinfo) {
		this.idinfo = (long) idinfo;
	}
	public String getValorinfo() {
		return valorinfo;
	}
	public void setValorinfo(String valorinfo) {
		this.valorinfo = valorinfo;
	}

	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

}
