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
@Table(name="informe_tecnico")
public class InformeTecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_informe;

    private String detalleResolucion;  // Corrigiendo el nombre del campo
    private Date fechaRegistro;
    private String estado;
    private String codigoTecnico;
    private String codigoUsuario;
}
