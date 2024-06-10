package uni.isw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name="tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tecnico;
    
    private String nombre;
    private String apellido;
    private Integer numArreglos;
    private Boolean disponibilidad;
//    private Incidencia[] theIncidencia;
//    private DiccionarioDeFallas theDiccionarioDeFallas;
//    private JefeDelArea theJefeDelArea;
//    private Repuesto[] theRepuesto;
}
