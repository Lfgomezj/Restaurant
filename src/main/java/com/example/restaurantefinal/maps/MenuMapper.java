package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.ResponseMenuDTO;
import com.example.restaurantefinal.entities.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMapper {
    @Mappings({
            @Mapping(source = "nameMenu", target = "nameMenu"),
            @Mapping(source = "price", target= "price"),
             @Mapping(source = "url", target= "url"),
            @Mapping(source = "description",target = "description"),
            @Mapping(source = "campus",target = "campus"),
    })
    ResponseMenuDTO toMenuDTO (Menu menu);
    List<ResponseMenuDTO> toMenusDTO(List<Menu>menus);

}
