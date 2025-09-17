package co.edu.uniandes.dse.parcial1.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class UbicacionBodegaEntity extends BaseEntity{
   
    private Integer numeroEstante;
    private String canasta;
    private Double pesoMax;    
}
