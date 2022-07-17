package com.comunicacaoserialarduino.ComunicacaoSerialArduino.controller;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacaoRepository extends CrudRepository<Informacao, Long> {
	
	

}
