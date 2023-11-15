package com.tecsup.petclinic.mapper;

import com.tecsup.petclinic.domain.PetTO;
import com.tecsup.petclinic.domain.VetTO;
import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.entities.Vet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface VetMapper {

    @Mapping(source = "firstName", target="firstName")
    Vet toVet(VetTO vetTO);

    @Mapping(source = "firstName", target="firstName")
    VetTO toVetTO(Vet vet);



    List<VetTO> toVetTOList(List<Vet> vetList);
    List<Vet> toVetList(List<VetTO> vetTOList);

}
