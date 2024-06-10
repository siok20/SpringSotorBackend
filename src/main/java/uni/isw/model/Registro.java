package uni.isw.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idresgistro;

    private Long idusuario;
    private Long idequipo;
    private String descripcionproblema;
    private Date fecharegistro;
    private Time horaregistro;
    private Long idregistrador; // Persona que registra la incidencia (puede ser técnico o personal de sistemas)
    //private Long idUsuario
    //private Long idIncidencia
}
