package com.rdjaramillo.core.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="repuesto")
public class Repuesto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idrepuesto;
	
	@Column(name="nombrerepuesto", length=350)
	private String nombrerepuesto;
	
	@OneToOne
	private TipoProducto tpproductorepuestos;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkrepuestoproducto", targetEntity = Producto.class)
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Repuesto() {}


	public Repuesto(long idrepuesto, String nombrerepuesto, TipoProducto tpproductorepuestos, Producto producto) {
		this.idrepuesto = idrepuesto;
		this.nombrerepuesto = nombrerepuesto;
		this.tpproductorepuestos = tpproductorepuestos;
		this.producto = producto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idrepuesto ^ (idrepuesto >>> 32));
		result = prime * result + ((nombrerepuesto == null) ? 0 : nombrerepuesto.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((tpproductorepuestos == null) ? 0 : tpproductorepuestos.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repuesto other = (Repuesto) obj;
		if (idrepuesto != other.idrepuesto)
			return false;
		if (nombrerepuesto == null) {
			if (other.nombrerepuesto != null)
				return false;
		} else if (!nombrerepuesto.equals(other.nombrerepuesto))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (tpproductorepuestos == null) {
			if (other.tpproductorepuestos != null)
				return false;
		} else if (!tpproductorepuestos.equals(other.tpproductorepuestos))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Repuesto [idrepuesto=" + idrepuesto + ", nombrerepuesto=" + nombrerepuesto + ", tpproductorepuestos="
				+ tpproductorepuestos + ", producto=" + producto + "]";
	}
	
	
		
	
}
