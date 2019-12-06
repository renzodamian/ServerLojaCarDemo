package com.rdjaramillo.core.Repository;

import java.io.Serializable;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdjaramillo.core.Entity.TipoProducto;

@Repository("repositoriotipoproducto")
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Serializable> {
	/*
	public abstract List<TipoProducto>findByNombretipoproducto(String nombretipoproducto);
	
	public abstract TipoProducto findByIdtipoproducto(long idtipoproducto);
	*/

}
