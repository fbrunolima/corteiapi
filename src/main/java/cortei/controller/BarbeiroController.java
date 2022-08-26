package cortei.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cortei.dto.BarbeiroDTO;
import cortei.service.BarbeiroService;

@RestController
@RequestMapping("/api/barbeiros")
public class BarbeiroController {

	private BarbeiroService barbeiroService;

	@PostMapping
	public ResponseEntity salvar(@RequestBody BarbeiroDTO dto) {
		barbeiroService.inserirBarbeiro(dto);
		return new ResponseEntity(dto, HttpStatus.CREATED);
	}

}
