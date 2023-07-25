package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.ReclamationResponseDTO;
import com.example.restaurantefinal.dto.ResponseMenuDTO;
import com.example.restaurantefinal.entities.Menu;
import com.example.restaurantefinal.entities.Reclamation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface ReclamationMapper {
    @Mappings({
            @Mapping(source = "campus", target="campus"),
            @Mapping(source = "state", target="state"),
            @Mapping(source = "reason", target="reason"),
    })
    ReclamationResponseDTO toReclamationDTO (Reclamation reclamation);
    List<ReclamationResponseDTO> toReclamationsDTO(List<Reclamation>reclamation);

}




