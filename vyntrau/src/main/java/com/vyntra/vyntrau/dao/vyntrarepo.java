package com.vyntra.vyntrau.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vyntra.vyntrau.model.Vyntrauser;

@Repository
public interface vyntrarepo extends JpaRepository<Vyntrauser,Integer> {

}
