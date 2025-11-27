package eu.chrost.day4.s4libraries.lectures;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marcin", "Chrost", 43);
        System.out.println(person);

        //Zadanie - zamienic obiekt person na JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println("JSON: " + json);

        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("Person from JSON: " + personFromJson);

        System.out.println("person equals personFromJson: " + person.equals(personFromJson));
    }
}
