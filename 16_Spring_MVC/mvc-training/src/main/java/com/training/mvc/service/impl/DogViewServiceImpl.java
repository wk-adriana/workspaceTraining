package com.training.mvc.service.impl;

import com.training.mvc.dto.DogDTO;
import com.training.mvc.model.Dog;
import com.training.mvc.service.DogViewService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogViewServiceImpl implements DogViewService {

    @Override
    public DogDTO constructDTO(Dog dog) {
        if (dog != null) {
            DogDTO dogDTO = new DogDTO();
            dogDTO.setId(dog.getId());
            dogDTO.setName(dog.getName());
            dogDTO.setBreed(dog.getBreed());
            dogDTO.setWeight(dog.getWeight());
            dogDTO.setAge(dog.getAge());
            return dogDTO;
        }
        return null;
    }

    @Override
    public Dog deconstructDTO(DogDTO dogDTO) {
        if (dogDTO != null) {
            Dog dog = new Dog();
            dog.setId(dogDTO.getId());
            dog.setName(dogDTO.getName());
            dog.setBreed(dogDTO.getBreed());
            dog.setWeight(dogDTO.getWeight());
            dog.setAge(dogDTO.getAge());
            return dog;
        }
        return null;
    }

    @Override
    public List<DogDTO> constructDTOlist(Iterable<Dog> dogs) {
        List<DogDTO> list = new ArrayList<>();
        for (Dog dog: dogs) {
            list.add(constructDTO(dog));
        }
        return list;
    }
}
