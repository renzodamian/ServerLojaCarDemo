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
@Table(name="tipoproducto")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idtipoproducto;
	
	@Column(name="nombretipoproducto", length=350)
	private String nombretipoproducto;
	
	
	/*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tpproductorepuestos", targetEntity = Repuesto.class)
	private Repuesto repuesto;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tpproductovehiculo", targetEntity = Vehiculo.class)
	private Vehiculo vehiculo;*/
	
	/*@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fktpproducto", targetEntity = Producto.class)
	private Producto producto;*/

	@OneToOne(fetch = FetchType.LAZY,
	           cascade =  CascadeType.ALL,
	           mappedBy = "tipoproductovehiculo")
	private Vehiculo vehiculo;

	public TipoProducto() {
		super();
	}


	public TipoProducto(long idtipoproducto, String nombretipoproducto, Vehiculo vehiculo) {
		super();
		this.idtipoproducto = idtipoproducto;
		this.nombretipoproducto = nombretipoproducto;
		this.vehiculo = vehiculo;
	}



	public long getIdtipoproducto() {
		return idtipoproducto;
	}


	public void setIdtipoproducto(long idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
	}


	public String getNombretipoproducto() {
		return nombretipoproducto;
	}


	public void setNombretipoproducto(String nombretipoproducto) {
		this.nombretipoproducto = nombretipoproducto;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idtipoproducto ^ (idtipoproducto >>> 32));
		result = prime * result + ((nombretipoproducto == null) ? 0 : nombretipoproducto.hashCode());
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
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
		TipoProducto other = (TipoProducto) obj;
		if (idtipoproducto != other.idtipoproducto)
			return false;
		if (nombretipoproducto == null) {
			if (other.nombretipoproducto != null)
				return false;
		} else if (!nombretipoproducto.equals(other.nombretipoproducto))
			return false;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TipoProducto [idtipoproducto=" + idtipoproducto + ", nombretipoproducto=" + nombretipoproducto
				+ ", vehiculo=" + vehiculo + "]";
	}

	
	  
}
