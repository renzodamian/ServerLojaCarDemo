package com.rdjaramillo.core.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdjaramillo.core.Entity.Producto;


@Repository("repositorioproducto")
public interface ProductoRepository extends JpaRepository<Producto, Serializable>{
	
	public abstract List<Producto>findByIdproducto (long idproducto);
	
	public abstract Producto findByIdproductoAndNombreproducto(long idproducto, String nombreproducto);
}
