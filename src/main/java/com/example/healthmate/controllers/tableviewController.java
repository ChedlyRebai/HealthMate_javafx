package com.example.learnjavafx.controllers;


import com.example.learnjavafx.models.Person;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class tableviewController  implements Initializable  {

    @FXML
    private TextField country;

    @FXML
    private TextField fname;

    @FXML
    private TableColumn<Person, String> fnamel;

    @FXML
    private TableColumn<Person, String> lcountryl;

    @FXML
    private TextField lname;

    @FXML
    private TableColumn<Person, String> lnamel;

    @FXML
    private TableView<Person> table;

    @FXML
    private Button submitbtn;



    ObservableList<Person> initialData(){
        Person p1=new Person("chedly","rebai","tunisia");
        Person p2=new Person("karim","rebai","tunisia");
        Person p3=new Person("chedly","walid","tunisia");
        return FXCollections.observableArrayList(p1,p2,p3);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fnamel.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lnamel.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        lcountryl.setCellValueFactory(new PropertyValueFactory<>("country"));
        table.setEditable(true);
        table.setItems(initialData());
        editTable();
    }

    @FXML
    void insert(ActionEvent event) {
        Person newPerson = new Person(fname.getText(), lname.getText(), country.getText());
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || country.getText().isEmpty()) {
            Alert.AlertType alertType = Alert.AlertType.ERROR;
            String title = "One column is empty";
            String header = "One column is empty";
            String content = "One column is empty";
            Alert alert = new Alert(alertType);
            alert.setTitle(title);
            alert.setHeaderText(header);
            alert.setContentText(content);
            alert.showAndWait();

        }else{
            table.getItems().add(newPerson);
        }

        fname.clear();
        lname.clear();
        country.clear();
    }


    private void editTable() {
        fnamel.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        fnamel.setOnEditCommit(event ->{
            Person person =event.getTableView().getItems().get(event.getTablePosition().getRow());
            person.setFirstName(event.getNewValue());
            System.out.println(person.getFirstName());
        });

        lnamel.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        lnamel.setOnEditCommit(event ->{
            Person person =event.getTableView().getItems().get(event.getTablePosition().getRow());
            person.setLastName(event.getNewValue());
            System.out.println(person.getLastName());
        });

        lcountryl.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
        lcountryl.setOnEditCommit(event ->{
            Person person =event.getTableView().getItems().get(event.getTablePosition().getRow());
            person.setCountry(event.getNewValue());
        });

    }
}

