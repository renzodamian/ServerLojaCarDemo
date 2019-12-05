package com.rdjaramillo.core.Convertidor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rdjaramillo.core.Entity.Producto;
import com.rdjaramillo.core.Model.MProducto;

@Component("convertidorproducto")
public class ConvertidorProducto {

	
	public List<MProducto> convertirListasProductos(List<Producto> productos){
		List<MProducto> mproductos  = new ArrayList<>();
		for (Producto producto : productos) {
			mproductos.add(new MProducto(producto));
		}
		return mproductos;
	}
}
