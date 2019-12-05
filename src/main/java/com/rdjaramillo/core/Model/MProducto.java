package com.rdjaramillo.core.Model;

import com.rdjaramillo.core.Entity.Consecionario;
import com.rdjaramillo.core.Entity.PedidoCliente;
import com.rdjaramillo.core.Entity.Producto;
import com.rdjaramillo.core.Entity.Repuesto;
import com.rdjaramillo.core.Entity.Vehiculo;

public class MProducto {

	
	public MProducto() {}

	private long idproducto;
	private String nombreproducto;
	private Vehiculo fkvehiculoproducto;
	private Repuesto fkrepuestoproducto;
	private PedidoCliente  pedidocliente;
	private Consecionario fkconsecionario;
	
	
	
	public MProducto(Producto producto) {
		this.idproducto = producto.getIdproducto();
		this.nombreproducto = producto.getNombreproducto();
		this.fkvehiculoproducto = producto.getFkvehiculoproducto();
		this.fkrepuestoproducto = producto.getFkrepuestoproducto();
		this.pedidocliente = producto.getPedidocliente();
		this.fkconsecionario = producto.getFkconsecionario();
	}
	
	public MProducto(long idproducto, String nombreproducto, Vehiculo fkvehiculoproducto, Repuesto fkrepuestoproducto,
			PedidoCliente pedidocliente, Consecionario fkconsecionario) {
		this.idproducto = idproducto;
		this.nombreproducto = nombreproducto;
		this.fkvehiculoproducto = fkvehiculoproducto;
		this.fkrepuestoproducto = fkrepuestoproducto;
		this.pedidocliente = pedidocliente;
		this.fkconsecionario = fkconsecionario;
	}

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
	public Repuesto getFkrepuestoproducto() {
		return fkrepuestoproducto;
	}
	public void setFkrepuestoproducto(Repuesto fkrepuestoproducto) {
		this.fkrepuestoproducto = fkrepuestoproducto;
	}
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
}

