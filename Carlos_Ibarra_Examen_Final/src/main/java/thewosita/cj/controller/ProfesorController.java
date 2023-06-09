package thewosita.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thewosita.cj.Services.ProfesorService;
import thewosita.cj.modals.Profesor;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	@Autowired
	private ProfesorService profeS;
	
	@GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProductos() {
        return new ResponseEntity<>(profeS.findByAll(),
                HttpStatus.OK);
    }
	
	//Arreglar
 /*   @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProfesor(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profeS.save(p),
                HttpStatus.CREATED);
    }*/
    
	@PostMapping("/crear")
	public Profesor create(@Validated @RequestBody Profesor p) {
		return profeS.save(p);
	}
    
    

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProducto(@PathVariable String id, @RequestBody Profesor p) {
        Profesor personaENcontrada = profeS.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	//Arreglar
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setApellido(p.getApellido());
                personaENcontrada.setCelular(p.getCelular());
                personaENcontrada.setCorreo(p.getCorreo());
                personaENcontrada.setDireccion(p.getDireccion());
                
                return new ResponseEntity<>(profeS.save(p), HttpStatus.OK);
                
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
    

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProducto(@PathVariable String id) {
        profeS.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
