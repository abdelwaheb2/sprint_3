package com.abdelwaheb.examens.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abdelwaheb.examens.entities.Examen;
import com.abdelwaheb.examens.service.ExamenService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ExamenRESTController {
	@Autowired
	ExamenService examenService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Examen> getAllExamens() {
	return examenService.getAllExamens();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Examen getExamenById(@PathVariable("id") Long id) {
	return examenService.getExamen(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Examen createProduit(@RequestBody Examen ex) {
	return examenService.saveExamen(ex);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Examen updateProduit(@RequestBody Examen produit) {
	return examenService.updateExamen(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		examenService.deleteExamenById(id);
	}
	
	@RequestMapping(value="/examenmat/{idMat}",method = RequestMethod.GET)
	public List<Examen> getProduitsByMatId(@PathVariable("idMat") Long id) {
	return examenService.findByMatiereId(id);
	}

}
