package com.rdjaramillo.core.Controller;
/*
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdjaramillo.core.Entity.Producto;
import com.rdjaramillo.core.Model.MProducto;
import com.rdjaramillo.core.Service.ProductoService;


@RestController
@RequestMapping("/v1")
public class ProductoController {

	
	@Autowired
	@Qualifier("servicioproducto")
	ProductoService servicioproducto;
	
	@PutMapping("/apiproducto")
	public boolean agregarvehiculo(@RequestBody @Valid Producto producto) {
		return servicioproducto.crear(producto);

	}
	@PostMapping("/apiproducto")
	public boolean actualizarvehiculo(@RequestBody @Valid Producto producto) {
	return servicioproducto.actualziar(producto);
	}
	
	@DeleteMapping("/apiproducto/{idproducto}/{nombreproducto}")
	public boolean borrarvehiculo(@PathVariable("idproducto") long idproducto,
							@PathVariable("nombreproducto") String nombreproducto) {
	return servicioproducto.borrar(idproducto, nombreproducto);
	}
	
	@GetMapping("/apiproductos")
	public List<MProducto> obtenerVehiculos(){
		return servicioproducto.obtener();
	}
	
}
*/