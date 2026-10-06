package com.vuelo.aerolinea.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vuelo.aerolinea.entity.Vuelo;
import com.vuelo.aerolinea.repository.VueloRepository;
import com.vuelo.aerolinea.service.VueloImpl;



@RestController
@RequestMapping("/api/vuelos")
public class VueloController {
	@Autowired
	VueloImpl vuelo;
	@Autowired
	VueloRepository repositorio;

	
	@GetMapping
	public ResponseEntity<?>getVuelo(@RequestParam String codigoVuelo){
		Optional<Vuelo> opt = repositorio.findByCodigoVuelo(codigoVuelo);
		if (opt.isEmpty()){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error","Vuelo no encontrado"));
		}
		
		Vuelo v = opt.get();
		
		Map<String, Object> response = new LinkedHashMap<>();
		response.put("idVuelo", v.getId_vuelo());
		response.put("origen", v.getOrigen());
		response.put("destino", v.getDestino());
		response.put("codigo_vuelo", v.getCodigoVuelo());
		response.put("tarifa", v.getTarifa().stream().map(t->Map.of("categoria",t.getCategoria(),"monto",t.getMonto())
				).toList());
		return ResponseEntity.ok(response);
	}
	/*@GetMapping("/{id_codigo}")
	public Optional<Vuelo> buscar(@PathVariable Long id_codigo) {
		return vuelo.obtenerVuelo(id_codigo);
		
	}*/
}
