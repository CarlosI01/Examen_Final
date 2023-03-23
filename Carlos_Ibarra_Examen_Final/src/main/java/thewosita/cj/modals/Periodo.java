package thewosita.cj.modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Periodo")

public class Periodo {
	private String periodo;
	private int year;
}
