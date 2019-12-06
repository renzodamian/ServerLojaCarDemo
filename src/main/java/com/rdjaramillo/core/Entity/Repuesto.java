package com.rdjaramillo.core.Entity;
/*
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

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idrepuesto;
	
	@Column(name="nombrerepuesto", length=350)
	private String nombrerepuesto;
	
	
	 @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "tipoproducto_id")
	    private TipoProducto tipoproductorepuesto;

	 
	public Repuesto() {
		super();
	}

	public Repuesto(long idrepuesto, String nombrerepuesto, TipoProducto tipoproductorepuesto) {
		super();
		this.idrepuesto = idrepuesto;
		this.nombrerepuesto = nombrerepuesto;
		this.tipoproductorepuesto = tipoproductorepuesto;
	}
	

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

	public TipoProducto getTipoproductorepuesto() {
		return tipoproductorepuesto;
	}

	public void setTipoproductorepuesto(TipoProducto tipoproductorepuesto) {
		this.tipoproductorepuesto = tipoproductorepuesto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Repuesto [idrepuesto=" + idrepuesto + ", nombrerepuesto=" + nombrerepuesto + ", tipoproductorepuesto="
				+ tipoproductorepuesto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idrepuesto ^ (idrepuesto >>> 32));
		result = prime * result + ((nombrerepuesto == null) ? 0 : nombrerepuesto.hashCode());
		result = prime * result + ((tipoproductorepuesto == null) ? 0 : tipoproductorepuesto.hashCode());
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
		if (tipoproductorepuesto == null) {
			if (other.tipoproductorepuesto != null)
				return false;
		} else if (!tipoproductorepuesto.equals(other.tipoproductorepuesto))
			return false;
		return true;
	}
	
	
}*/