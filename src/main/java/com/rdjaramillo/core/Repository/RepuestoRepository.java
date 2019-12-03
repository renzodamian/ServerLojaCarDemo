package com.rdjaramillo.core.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdjaramillo.core.Entity.Repuesto;

@Repository("repositoriorepuesto")
public interface RepuestoRepository extends JpaRepository<Repuesto, Serializable> {
	
	
	public abstract List<Repuesto>findByNombrerepuesto(String nombrerepuesto);
	
	public abstract Repuesto findByIdrepuesto(long idrepuesto);
/*
public interface RepuestoRepository extends JpaRepository<Repuesto, Serializable> {
	
	public abstract Repuesto findByNombrerepuesto (String nombrerepuesto);
	public abstract List<Repuesto>findByRepuestos(String nombrerepuesto);
	
	public abstract Repuesto findByIdRepuesto(long idrepuesto);
}

*/
}
