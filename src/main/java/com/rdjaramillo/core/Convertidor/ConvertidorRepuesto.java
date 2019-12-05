package com.rdjaramillo.core.Convertidor;

import java.util.List;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

import com.rdjaramillo.core.Entity.Repuesto;
import com.rdjaramillo.core.Model.*;

@Component("convertidorrespuesto")
public class ConvertidorRepuesto {
	
	public List<MRepuesto> convertirListaRepuesto(List<Repuesto> repuestos) {
		List<MRepuesto> mrepuestos = new ArrayList<>();
		for (Repuesto repuesto : repuestos) {
			mrepuestos.add(new MRepuesto(repuesto));
		}
		return mrepuestos;
	}
	/*
	 * public List<MRepuesto> convertirListaRupuesto(List<Repuesto> repuestos){
	 * List<MRepuesto> mrepuestos = new ArrayList<>(); for (Repuesto repuesto
	 * :repuestos ){ mrepuestos.add(new MRepuesto(repuesto)); } return mrepuestos; }
	 * 
	 */
}
