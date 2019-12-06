package com.rdjaramillo.core.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idvehiculo;
	
	@Column(name="marca", length=350)
	private String marca;
	
	@Column(name="modelo", length=350)
	private String modelo;
	
	@Column(name="anio", length=350)
	private String anio;
	
	@Column(name="cilindraje", length=350)
	private String cilindraje;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	private TipoProducto tpproductovehiculo;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkvehiculoproducto", targetEntity = Producto.class)
	private Producto producto;*/
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipoproducto_id", nullable = false)
	private TipoProducto tipoproductovehiculo;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(long idvehiculo, String marca, String modelo, String anio, String cilindraje,
			TipoProducto tipoproductovehiculo) {
		super();
		this.idvehiculo = idvehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cilindraje = cilindraje;
		this.tipoproductovehiculo = tipoproductovehiculo;
	}

	public long getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(long idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public TipoProducto getTipoproductovehiculo() {
		return tipoproductovehiculo;
	}

	public void setTipoproductovehiculo(TipoProducto tipoproductovehiculo) {
		this.tipoproductovehiculo = tipoproductovehiculo;
	}

	@Override
	public String toString() {
		return "Vehiculo [idvehiculo=" + idvehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", cilindraje=" + cilindraje + ", tipoproductovehiculo=" + tipoproductovehiculo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + (int) (idvehiculo ^ (idvehiculo >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((tipoproductovehiculo == null) ? 0 : tipoproductovehiculo.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (cilindraje == null) {
			if (other.cilindraje != null)
				return false;
		} else if (!cilindraje.equals(other.cilindraje))
			return false;
		if (idvehiculo != other.idvehiculo)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (tipoproductovehiculo == null) {
			if (other.tipoproductovehiculo != null)
				return false;
		} else if (!tipoproductovehiculo.equals(other.tipoproductovehiculo))
			return false;
		return true;
	}
	   
	   
	
}

