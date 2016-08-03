package com.training.mvc.service.impl;

import com.training.mvc.model.Dog;
import com.training.mvc.repository.DogRepository;
import com.training.mvc.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public Iterable<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    @Override
    public Dog getDog(long id) {
        return dogRepository.findOne(id);
    }

    @Override
    public Dog updateDog(long id, Dog dog) {
        Dog dogDbImage = getDog(id);
        if (dogDbImage != null) {
            dog.setId(dogDbImage.getId());
            return dogRepository.save(dog);
        }
        return null;
    }

    @Override
    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public void removeDog(long id) {
        Dog dog = getDog(id);
        if (dog != null) {
            dogRepository.delete(dog);
        }
    }
}
