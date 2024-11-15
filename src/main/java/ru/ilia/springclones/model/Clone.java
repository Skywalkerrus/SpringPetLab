package ru.ilia.springclones.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="clones")
public class Clone {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Integer number;
    private String nickname;
    private Integer battalion;

    public Clone(Integer number)
    {
        this.number = number;
    }
    public void cloneArrived() //метод для перегрузки
    {
        System.out.println("CT-" + number + " is arrived!");
    }

    public void cloneArrived(String specialClone) { // перегруженный метод, для отдельного случая с спец клонами
        System.out.println(specialClone + "CT-" + number + " is arrived!");
    }
}