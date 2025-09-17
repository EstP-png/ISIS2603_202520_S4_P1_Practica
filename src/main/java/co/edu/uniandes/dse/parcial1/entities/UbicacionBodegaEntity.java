package co.edu.uniandes.dse.parcial1.entities;

import jakarta.persistence.Entity;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.ManyToOne;

@Data
@Entity
public class UbicacionBodegaEntity extends BaseEntity{
   
    private Integer numeroEstante;
    private String canasta;
    private Double pesoMax;    

    @PodamExclude
    @ManyToOne
    private MercanciaEntity mercancia;
}
