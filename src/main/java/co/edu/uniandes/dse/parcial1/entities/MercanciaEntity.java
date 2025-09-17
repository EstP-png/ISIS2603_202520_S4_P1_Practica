package co.edu.uniandes.dse.parcial1.entities;

import java.sql.Time;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class MercanciaEntity extends BaseEntity{
   
    private String nombre;

    private String codigoBarras;

    private Time fechaRecepcion;

    private Integer cantidadDisponible;
    

}
