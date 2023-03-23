package thewosita.cj.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import thewosita.cj.modals.Profesor;
import thewosita.cj.repositories.ProfesorDAO;
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, String> implements ProfesorService{
	@Autowired
	private ProfesorDAO profeD;

	@Override
	public CrudRepository<Profesor, String> getDao() {
		return profeD;
	}

}
