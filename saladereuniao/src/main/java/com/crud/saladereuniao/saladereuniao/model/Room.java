package com.crud.saladereuniao.saladereuniao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

@Entity
@Table(name="meetingroom")
public class Room {

    private long id;

    @Setter
    private String name;
    private String date;

    public Room() {

    }

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "date", nullable = false)
    public String getDate() {
        return date;
    }

    @Column(name = "starHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    @Override
    public String toString() {
        return "Room [id" + id + ",name=" + name + ",startHour=" + startHour + ",endHour=" + endHour + "]";
    }

    @Setter
    private String startHour;
    private String endHour;

    public void setDate(String date) {
    }

    public void setEndHour(String endHour) {
    }

    public void setName(String name) {
    }

    public void setStartHour(String startHour) {
    }
}