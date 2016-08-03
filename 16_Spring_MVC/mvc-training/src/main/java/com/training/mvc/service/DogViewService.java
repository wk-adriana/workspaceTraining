package com.training.mvc.service;

import com.training.mvc.dto.DogDTO;
import com.training.mvc.model.Dog;

import java.util.List;

public interface DogViewService {
    DogDTO constructDTO(Dog dog);

    Dog deconstructDTO(DogDTO dogDTO);

    List<DogDTO> constructDTOlist(Iterable<Dog> dogs);

}
