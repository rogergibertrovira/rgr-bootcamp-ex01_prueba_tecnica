package com.rgibert.pruTec01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgibert.pruTec01.dto.Mensaje;

public interface IMensajeDAO extends JpaRepository<Mensaje, Integer> {

}
