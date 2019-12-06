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

import com.rdjaramillo.core.Entity.Repuesto;
import com.rdjaramillo.core.Model.MRepuesto;
import com.rdjaramillo.core.Service.RepuestoService;

@RestController
@RequestMapping("/v1")
public class RepuestoController {
	
	@Autowired
	@Qualifier("serviciorepuesto")
	RepuestoService serviciorepuesto;
	
	
	@PutMapping("/apirepuesto")
	public boolean agregarrepuesto(@RequestBody @Valid Repuesto repuesto) {
		return serviciorepuesto.crear(repuesto);

	}
	@PostMapping("/apirepuesto")
	public boolean actualizarrepuesto(@RequestBody @Valid Repuesto repuesto) {
	return serviciorepuesto.actualziar(repuesto);
	}
	
	
	@DeleteMapping("/apirepuesto/{idrepuesto}")
	public boolean borrarrepuesto(@PathVariable("idrepuesto") long idrepuesto) {
			return serviciorepuesto.borrar(idrepuesto);
	}
	
	
	@GetMapping("/apirepuestos")
	public List<MRepuesto> obtenerRepuestos(){
		return serviciorepuesto.obtener();
	}

}*/
