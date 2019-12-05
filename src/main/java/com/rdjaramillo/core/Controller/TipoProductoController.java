package com.rdjaramillo.core.Controller;

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

import com.rdjaramillo.core.Entity.TipoProducto;
import com.rdjaramillo.core.Model.MTipoProducto;
import com.rdjaramillo.core.Service.TipoProductoService;

@RestController
@RequestMapping("/v1")
public class TipoProductoController {
	
	@Autowired
	@Qualifier("serviciotipoproducto")
	TipoProductoService serviciotipoproducto;
	
	
	@PutMapping("/apitipoproducto")
	public boolean agregartiposprocutos(@RequestBody @Valid TipoProducto tipoproducto) {
		return serviciotipoproducto.crear(tipoproducto);

	}
	@PostMapping("/apitipoproducto")
	public boolean actualizartiposproductos(@RequestBody @Valid TipoProducto tipoproducto) {
	return serviciotipoproducto.actualziar(tipoproducto);
	}
	
	
	@DeleteMapping("/apitipoproducto/{idtipoproducto}")
	public boolean borrartiposproductos(@PathVariable("idtipoproducto") long idtipoproducto) {
			return serviciotipoproducto.borrar(idtipoproducto);
	}
	
	
	@GetMapping("/apitiposproductos")
	public List<MTipoProducto> obtenerTiposProductos(){
		return serviciotipoproducto.obtener();
	}
}
