package com.company;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][2];

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother='" + mother.name + " " + mother.surname + '\'' +
                ", father='" + father.name + " " + father.surname + '\'' +
                '}';
    }

    public Human() {
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet() {
        System.out.println("Hello," + pet.nickname);
    }

    public void describePet() {
        String slyLevel = "";
        if (pet.trickLevel >= 50) {
            slyLevel = "he is very sly";
        } else
            slyLevel = "almost not sly";
        System.out.println(" I have a, " + pet.species + " he is " + pet.age + " years old " + slyLevel);

    }

}
