package com.training.mvc.controller;

import com.training.mvc.dto.DogDTO;
import com.training.mvc.service.DogService;
import com.training.mvc.service.DogViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogsController {

    @Autowired
    DogViewService dogViewService;

    @Autowired
    DogService dogService;

    @RequestMapping("")
    public List<DogDTO> listDogs() {
        return dogViewService.constructDTOlist(dogService.getAllDogs());
    }

    @RequestMapping("/{id}")
    public DogDTO getDog(@PathVariable("id") Long id) {
        return dogViewService.constructDTO(dogService.getDog(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public DogDTO saveDog(@RequestBody DogDTO dogDTO) {
        return dogViewService.constructDTO(dogService.saveDog(dogViewService.deconstructDTO(dogDTO)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public DogDTO updateDog(@RequestBody DogDTO dogDTO, @PathVariable Long id) {
        return dogViewService.constructDTO(dogService.updateDog(id, dogViewService.deconstructDTO(dogDTO)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteDog(@PathVariable("id") Long id) {
        dogService.removeDog(id);
        return "Done";
    }

}
