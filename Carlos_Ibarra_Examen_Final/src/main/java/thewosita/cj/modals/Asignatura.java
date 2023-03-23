package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Asignatura")

public class Asignatura {
	private String nombre;
	private int h_horas;
	private int h_horas_practicas;
	private int h_horas_automonas;
	
}
