package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Carrera")

public class Carrera {
	private String nombre;
	private String descripcion;
	private Periodo periodo;
}
