package com.rdjaramillo.core.Convertidor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rdjaramillo.core.Entity.TipoProducto;
import com.rdjaramillo.core.Model.MTipoProducto;



@Component("convertidotipoproducto")
public class ConvertidorTipoProducto {

	
	public List<MTipoProducto> convertirListaTipoProducto(List<TipoProducto> tiposproductos){
		List<MTipoProducto> mtiposproductos = new ArrayList<>();
		for	(TipoProducto tipoproducto : tiposproductos) {
			mtiposproductos.add(new MTipoProducto (tipoproducto));
		}
		
		return mtiposproductos;
	}
}
