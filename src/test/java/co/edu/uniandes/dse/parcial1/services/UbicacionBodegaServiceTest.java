package co.edu.uniandes.dse.parcial1.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import co.edu.uniandes.dse.parcial1.repositories.UbicacionBodegaRepository;
import jakarta.transaction.Transactional;

@DataJpaTest
@Transactional
@Import(UbicacionBodegaService.class)
public class UbicacionBodegaServiceTest {

@Autowired
UbicacionBodegaService ubService;   

   @Test
    void testCrearMercancia(){
        

    }

    @Test
    void testCrearMercanciaFail(){

        
    }
}
