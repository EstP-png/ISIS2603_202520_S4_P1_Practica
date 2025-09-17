package co.edu.uniandes.dse.parcial1.services;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.parcial1.entities.UbicacionBodegaEntity;
import co.edu.uniandes.dse.parcial1.repositories.UbicacionBodegaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UbicacionBodegaService {

    @Autowired
    UbicacionBodegaRepository UbicacionRepo;
    
    @Transactional
    public UbicacionBodegaEntity createUbicacionBodega(UbicacionBodegaEntity ubicacion) throws InvalidParameterException{
        log.info("Inicia proceso de crear un lugar");
        if(ubicacion.getNumeroEstante() <= 0){
            throw new InvalidParameterException("El numero del estante es invalido");

        }
        return UbicacionRepo.save(ubicacion);

    }
}
