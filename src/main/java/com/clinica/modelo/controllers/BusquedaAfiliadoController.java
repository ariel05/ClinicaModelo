package com.clinica.modelo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clinica.modelo.helper.ConstantsHelper;
import com.clinica.modelo.modelo.Afiliado;

@Controller
public class BusquedaAfiliadoController {

	@RequestMapping("/busquedaAfiliado")
	public String buscarAfiliado(Model model, @RequestParam String request, @RequestParam(required = false) String dni,
			@RequestParam(required = false) String nombre, @RequestParam(required = false) String apellido) {
		
		List<Afiliado> afiliados = new ArrayList<Afiliado>();
		afiliados.add(new Afiliado("Andres", "Ramirez", "36723898"));
		afiliados.add(new Afiliado("Marcos", "Rojo", "35123456"));
		
		List<Afiliado> afiliadosFiltrados = new ArrayList<Afiliado>();
		for(Afiliado a : afiliados) {
			if(dni != null && a.getDni().equals(dni)) {
				afiliadosFiltrados.add(a);
			}
			else if(nombre != null && apellido != null && nombre.trim().toLowerCase().equals(a.getNombre().trim().toLowerCase())
					&& apellido.trim().toLowerCase().equals(a.getApellido().trim().toLowerCase())) {
				afiliadosFiltrados.add(a);
			}
		}
		
		if(!afiliadosFiltrados.isEmpty()) {
			model.addAttribute("afiliados", afiliadosFiltrados);
		}
		
		if(request.equals(ConstantsHelper.ATENCION_AMBULATORIA))
			return "ambulatorio/atencionAmbulatoria";
		else if(request.equals(ConstantsHelper.SOLICITUD_INTERNACION))
			return "internacion/solicitudInternacion";
		
		return null;
	}
}
