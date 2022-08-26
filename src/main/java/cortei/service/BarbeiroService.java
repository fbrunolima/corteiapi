package cortei.service;

import cortei.dto.BarbeiroDTO;
import cortei.entity.BarbeiroEntity;
import cortei.repository.BarbeiroRepository;

public class BarbeiroService {

	private BarbeiroRepository barbeiroRepo;

	public void inserirBarbeiro(BarbeiroDTO barbeirodto) {
		BarbeiroEntity barbeiro = new BarbeiroEntity(barbeirodto.getNomeBarbeiro(), barbeirodto.getSenhaBarbeiro());
		barbeiroRepo.save(barbeiro);
		return;
	}

}
