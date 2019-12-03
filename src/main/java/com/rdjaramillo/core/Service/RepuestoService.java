package com.rdjaramillo.core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rdjaramillo.core.Convertidor.ConvertidorRepuesto;
import com.rdjaramillo.core.Entity.Repuesto;
import com.rdjaramillo.core.Model.MRepuesto;
import com.rdjaramillo.core.Repository.RepuestoRepository;

@Service("serviciorepuesto")
public class RepuestoService {

	@Autowired
	@Qualifier("repositoriorepuesto")
	private RepuestoRepository repositoriorepuesto;

	@Autowired
	@Qualifier("convertidorrespuesto")
	private ConvertidorRepuesto convertidorrespuesto;

	public boolean crear(Repuesto repuesto) {
		try {
			repositoriorepuesto.save(repuesto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean actualziar(Repuesto repuesto) {
		try {
			repositoriorepuesto.save(repuesto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/* public abstract Repuesto findByIdrepuesto(long idrepuesto); */

	public boolean borrar(long idrepuesto) {
		try {
			Repuesto repuesto = repositoriorepuesto.findByIdrepuesto(idrepuesto);
			repositoriorepuesto.delete(repuesto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<MRepuesto> obtener() {

		return convertidorrespuesto.convertirListaRepuesto(repositoriorepuesto.findAll());
	}

}
