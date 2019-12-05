package com.rdjaramillo.core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.rdjaramillo.core.Convertidor.ConvertidorTipoProducto;
import com.rdjaramillo.core.Entity.TipoProducto;
import com.rdjaramillo.core.Model.MTipoProducto;
import com.rdjaramillo.core.Repository.TipoProductoRepository;

@Service("serviciotipoproducto")
public class TipoProductoService {
	
	
	@Autowired
	@Qualifier("repositoriotipoproducto")
	private TipoProductoRepository repositoriotipoproducto;

	@Autowired
	@Qualifier("convertidotipoproducto")
	private ConvertidorTipoProducto convertidotipoproducto;
	
	public boolean crear(TipoProducto tipoproducto) {
		try {
			repositoriotipoproducto.save(tipoproducto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean actualziar(TipoProducto tipoproducto) {
		try {
			repositoriotipoproducto.save(tipoproducto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/*public abstract TipoProducto findByIdtipoproducto(long idtipoproducto);*/

	public boolean borrar(long idtipoproducto) {
		try {
			TipoProducto tipoproducto = repositoriotipoproducto.findByIdtipoproducto(idtipoproducto);
			repositoriotipoproducto.delete(tipoproducto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public List<MTipoProducto> obtener(){
		return convertidotipoproducto.convertirListaTipoProducto(repositoriotipoproducto.findAll());
	}
	
	
}
