package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.species = "cat";
        pet.nickname = "Mestan";
        pet.age = 1;
        pet.trickLevel = 20;
        pet.habits = new String[]{"sleeping", "eating"};
        System.out.println(pet);


        Human mother = new Human("Nezaket", "Verdiyeva", 1980);
        Human father = new Human("Deyanet", "Verdiyev", 1975);
        Human child = new Human("Leyaqet", "Verdiyev", 1999, 75, pet, mother, father,
                new String[][]{{"Monday to Exercise"}});


        child.greetPet();
        child.describePet();
        pet.respond();
        pet.eat();
        System.out.println(child);




    }
}
