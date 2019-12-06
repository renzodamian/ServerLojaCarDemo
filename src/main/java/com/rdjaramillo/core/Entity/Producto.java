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
@Table(name="producto")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idproducto;
	
	@Column(name="nombreproducto", length=350)
	private String nombreproducto;
	/*
	@OneToOne
	private TipoProducto fktpproducto;
	*/
	@OneToOne
	private Vehiculo fkvehiculoproducto;
	
	/*@OneToOne
	private Repuesto fkrepuestoproducto;
	*/
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkcliente", targetEntity = PedidoCliente.class)
	private PedidoCliente  pedidocliente;
	
	@OneToOne
	private Consecionario fkconsecionario;

	public long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	
	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public Vehiculo getFkvehiculoproducto() {
		return fkvehiculoproducto;
	}

	public void setFkvehiculoproducto(Vehiculo fkvehiculoproducto) {
		this.fkvehiculoproducto = fkvehiculoproducto;
	}

	/*public Repuesto getFkrepuestoproducto() {
		return fkrepuestoproducto;
	}

	public void setFkrepuestoproducto(Repuesto fkrepuestoproducto) {
		this.fkrepuestoproducto = fkrepuestoproducto;
	}*/

	public PedidoCliente getPedidocliente() {
		return pedidocliente;
	}

	public void setPedidocliente(PedidoCliente pedidocliente) {
		this.pedidocliente = pedidocliente;
	}

	public Consecionario getFkconsecionario() {
		return fkconsecionario;
	}

	public void setFkconsecionario(Consecionario fkconsecionario) {
		this.fkconsecionario = fkconsecionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Producto(long idproducto, String nombreproducto, Vehiculo fkvehiculoproducto, PedidoCliente pedidocliente,
			Consecionario fkconsecionario) {
		super();
		this.idproducto = idproducto;
		this.nombreproducto = nombreproducto;
		this.fkvehiculoproducto = fkvehiculoproducto;
		this.pedidocliente = pedidocliente;
		this.fkconsecionario = fkconsecionario;
	}

	public Producto() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fkconsecionario == null) ? 0 : fkconsecionario.hashCode());
		result = prime * result + ((fkvehiculoproducto == null) ? 0 : fkvehiculoproducto.hashCode());
		result = prime * result + (int) (idproducto ^ (idproducto >>> 32));
		result = prime * result + ((nombreproducto == null) ? 0 : nombreproducto.hashCode());
		result = prime * result + ((pedidocliente == null) ? 0 : pedidocliente.hashCode());
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
		Producto other = (Producto) obj;
		if (fkconsecionario == null) {
			if (other.fkconsecionario != null)
				return false;
		} else if (!fkconsecionario.equals(other.fkconsecionario))
			return false;
		if (fkvehiculoproducto == null) {
			if (other.fkvehiculoproducto != null)
				return false;
		} else if (!fkvehiculoproducto.equals(other.fkvehiculoproducto))
			return false;
		if (idproducto != other.idproducto)
			return false;
		if (nombreproducto == null) {
			if (other.nombreproducto != null)
				return false;
		} else if (!nombreproducto.equals(other.nombreproducto))
			return false;
		if (pedidocliente == null) {
			if (other.pedidocliente != null)
				return false;
		} else if (!pedidocliente.equals(other.pedidocliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", nombreproducto=" + nombreproducto + ", fkvehiculoproducto="
				+ fkvehiculoproducto + ", pedidocliente=" + pedidocliente + ", fkconsecionario=" + fkconsecionario
				+ "]";
	}

	
	

}
