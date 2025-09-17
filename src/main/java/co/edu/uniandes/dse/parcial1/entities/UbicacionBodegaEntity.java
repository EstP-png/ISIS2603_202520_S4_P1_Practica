package co.edu.uniandes.dse.parcial1.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.OneToMany;

@Data
@Entity
public class UbicacionBodegaEntity extends BaseEntity{
   
    private Integer numeroEstante;
    private String canasta;
    private Double pesoMax;    

    @PodamExclude
    @OneToMany
    private List<MercanciaEntity> mercancia = new ArrayList<>();
}
