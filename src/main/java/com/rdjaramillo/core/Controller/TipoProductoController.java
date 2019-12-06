package com.rdjaramillo.core.Controller;

import java.util.List;
import java.util.Optional;

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
import com.rdjaramillo.core.Repository.TipoProductoRepository;

import javassist.NotFoundException;


@RestController
@RequestMapping("/v1")
public class TipoProductoController {
	
	@Autowired
	@Qualifier("repositoriotipoproducto")
	TipoProductoRepository repositoriotipoproducto;
	
	@PostMapping("/apitipoproducto")
	public TipoProducto agregartiposprocutos(@RequestBody @Valid TipoProducto tipoproducto) {
		return repositoriotipoproducto.save(tipoproducto);

	}
	
	@PutMapping("/apitipoproducto/{idtipoproducto}")
	public TipoProducto actualizartiposproductos(@PathVariable Long idtipoproducto,
											@RequestBody @Valid TipoProducto tipoproductoactualziado) throws NotFoundException{
	        return repositoriotipoproducto.findById(idtipoproducto)
	                .map(tipoproducto -> {
	                	tipoproducto.setNombretipoproducto(tipoproductoactualziado.getNombretipoproducto());
	                     return repositoriotipoproducto.save(tipoproducto);
	                }).orElseThrow(() -> new NotFoundException("Student not found with id " + idtipoproducto));
    }          
		
	@DeleteMapping("/apitipoproducto/{idtipoproducto}")
	public String borrartiposproductos(@PathVariable Long idtipoproducto) throws NotFoundException {
	        return repositoriotipoproducto.findById(idtipoproducto)
	                .map(tipoproducto -> {
	                	repositoriotipoproducto.delete(tipoproducto);
	                    return "Delete Successfully!";
	                }).orElseThrow(() -> new NotFoundException("Student not found with id " + idtipoproducto));
	 }
	@GetMapping("/apitiposproductos")
	public List<TipoProducto> getAllTipoProductos(){
		return repositoriotipoproducto.findAll();
	}
	
	@GetMapping("/apitiposproductos/{idtipoproducto}")
	  public TipoProducto getTipoProductoByID(@PathVariable Long idtipoproducto) throws NotFoundException{
	      Optional<TipoProducto> optTipoproducto = repositoriotipoproducto.findById(idtipoproducto);
	      if(optTipoproducto.isPresent()) {
	        return optTipoproducto.get();
	      }else {
	        throw new NotFoundException("Student not found with id " + idtipoproducto);
	      }
	    }
}
