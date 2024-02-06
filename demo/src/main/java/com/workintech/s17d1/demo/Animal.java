package com.workintech.s17d1.demo;

public class Animal {

    private String animal;
    private int id;

    public Animal(String animal, int id) {
        this.animal = animal;
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", id=" + id +
                '}';
    }
}
