package co.edu.uniandes.dse.parcial1.services;

import java.security.InvalidParameterException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniandes.dse.parcial1.entities.MercanciaEntity;
import co.edu.uniandes.dse.parcial1.repositories.MercanciaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MercanciaService {

    @Autowired
    MercanciaRepository mercanciaRepo;
    
    @Transactional
    public MercanciaEntity createMercancia(MercanciaEntity mercancia) throws InvalidParameterException {

        log.info("Inicia proceso de crear mercancia");

        if(mercancia.getNombre().isBlank() || mercancia.getNombre().isEmpty() || mercancia.getNombre() == null){

            throw new InvalidParameterException("El nombre del producto es invalido");

        }else if(mercancia.getCodigoBarras().isBlank() || mercancia.getCodigoBarras().isEmpty() || mercancia.getCodigoBarras() == null){

            throw new InvalidParameterException("El qr del producto es invalido");

        } else if (Duration.between( mercancia.getFechaRecepcion(), LocalDateTime.now()).isNegative()){
            throw new InvalidParameterException("La fecha del producto es invalida");

        }
        
        return mercanciaRepo.save(mercancia);
    
        

    }
    
    
    // TODO: Cree la lógica de creación de una mercancía
}
