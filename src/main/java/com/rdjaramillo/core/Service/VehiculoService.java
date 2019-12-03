package com.rdjaramillo.core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rdjaramillo.core.Convertidor.Convertidor;
import com.rdjaramillo.core.Entity.Vehiculo;
import com.rdjaramillo.core.Model.MVehiculo;
import com.rdjaramillo.core.Repository.VehiculoRepository;

@Service("serviciovehiculo")
public class VehiculoService {
	@Autowired
	@Qualifier("repositoriovehiculo")
	private VehiculoRepository repositoriovehiculo;
	
	@Autowired
	@Qualifier("convertidorvehiculo")
	private Convertidor convertidorvehiculo;
	
	public boolean crear (Vehiculo vehiculo) {
		try {
			repositoriovehiculo.save(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean actualziar (Vehiculo vehiculo) {
		try {
			repositoriovehiculo.save(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean borrar (String modelo,long idvehiculo) {
		try {
			Vehiculo vehiculo = repositoriovehiculo.findByModeloAndIdvehiculo(modelo, idvehiculo);
			repositoriovehiculo.delete(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public List<MVehiculo>obtener(){
		
		return convertidorvehiculo.convertirLista(repositoriovehiculo.findAll());
	}
	
	
	/*public abstract Vehiculo findByMarca(String marca);*/
	
	public MVehiculo obtenerPorMarca(String marca){
		
		return new MVehiculo(repositoriovehiculo.findByMarca(marca));
	}
	
	
	
	
	
	
}
