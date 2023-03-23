package thewosita.cj.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Profesor")
public class Profesor {
	@Id
	private String Id_Profesor;
	
	private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;
    private Ciclo ciclo;
    private Asignatura asignatura;
}
