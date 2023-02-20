package mugikortalde.mugikorrak.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import mugikortalde.mugikorrak.model.Mugikorra;
import mugikortalde.mugikorrak.model.MugikorrakRepository;

@RestController
@RequestMapping(path = "/mugikorrak")
public class MainController {
    @Autowired
    private MugikorrakRepository mugikorrakRepository;




    @GetMapping(path = "/mugikorguztiak")
	public @ResponseBody Iterable<Mugikorra> getMugikorGuztiak() {
		return mugikorrakRepository.findAll();
	}

    @GetMapping(path = "/mugikorbat/{marka}")
	public @ResponseBody Iterable<Mugikorra> getMugikorBat(@RequestParam String marka) {
		return mugikorrakRepository.findMarka(marka);
	}









    @PostMapping(path = "/mugikorberria") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String marka, @RequestParam String modeloa, @RequestParam int urtea, @RequestParam int ram, @RequestParam String sistema_eragilea, @RequestParam int memoria, @RequestParam String tamaina, @RequestParam String resoluzioa, @RequestParam String mota, @RequestParam List<String> ezaugarri_bereziBerri) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Mugikorra mugikorra = new Mugikorra();
		mugikorra.setMarka(marka);
        mugikorra.setModeloa(modeloa);
        mugikorra.setUrtea(urtea);
        mugikorra.setRam(ram);
        mugikorra.setSistema_eragilea(sistema_eragilea);
        mugikorra.setMemoria(memoria);
		mugikorra.setTamaina(tamaina);
        mugikorra.setResoluzioa(resoluzioa);
        mugikorra.setMota(mota);
        mugikorra.setEzaugarri_berezi(ezaugarri_bereziBerri);
		mugikorrakRepository.save(mugikorra);
		return "Saved";
	}
	
	@PutMapping(value = "/ezaugarri_bereziBerri/{modeloa}")
	public ResponseEntity<Mugikorra> updateMugikorra(@Valid @RequestBody String ezaugarri_bereziBerri, @PathVariable String modeloa) {
		try {
			Mugikorra mugikorra= mugikorrakRepository.findById(modeloa);
			List<String> ezaugarri_berezi=mugikorra.getEzaugarri_berezi();
			ezaugarri_berezi.add(ezaugarri_bereziBerri);
			mugikorra.setEzaugarri_berezi(ezaugarri_berezi);
			mugikorrakRepository.save(mugikorra);

			return ResponseEntity.ok().build();

		} catch (Exception ex) {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping(path = "/ezabatu/{mugikorraModeloa}")
	public ResponseEntity<Void> deleteMugikorra(@PathVariable String mugikorraModeloa) {
		try {
			long zenbat = mugikorrakRepository.delete(mugikorraModeloa);
			System.out.println("Ezabatutako mugikor kopurua🔆: "+zenbat);
			return ResponseEntity.ok().build();

		} catch (Exception ex) {
			System.out.println("Errorea " + mugikorraModeloa + " mugikorra ezabatzerakoan. ");
			return ResponseEntity.notFound().build();
		}
	}
}
