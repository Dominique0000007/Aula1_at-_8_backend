package PerfurmeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PerfumesModel.PerfumeModel;
import com.example.PerfumesRepository.PerfumeRepository;

@RestController
@ResquestMapping("api")
public class PerfurmeController {
	
	@Autowired
	PerfumeRepository repo;
	
	@GetMapping
	public ResponseEntity<List<PerfumeModel>> Buscar(){
	List <PerfumeModel> Lista = repo.findAll();
	return ResponseEntity.ok(Lista);
	}

}
