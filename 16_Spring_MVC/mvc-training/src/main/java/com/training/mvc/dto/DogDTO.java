package com.training.mvc.dto;

/**
 * Created by adriana on 02.08.2016.
 */
public class DogDTO {

    public static DogDTO createInstance() {
        return new DogDTO();
    }

    private long id;

    private String name;

    private String breed;

    private int age;

    private float weight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
