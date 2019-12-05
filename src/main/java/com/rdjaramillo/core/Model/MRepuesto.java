package com.rdjaramillo.core.Model;

import com.rdjaramillo.core.Entity.Producto;
import com.rdjaramillo.core.Entity.Repuesto;
import com.rdjaramillo.core.Entity.TipoProducto;

public class MRepuesto {
	public MRepuesto () {}
	

	
	
	

	public MRepuesto(long idrepuesto, String nombrerepuesto, TipoProducto tpproductorepuestos, Producto producto) {
		this.idrepuesto = idrepuesto;
		this.nombrerepuesto = nombrerepuesto;
		this.tpproductorepuestos = tpproductorepuestos;
		this.producto = producto;
	}

	public MRepuesto(Repuesto repuesto) {
		this.idrepuesto = repuesto.getIdrepuesto();
		this.nombrerepuesto = repuesto.getNombrerepuesto();
		this.tpproductorepuestos = repuesto.getTpproductorepuestos();
		this.producto = repuesto.getProducto();
	}

	private long idrepuesto;
	private String nombrerepuesto;
	private TipoProducto tpproductorepuestos;
	private Producto producto;
	
	
	public long getIdrepuesto() {
		return idrepuesto;
	}

	public void setIdrepuesto(long idrepuesto) {
		this.idrepuesto = idrepuesto;
	}


	public String getNombrerepuesto() {
		return nombrerepuesto;
	}

	public void setNombrerepuesto(String nombrerepuesto) {
		this.nombrerepuesto = nombrerepuesto;
	}


	public TipoProducto getTpproductorepuestos() {
		return tpproductorepuestos;
	}

	public void setTpproductorepuestos(TipoProducto tpproductorepuestos) {
		this.tpproductorepuestos = tpproductorepuestos;
	}


	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
