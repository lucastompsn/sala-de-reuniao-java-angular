package com.crud.saladereuniao.saladereuniao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "meetingroom")
@Getter // Lombok gera todos os getters automaticamente
@Setter // Lombok gera todos os setters automaticamente
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "startHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    // Construtor sem parâmetros (necessário para JPA)
    public Room() {}

    // Construtor com parâmetros (se necessário em algum ponto)
    public Room(String name, String date, String startHour, String endHour) {
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", name=" + name + ", startHour=" + startHour + ", endHour=" + endHour + "]";
    }
}