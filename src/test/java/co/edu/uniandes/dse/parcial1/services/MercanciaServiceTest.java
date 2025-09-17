package co.edu.uniandes.dse.parcial1.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import co.edu.uniandes.dse.parcial1.entities.MercanciaEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@DataJpaTest
@Transactional
@Import(MercanciaService.class)
public class MercanciaServiceTest {
    
    @Autowired
    MercanciaService mercServ;

    @PersistenceContext
    private EntityManager entityManager;
    private PodamFactory factory = new PodamFactoryImpl();
    private List<MercanciaEntity> mercList = new ArrayList<>();

    
        @BeforeEach
    void setUp() {
        clearData();
        insertData();
    }

        private void clearData() {
        entityManager.createQuery("delete from MercanciaEntity").executeUpdate();
        mercList.clear();
    }

    private void insertData() {
        for (int i = 0; i < 3; i++) {
            MercanciaEntity mercancia = new MercanciaEntity();
            mercancia.setCantidadDisponible(i);
            mercancia.setCodigoBarras("Codigo" + i);
            mercancia.setNombre("Nombre" + i);
            entityManager.persist(mercancia);
            mercList.add(mercancia);
        }
    }

    @Test
    void testCrearMercancia(){


    }

    @Test
    void testCrearMercanciaFail(){

        
    }
    
}
