package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class VetServiceTest {


    @Autowired
    private VetService vetService;

    @Test
    public void testUpdateVet(){

        String VET_NAME = "0001";
        String VET_LAST_NAME = "0001";

        String UP_VET_NAME = "0002";
        String UP_VET_LAST_NAME = "0002";

        Vet vet = new Vet(VET_NAME, VET_LAST_NAME);

        log.info(">" + vet);
        Vet vetCreated = this.vetService.create(vet);
        log.info(">>" + vetCreated);


        vetCreated.setFirstName(UP_VET_NAME);
        vetCreated.setLastName(UP_VET_LAST_NAME);

        Vet updateVet = this.vetService.update(vetCreated);
        log.info(">>>" + updateVet);

        assertEquals(UP_VET_NAME, updateVet.getFirstName());
        assertEquals(UP_VET_LAST_NAME, updateVet.getFirstName());

    }
}
