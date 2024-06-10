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
@Table(name = "incidencia")
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long incidencia_id;
    private String descripcion;
    private Date fecha;
    private Time hora;
    //private String estado;
    private String gravedad;
    //private Long idTecnico;
    private Long usuario_id;
    //private Long idEquipo;
    // private Usuario[] usuarios;
    // private Imagen imagen;
}
