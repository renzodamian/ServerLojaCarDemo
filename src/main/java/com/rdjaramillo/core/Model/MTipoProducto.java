package com.rdjaramillo.core.Model;

import com.rdjaramillo.core.Entity.TipoProducto;

public class MTipoProducto {

	public MTipoProducto() {}
	
	
	public MTipoProducto(TipoProducto tipoproducto) {
		this.idtipoproducto = tipoproducto.getIdtipoproducto();
		this.nombretipoproducto = tipoproducto.getNombretipoproducto();
	}
	
	
	public MTipoProducto(long idtipoproducto, String nombretipoproducto) {
		this.idtipoproducto = idtipoproducto;
		this.nombretipoproducto = nombretipoproducto;
	}


	private long idtipoproducto;
	private String nombretipoproducto;
	
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
	
}
