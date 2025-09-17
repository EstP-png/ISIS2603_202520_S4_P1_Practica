package co.edu.uniandes.dse.parcial1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.parcial1.entities.MercanciaEntity;
import co.edu.uniandes.dse.parcial1.entities.UbicacionBodegaEntity;
import co.edu.uniandes.dse.parcial1.exceptions.EntityNotFoundException;
import co.edu.uniandes.dse.parcial1.repositories.MercanciaRepository;
import co.edu.uniandes.dse.parcial1.repositories.UbicacionBodegaRepository;
import lombok.extern.slf4j.Slf4j;
import java.util.Optional;

@Slf4j
@Service
public class MercanciaUbicacionBodegaService {

    @Autowired
    MercanciaRepository mercRepo;

    @Autowired
    UbicacionBodegaRepository ubicacionRepo;

    public MercanciaEntity addMercancia(Long mercID, Long ubiID) throws EntityNotFoundException{
        log.info("Inicia poceso de agregar mercancia = {} a la ubicacion = {}");

    Optional<MercanciaEntity> mercancia = mercRepo.findById(mercID);
    if(mercancia.isEmpty()){

        throw new EntityNotFoundException("No se encontró mercancia con el ID dado");
    }
    Optional<UbicacionBodegaEntity> ubicacion = ubicacionRepo.findById(ubiID);
        if(ubicacion.isEmpty()){

        throw new EntityNotFoundException("No se encontró ubicacion con el ID dado");
    }

    mercancia.get().setUbicacion(ubicacion.get());
    ubicacion.get().getMercancia().add(mercancia.get());

    log.info("Termina poceso de agregar mercancia = {} a la ubicacion = {}");


    return mercancia.get();

    }


}
