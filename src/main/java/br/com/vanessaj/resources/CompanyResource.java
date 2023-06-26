package br.com.vanessaj.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vanessaj.entities.Company;

@RestController
@RequestMapping(value = "/companies")
public class CompanyResource {

	@GetMapping
	public ResponseEntity<List<Company>> findAll(){
		List<Company> list = new ArrayList<>();
		list.add(new Company(1L, "Americanas"));
		list.add(new Company(2l, "Natura"));
		return ResponseEntity.ok().body(list);
	}
	
	
}
