package com.training.mvc.service;

import com.training.mvc.model.Dog;

public interface DogService {
    Iterable<Dog> getAllDogs();

    Dog getDog(long id);

    Dog updateDog(long id, Dog dog);

    Dog saveDog(Dog dog);

    void removeDog(long id);
}
