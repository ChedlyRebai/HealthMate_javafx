package com.example.learnjavafx.models;
import javafx.beans.property.*;
import java.time.LocalDateTime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Event {
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty name = new SimpleStringProperty();
    private StringProperty description = new SimpleStringProperty();
    private ObjectProperty<LocalDateTime> startDate = new SimpleObjectProperty<>();
    private ObjectProperty<LocalDateTime> endDate = new SimpleObjectProperty<>();
    private StringProperty lieu = new SimpleStringProperty();
    private IntegerProperty nbPlace = new SimpleIntegerProperty();
    private IntegerProperty placeDisponible = new SimpleIntegerProperty();
    private StringProperty image = new SimpleStringProperty();
    private StringProperty qrCode = new SimpleStringProperty();
    private StringProperty createdAt = new SimpleStringProperty(LocalDateTime.now().toString());
    private ObservableList<User> participants = FXCollections.observableArrayList();


}
