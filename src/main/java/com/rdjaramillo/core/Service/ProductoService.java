package com.rdjaramillo.core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rdjaramillo.core.Convertidor.ConvertidorProducto;
import com.rdjaramillo.core.Entity.Producto;
import com.rdjaramillo.core.Model.MProducto;
import com.rdjaramillo.core.Repository.ProductoRepository;


@Service("servicioproducto")
public class ProductoService {
	
	@Autowired
	@Qualifier("repositorioproducto")
	private ProductoRepository repositorioproducto;

	@Autowired
	@Qualifier("convertidorproducto")
	private ConvertidorProducto convertidorproducto;

	

	public boolean crear(Producto producto) {
		try {
			repositorioproducto.save(producto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public boolean actualziar(Producto producto) {
		try {
			repositorioproducto.save(producto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/*public abstract Producto findByIdproducto(long idproducto)*/

	public boolean borrar(long idproducto,String nombreproducto) {
		try {
			Producto producto = repositorioproducto.findByIdproductoAndNombreproducto(idproducto, nombreproducto);
			repositorioproducto.delete(producto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/*public abstract List<Producto>findByIdproductos (long idproducto);*/
	public List<MProducto> obtener(){
		return convertidorproducto.convertirListasProductos(repositorioproducto.findAll());
	}

}
