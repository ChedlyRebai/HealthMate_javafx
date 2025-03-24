package com.example.learnjavafx.data;

import com.example.learnjavafx.models.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonData {

    public static ObservableList<Person> getPeople() {
        return FXCollections.observableArrayList(
                new Person("Alice", "chedly","tu"),
                new Person("Bob", "karim","tn"),
                new Person("Charlie", "mohammed","dd")
        );
    }
}
