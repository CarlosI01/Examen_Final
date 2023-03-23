package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "Ciclo")
public class Ciclo {
	private String nombre;
	private String descripcion;
	private Carrera carrera;
}
