package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univ.rouen.stbserver.model.STB;

@RestController
public class GETController {
	@GetMapping("/resume")
	public String getListSTBinXML() {
		return "Envoi de la liste des STB";
	}
	@GetMapping("/id")
	public String getSTBinXML(@RequestParam(value = "name") String texte) {
		return ("Détail de la STB demandée : " + texte);
	}
	@GetMapping("/test")
	public String test(@RequestParam(value = "nb") Number nombre, @RequestParam(value = "texte") String text) {
		return ("Test: \n" + "id = " + nombre + "\n" + "titre = " + text);
	}
	
	@RequestMapping(value = "/xml")
	public @ResponseBody STB getXML() {
		STB stb = new STB("Test STB", 1, "2020/03/23", "Test JAXB");
		return stb;
	}
	
}